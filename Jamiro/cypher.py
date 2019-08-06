#!/usr/bin/python3
import string


import random
test = string.ascii_lowercase + string.digits
###this is sorta needed I guess###
extra = ' ' + '!' + '?' + ',' + '.' + '-' + '<' + '>' + '=' + "'"		# added equal sign 
letters = string.ascii_lowercase + extra
###/###


def randgen(seeed):
    i = 0
    random.seed(seeed)

    thing = (list(test))

    bleh = []

    while i < len(letters):
        fuck = (random.choice(thing))

        if fuck not in bleh:

            bleh.append(fuck)
            final = ''.join(bleh)
            i = i + 1

    return final

seeed = input('choose seed')

randgen(seeed)
ranletters = randgen(seeed)

def encoder(sentence):
    print('encoding...')
    i = 0
    x = 0

    notalist = []

    global encoding

    encoding = {}

    while i < len(ranletters):

        encoding.update({letters[i]:ranletters[i]})
        i += 1


    while x < len(sentence):
        splitsentence = encoding[sentence[x]]
        notalist.append(splitsentence)
        joinedsentence = ''.join(notalist)
        x += 1
    print("your encoded sentence is: " + joinedsentence)


def decoder(code):
    print('decoding...')
    i = 0
    x = 0
    notalist = []

    letters = string.ascii_lowercase + extra

    global decoding
    decoding = {}

    while i < len(ranletters):

        decoding.update({ranletters[i]:letters[i]})
        #print(decoding)
        #sleep(1)
        i += 1
    while x < len(code):
        try:
            splitsentence = decoding[code[x]]
        except:
            print("Fatal Error!\nYou probably typed the code wrong or used the wrong seed.")
            menu()

        notalist.append(splitsentence)
        joinedsentence = ''.join(notalist)
        x += 1
    print("your decoded sentence is: " + joinedsentence)


def menu():
    while True:
        option = input('What do you want to do? ')
        if option.lower() in ('encode', 'encrypt', '1'):
            sentence = input('What is your sentence? ').lower()

            encoder(sentence)
        elif option.lower() in ('decode', 'decrypt', '2'):
            code = input('What is your code? ').lower()
            decoder(code)
        elif option.lower() in ('leave', 'exit', '3'):
            print('Bye!')
            quit()
        else:
            print('Please answer with either encode, decode, or leave. ')
menu()

