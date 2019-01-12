#!/usr/bin/env python

import argparse

import rospy
import leap_interface
import Leap
from leap_motion.msg import leap
from leap_motion.msg import leapros

FREQUENCY_ROSTOPIC_DEFAULT = 0.01
NODENAME = 'leap_pub'
PARAMNAME_FREQ = 'freq'
PARAMNAME_FREQ_ENTIRE = '/' + NODENAME + '/' + PARAMNAME_FREQ

def sender():
    
    rospy.loginfo("Parameter set on server: PARAMNAME_FREQ={}".format(rospy.get_param(PARAMNAME_FREQ_ENTIRE, FREQUENCY_ROSTOPIC_DEFAULT)))

    li = leap_interface.Runner()
    li.setDaemon(True)
    li.start()
    control=0

    pub_ros   = rospy.Publisher('leapmotion/data',leapros,queue_size=10)
    rospy.init_node(NODENAME)

    while not rospy.is_shutdown():
        hand_direction_   = li.get_hand_direction()
        hand_normal_      = li.get_hand_normal()
        hand_palm_pos_    = li.get_hand_palmpos()
        hand_pitch_       = li.get_hand_pitch()
        hand_roll_        = li.get_hand_roll()
        hand_yaw_         = li.get_hand_yaw()

        msg = leapros()
        msg.direction.x = hand_direction_[0]
        msg.direction.y = hand_direction_[1]
        msg.direction.z = hand_direction_[2]
        msg.normal.x = hand_normal_[0]
        msg.normal.y = hand_normal_[1]
        msg.normal.z = hand_normal_[2]
        msg.palmpos.x = hand_palm_pos_[0]
        msg.palmpos.y = hand_palm_pos_[1]
        msg.palmpos.z = hand_palm_pos_[2]
        msg.ypr.x = hand_yaw_
        msg.ypr.y = hand_pitch_
        msg.ypr.z = hand_roll_

        #arm data
        elbow_pos = li.get_elbow_position()
        wrist_pos = li.get_wrist_position()
        arm_direc = li.get_arm_direction()

        msg.elbow_position.x = elbow_pos[0]
        msg.elbow_position.y = elbow_pos[1]
        msg.elbow_position.z = elbow_pos[2]
        msg.wrist_position.x = wrist_pos[0]
        msg.wrist_position.y = wrist_pos[1]
        msg.wrist_position.z = wrist_pos[2]
        msg.arm_direccion.x = arm_direc[0]
        msg.arm_direccion.y = arm_direc[1]
        msg.arm_direccion.z = arm_direc[2]
        msg.time = li.get_time_from_init()

        print 'time: %f'%(msg.time)

        fingerNames = ['thumb', 'index', 'middle', 'ring', 'pinky']
        fingerPointNames = ['metacarpal', 'proximal',
                            'intermediate', 'distal', 'tip']
        for fingerName in fingerNames:
            for fingerPointName in fingerPointNames:
                pos = li.get_finger_point(fingerName, fingerPointName)
                for iDim, dimName in enumerate(['x', 'y', 'z']):
                    setattr(getattr(msg, '%s_%s' % (fingerName, fingerPointName)),
                            dimName, pos[iDim])

        pub_ros.publish(msg)
        rospy.sleep(rospy.get_param(PARAMNAME_FREQ_ENTIRE, FREQUENCY_ROSTOPIC_DEFAULT))


if __name__ == '__main__':
    try:
        sender()
    except rospy.ROSInterruptException:
        pass
