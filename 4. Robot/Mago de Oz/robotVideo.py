import cv2
import numpy as np
from random import randint

def rVideo(respuesta, item):
	if respuesta == 0:
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

		cap = cv2.VideoCapture(elemento + '.mp4')
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
	else:
		print("Estimulacion reiniciada")


print("Respuesta recibida...")
#Definicion de diccionario, en este diccionario se consideraron los videos con los que se cuentan
seleccion = {1:"Cereal", 2:"Leche", 3:"Coca", 4:"Mayonesa", 5:"Sabritas"}
gen = randint(1,5)
#print(seleccion[gen])
rVideo(1, seleccion[gen])