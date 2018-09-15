import cv2
import numpy as np
from random import randint

def seleccionaCategoria(categoria, item):
	dicc = {'Galleta': {1: "Galleta"},
			'Cereal' : {1: "Cereal"},
			'Soda' : {1: "Coca", 2:"Leche",3:"Lechita",4:"Fanta",5:"Sangria",6:"Manzana",7:"Mineral"},
			'Comida' : {1:"Chile",2:"Mayonesa"},
			'Sofa' : {},
			'Cama' : {},
			'PA' : {1:"Profesor"},
			'PB' : {1:"Doctora"},
			'PC' : {1:"Alumno"},
			'Marcar' : {1:"Profesor",2:"Doctora",3:"Alumno"},
			'Telev' : {},
			'Medicina' : {}}
	#selecciona item
	it = dicc[categoria][item]
	#reproduce video
	video(it)

def video(item):
	cap = cv2.VideoCapture('RobotPuerta.mp4')
	if (cap.isOpened()== False): 
	  print("Error opening video stream or file")
	while(cap.isOpened()):
	  ret, frame = cap.read()
	  if ret == True:
	    cv2.imshow('Frame',frame)
	    if cv2.waitKey(25) & 0xFF == ord('q'):
	      break
	  else: 
	    break

	cap = cv2.VideoCapture('RobotGira.mp4')
	if (cap.isOpened()== False): 
	  print("Error opening video stream or file")
	while(cap.isOpened()):
	  ret, frame = cap.read()
	  if ret == True:
	    cv2.imshow('Frame',frame)
	    if cv2.waitKey(25) & 0xFF == ord('q'):
	      break
	  else: 
	    break

	cap = cv2.VideoCapture(item + '.mp4')
	if (cap.isOpened()== False): 
	  print("Error opening video stream or file")
	while(cap.isOpened()):
	  ret, frame = cap.read()
	  if ret == True:
	    cv2.imshow('Frame',frame)
	    if cv2.waitKey(25) & 0xFF == ord('q'):
	      break
	  else: 
	    break
	cap.release()
	cv2.destroyAllWindows()


categoria = {1:'Galleta',2:'Cereal',3:'Soda',4:'Comida',5:'Sofa',6:'Cama',7:'PA',8:'PB',9:'PC',10:'Marcar',11:'Telev',12:'Medicina'}
cat = randint(1,12)
it = 1
seleccionaCategoria(categoria[cat], item)
