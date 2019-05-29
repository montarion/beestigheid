import RPi.GPIO as GPIO	#importing IO pins of rpi
import time #for sleep
import threading	#adds thead so that in can poll the server and detect button presses at the same time
import socket #to send UDP requests and receive them
from ConfigParser import ConfigParser	#reading ini file

reader = ConfigParser()
reader.read('config.ini')

#set 1 command channel 1 mute
B1Pin = reader.getint('pins','knop1')	#pin that is hooked up to the button using id 1
L1Pin = reader.getint('pins','lamp1')	#pin that controls the led using id 1

#set 2 command bus 1/2 
B2Pin = reader.getint('pins','knop2')	#pin that is hooked up to the button using id 2
L2Pin = reader.getint('pins','lamp2')	#pin that controls the led using id 2

#set 3 command bus 3 
B3Pin = reader.getint('pins','knop3')	#pin that is hooked up to the button using id 3
L3Pin = reader.getint('pins','lamp3')	#pin that controls the led using id 3

#set 4 command bus 4 
B4Pin = reader.getint('pins','knop4')	#pin that is hooked up to the button using id 4
L4Pin = reader.getint('pins','lamp4')	#pin that controls the led using id 4

#set 5 command bus 5
B5Pin = reader.getint('pins','knop5')	#pin that is hooked up to the button using id 5
L5Pin = reader.getint('pins','lamp5')	#pin that controls the led using id 5

#set 6 command bus 6
B6Pin = reader.getint('pins','knop6')	#pin that is hooked up to the button using id 6
L6Pin = reader.getint('pins','lamp6')	#pin that controls the led using id 6

#set 7 command bus 7
B7Pin = reader.getint('pins','knop7')	#pin that is hooked up to the button using id 7
L7Pin = reader.getint('pins','lamp7')	#pin that controls the led using id 7

#set 8 command bus 8
B8Pin = reader.getint('pins','knop8')	#pin that is hooked up to the button using id 8
L8Pin = reader.getint('pins','lamp8')	#pin that controls the led using id 8

host = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)	#this hosts socket
host.settimeout(2)	#timeout if it cant reach the server

server = reader.get('settings','ip') #server adress
port = 10023	#default OSC port 

def IOStartup():					#defining startup
	#GPIO.setwarnings(False)	#ignoring warnings from GPIO in use which they are not

	GPIO.setmode(GPIO.BCM)	#type of numbering of the IO board

	#setting button pins
	GPIO.setup(B1Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B1 as input pin
	GPIO.setup(B2Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B2 as input pin
	GPIO.setup(B3Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B3 as input pin
	GPIO.setup(B4Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B4 as input pin
	GPIO.setup(B5Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B5 as input pin
	GPIO.setup(B6Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B6 as input pin
	GPIO.setup(B7Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B7 as input pin
	GPIO.setup(B8Pin, GPIO.IN, pull_up_down=GPIO.PUD_UP)	#setting pin that listens to B8 as input pin

	#setting led pins
	GPIO.setup(L1Pin, GPIO.OUT) #setting pin that controls L1 as output pin
	GPIO.output(L1Pin, False)	#setting pin to being off by default in case it wasnt already
	GPIO.setup(L2Pin, GPIO.OUT) #setting pin that controls L2 as output pin
	GPIO.output(L2Pin, False)	#setting pin to being off by default in case it wasnt already
	GPIO.setup(L3Pin, GPIO.OUT) #setting pin that controls L3 as output pin
	GPIO.output(L3Pin, False)	#setting pin to being off by default in case it wasnt already
	GPIO.setup(L4Pin, GPIO.OUT) #setting pin that controls L4 as output pin
	GPIO.output(L4Pin, False)	#setting pin to being off by default in case it wasnt already
	GPIO.setup(L5Pin, GPIO.OUT) #setting pin that controls L5 as output pin
	GPIO.output(L5Pin, False)	#setting pin to being off by default in case it wasnt already
	GPIO.setup(L6Pin, GPIO.OUT) #setting pin that controls L6 as output pin
	GPIO.output(L6Pin, False)	#setting pin to being off by default in case it wasnt already
	GPIO.setup(L7Pin, GPIO.OUT) #setting pin that controls L7 as output pin
	GPIO.output(L7Pin, False)	#setting pin to being off by default in case it wasnt already
	GPIO.setup(L8Pin, GPIO.OUT) #setting pin that controls L8 as output pin
	GPIO.output(L8Pin, False)	#setting pin to being off by default in case it wasnt already

def switchL(LPin, action):	#function that toggles any button
	try:
		GPIO.output(LPin, action)	#looks given variable (action) and switches states
	except RuntimeError:
		print("Done cleaning lights")

def action1():	#action 1 which is triggerd by pressing button 1
	if GPIO.input(L1Pin) == True:	#decides what command to send based on led 1
		host.sendto("/ch/01/mix/on" + '\x00\x00\x00' + ",i" + '\x00\x00' + '\x00\x00\x00\x00', (server, port))	#sends the mute signal for channel 1
	else:
		host.sendto("/ch/01/mix/on" + '\x00\x00\x00' + ",i" + '\x00\x00' + '\x00\x00\x00\x01', (server, port))	#sends the unmute signal for channel 1

def action2():	#action 2 which is triggerd by pressing button 2
	if GPIO.input(L2Pin) == True:	#decides what command to send based on led 2
		host.sendto("/ch/01/mix/" + "01" + "/on" + '\x00\x00\x00\x00' + ",i" + '\x00\x00' + '\x00\x00\x00\x00', (server, port))	#sends the mute signal for bus 1 
		host.sendto("/ch/01/mix/" + "02" + "/on" + '\x00\x00\x00\x00' + ",i" + '\x00\x00' + '\x00\x00\x00\x00', (server, port))	#sends the mute signal for bus 2
	else:
		host.sendto("/ch/01/mix/" + "01" + "/on" + '\x00\x00\x00\x00' + ",i" + '\x00\x00' + '\x00\x00\x00\x01', (server, port))	#sends the unmute signal for bus 1
		host.sendto("/ch/01/mix/" + "02" + "/on" + '\x00\x00\x00\x00' + ",i" + '\x00\x00' + '\x00\x00\x00\x01', (server, port))	#sends the unmute signal for bus 2

def action3(LPin, bus):	#action 3 which is triggerd by pressing button 3 to 8 because they almost have the same function
	Send = "/ch/01/mix/" + bus + "/on" + '\x00\x00\x00\x00' + ",i" + '\x00\x00'
	SendON = Send + '\x00\x00\x00\x01'
	SendOFF = Send + '\x00\x00\x00\x00'
	if GPIO.input(LPin) == True:	#decides what command to send based on led 3
		host.sendto(SendOFF, (server, port))	#sends the mute signal for bus 3
	else:
		host.sendto(SendON, (server, port))	#sends the unmute signal for bus 3

def actioncheck(response, LPin):	#actioncheck1 gets called by the polling thread to update the led to the proper state
	if response != "timeout":
		reply = response[0]	#gets the reply (ON or OFF) from the response
		state = reply.split(' ', 2)	#turns the reply into a proper state so it can check it	
		if "OFF" in state[1]:	#compares state to ON or OFF
			switchL(LPin, False)	#switches the led to the right position
		elif "ON" in state[1]:	#compares state to ON or OFF
			switchL(LPin, True)		#switches the led to the right position
	else:
		switchL(LPin, False)

def check():	#polling function that will send checks to the server for the current state of the channels and busses
	timeout = reader.getint('settings','polltime')/1000
	try:
		while True:	#will run till terminated
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+"ch/" + "01" + "/mix" + "/on" + '\x00\x00\x00\x00', (server, port))	#checking set 1
			try:
				actioncheck(host.recvfrom(1024), L1Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L1Pin)
				print("Timeout error: lamp 1")	#will print if host didnt get response from server
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+ "ch/01/mix/" + "02" + "/on" + '\x00',(server, port))	#checking set 2
			try:
				actioncheck(host.recvfrom(1024), L2Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L2Pin)
				print("Timeout error: lamp 2")	#will print if host didnt get response from server
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+ "ch/01/mix/" + "03" + "/on" + '\x00',(server, port))	#checking set 3
			try:
				actioncheck(host.recvfrom(1024), L3Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L3Pin)
				print("Timeout error: lamp 3")	#will print if host didnt get response from server
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+ "ch/01/mix/" + "04" + "/on" + '\x00',(server, port))	#checking set 4
			try:
				actioncheck(host.recvfrom(1024), L4Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L4Pin)
				print("Timeout error: lamp 4")	#will print if host didnt get response from server
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+ "ch/01/mix/" + "05" + "/on" + '\x00',(server, port))	#checking set 5
			try:
				actioncheck(host.recvfrom(1024), L5Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L5Pin)
				print("Timeout error: lamp 5")	#will print if host didnt get response from server
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+	"ch/01/mix/" + "06" + "/on" + '\x00',(server, port))	#checking set 6
			try:
				actioncheck(host.recvfrom(1024), L6Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L6Pin)
				print("Timeout error: lamp 6")	#will print if host didnt get response from server
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+ "ch/01/mix/" + "07" + "/on" + '\x00',(server, port))	#checking set 7
			try:
				actioncheck(host.recvfrom(1024), L7Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L7Pin)
				print("Timeout error: lamp 7")	#will print if host didnt get response from server
			host.sendto("/node"+'\x00\x00\x00'+",s"+'\x00\x00'+ "ch/01/mix/" + "08" + "/on" + '\x00',(server, port))	#checking set 8
			try:
				actioncheck(host.recvfrom(1024), L8Pin)	#sends response to actioncheck if it got one
			except socket.timeout:
				actioncheck("timeout", L8Pin)
				print("Timeout error: lamp 8")	#will print if host didnt get response from server
			time.sleep(timeout)	#time till next poll
	except Exception:
		print("Done cleaning polling")

def button():	#function that looks at button presses
	if not GPIO.input(B1Pin):	#toggles if pressed
		action1()	#sends press to action1
		print("Button 1 pressed")	#shows press in console
		while not GPIO.input(B1Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce
	if not GPIO.input(B2Pin):	#toggles if pressed
		action2()	#sends press to action2
		print("Button 2 pressed")	#shows press in console
		while not GPIO.input(B2Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce
	if not GPIO.input(B3Pin):	#toggles if pressed
		action3(L3Pin, '03')	#sends press to action3
		print("Button 3 pressed")	#shows press in console
		while not GPIO.input(B3Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce
	if not GPIO.input(B4Pin):	#toggles if pressed
		action3(L4Pin, '04')	#sends press to action3
		print("Button 4 pressed")	#shows press in console
		while not GPIO.input(B4Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce
	if not GPIO.input(B5Pin):	#toggles if pressed
		action3(L5Pin, '05')	#sends press to action3
		print("Button 5 pressed")	#shows press in console
		while not GPIO.input(B5Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce
	if not GPIO.input(B6Pin):	#toggles if pressed
		action3(L6Pin, '06')	#sends press to action3
		print("Button 6 pressed")	#shows press in console
		while not GPIO.input(B6Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce
	if not GPIO.input(B7Pin):	#toggles if pressed
		action3(L7Pin, '07')	#sends press to action3
		print("Button 7 pressed")	#shows press in console
		while not GPIO.input(B7Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce
	if not GPIO.input(B8Pin):	#toggles if pressed
		action3(L8Pin, '08')	#sends press to action3
		print("Button 8 pressed")	#shows press in console
		while not GPIO.input(B8Pin):	#locks the button so it doesnt toggle when held
			print("waiting for release")	#prints this until released
			time.sleep(0.2)	#sleeps so that the button doesnt bounce

IOStartup()	#starts the pin setup

#buttonThread = threading.Thread(target=button, args=())	#creates thread for buttons
checkThread = threading.Thread(target=check, args=())	#creates thread for polls

#buttonThread.deamon = True
checkThread.deamon = True

try:
	#buttonThread.start()	#starts the button thread
	checkThread.start()	#starts the poll thread
	while True:
		button()
		time.sleep(.01)	#timegap for it scans for button presses 
except KeyboardInterrupt:
		print("Cleaning up")
		host.close()
		GPIO.cleanup()
		time.sleep(1)
		print("Cleaned up! stopping NOW")