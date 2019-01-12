import sys
import time
import threading
import Leap
from Leap import CircleGesture, KeyTapGesture, ScreenTapGesture, SwipeGesture

class LeapFinger():
    def __init__(self, finger=None):
        self.boneNames = ['metacarpal',
                          'proximal',
                          'intermediate',
                          'distal']
        for boneName in self.boneNames:
            setattr(self, boneName, [0.0, 0.0, 0.0])
        self.tip = [0.0, 0.0, 0.0]

        self.leapBoneNames = [Leap.Bone.TYPE_METACARPAL,
                              Leap.Bone.TYPE_PROXIMAL,
                              Leap.Bone.TYPE_INTERMEDIATE,
                              Leap.Bone.TYPE_DISTAL]

        if finger is not None:
            self.importFinger(finger)

    def importFinger(self, finger):
        for boneName in self.boneNames:
            bone = finger.bone(getattr(Leap.Bone, 'TYPE_%s' % boneName.upper()))
            setattr(self, boneName, bone.prev_joint.to_float_array())
        self.tip = finger.bone(Leap.Bone.TYPE_DISTAL).next_joint.to_float_array()



class LeapInterface(Leap.Listener):
    def on_init(self, controller):
        self.hand           = [0,0,0]
        self.right_hand = False
        self.left_hand = False
        self.hand_direction = [0,0,0]
        self.hand_normal    = [0,0,0]
        self.hand_palm_pos  = [0,0,0]
        self.hand_pitch     = 0.0
        self.hand_yaw       = 0.0
        self.hand_roll      = 0.0
        self.fingerNames = ['thumb', 'index', 'middle', 'ring', 'pinky']
        for fingerName in self.fingerNames:
            setattr(self, fingerName, LeapFinger())
        print "Initialized Leap Motion Device"

        self.elbow = [0,0,0]
        self.wrist = [0,0,0]
        self.arm_direction = [0,0,0]

        self.time = 0.0
        self.frame = None

    def on_connect(self, controller):
        print "Connected to Leap Motion Controller"

        controller.enable_gesture(Leap.Gesture.TYPE_CIRCLE);
        controller.enable_gesture(Leap.Gesture.TYPE_KEY_TAP);
        controller.enable_gesture(Leap.Gesture.TYPE_SCREEN_TAP);
        controller.enable_gesture(Leap.Gesture.TYPE_SWIPE);

    def on_disconnect(self, controller):
        # Note: not dispatched when running in a debugger.
        print "Disconnected Leap Motion"

    def on_exit(self, controller):
        print "Exited Leap Motion Controller"

    def on_frame(self, controller):

        self.frame = controller.frame()
        if not self.frame.hands.is_empty: 
            there_is_right_hand=False
            there_is_left_hand=False

            for hand in self.frame.hands:

                if hand.is_right:
                    there_is_right_hand=True
                    self.right_hand=hand
                elif hand.is_left:
                    there_is_left_hand=True

                    self.left_hand=hand

            if not there_is_right_hand:
                self.right_hand=False

            if not there_is_left_hand:
                self.left_hand=False

            self.hand = self.frame.hands[0] 

            fingers = self.hand.fingers
            if not fingers.is_empty:
                for fingerName in self.fingerNames:
                    finger = fingers.finger_type(getattr(Leap.Finger, 'TYPE_%s' % fingerName.upper()))[0]
                    getattr(self, fingerName).importFinger(finger)

            normal = self.hand.palm_normal
            direction = self.hand.direction
            pos = self.hand.palm_position

            self.hand_direction[0] = direction.x
            self.hand_direction[1] = direction.y
            self.hand_direction[2] = direction.z
            self.hand_normal[0]    = normal.x
            self.hand_normal[1]    = normal.y
            self.hand_normal[2]    = normal.z
            self.hand_palm_pos[0]  = pos.x
            self.hand_palm_pos[1]  = pos.y
            self.hand_palm_pos[2]  = pos.z
            self.hand_pitch        = direction.pitch * Leap.RAD_TO_DEG
            self.hand_yaw          = normal.yaw * Leap.RAD_TO_DEG
            self.hand_roll         = direction.roll * Leap.RAD_TO_DEG

            arm = self.hand.arm
            self.elbow[0] = arm.elbow_position.x
            self.elbow[1] = arm.elbow_position.y
            self.elbow[2] = arm.elbow_position.z

            self.wrist[0] = arm.wrist_position.x
            self.wrist[1] = arm.wrist_position.y
            self.wrist[2] = arm.wrist_position.z

            self.arm_direction[0] = arm.direction.x
            self.arm_direction[1] = arm.direction.y
            self.arm_direction[2] = arm.direction.z

            self.time = self.frame.timestamp

    def get_hand_direction(self):
        return self.hand_direction

    def get_hand_normal(self):
        return self.hand_normal

    def get_hand_palmpos(self):
        return self.hand_palm_pos

    def get_hand_yaw(self):
        return self.hand_yaw

    def get_hand_pitch(self):
        return self.hand_pitch

    def get_hand_roll(self):
        return self.hand_roll

    def get_finger_point(self, fingerName, fingerPointName):
        return getattr(getattr(self, fingerName), fingerPointName)

    #arm funtions
    def get_elbow_position(self):
        return self.elbow

    def get_wrist_position(self):
        return self.wrist

    def get_arm_direction(self):
        return self.arm_direction

    def get_time_from_init(self):
        return self.time

    def get_frame(self):
    	return self.frame

class Runner(threading.Thread):

    def __init__(self,arg=None):
        threading.Thread.__init__(self)
        self.arg=arg
        self.listener = LeapInterface()
        self.controller = Leap.Controller()
        self.controller.add_listener(self.listener)
        self.frame_old = None
        self.control = 0

    def __del__(self):
        self.controller.remove_listener(self.listener)

    def get_hand_direction(self):
        return self.listener.get_hand_direction()

    def get_hand_normal(self):
        return self.listener.get_hand_normal()

    def get_hand_palmpos(self):
        return self.listener.get_hand_palmpos()

    def get_hand_roll(self):
        return self.listener.get_hand_roll()

    def get_hand_pitch(self):
        return self.listener.get_hand_pitch()

    def get_hand_yaw(self):
        return self.listener.get_hand_yaw()

    def get_finger_point(self, fingerName, fingerPointName):
        return self.listener.get_finger_point(fingerName, fingerPointName)

    def get_elbow_position(self):
        return self.listener.get_elbow_position()

    def get_wrist_position(self):
        return self.listener.get_wrist_position()

    def get_arm_direction(self):
        return self.listener.get_arm_direction()

    def get_time_from_init(self):
        return self.listener.get_time_from_init()

    def get_frame(self):
    	return self.listener.get_frame()


    def run (self):
        while True:
            time.sleep(0.001)
