import pyttsx
from random import randint

def rVoz(item):
	eng = pyttsx.init()
	eng.setProperty("voice", "Spanish")
	eng.say("Usted eligio " + item)
	eng.runAndWait()


#Si le pasan el String, se puede evitar el uso de diccionario
seleccion = {1:"Galleta",2: "Cereal", 3:"Soda", 4:"Estufa", 5:"Sillon", 6:"Cama", 7:"Persona A", 8:"Doctor", 9:"Enfermera", 10:"Telefono", 11:"Television", 12:"Medicina"}
gen = randint(1,12)
print(seleccion[gen])
rVoz(seleccion[gen])