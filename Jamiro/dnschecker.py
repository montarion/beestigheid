import socket
import wget
import os

###Colours
OKGREEN = '\033[92m'
OKBLUE = '\033[94m'
WARNING = '\033[93m'
RED = '\033[91m'
ENDC = '\033[0m'

if os.path.exists('tld.txt'):
    pass
else:
    print("Downloading tld list..")
    wget.download('https://raw.githubusercontent.com/incognico/list-of-top-level-domains/master/tlds.csv', 'tld.txt')

infile = open('tld.txt', encoding='UTF-8')



tlist = []
flist = []
i = 0
x = 0
#add percentage counter using x here..
while i < 285:
    data = infile.readline()
    ugh = data.split(',')
    tlist.append(ugh)

    var = tlist[i][0]
    var = '.' + var

    flist.append(var)

    #print(flist)
    i += 1
    x += 1

infile.close()

#actual checking

url = input('well? ')
print('please wait..')
i = 0
error = '***'


failure = []
succes = []
while i < 285:
    percentage = round(i / 285 * 100, 2)
    print(WARNING + "at" + ' ' + str(percentage) + "%" + ENDC, end='\r')
    host = url + flist[i]
    try:
        result = socket.gethostbyname(host)
        print(RED + host + " has ip: " + result + ENDC)
        succes.append(host)
    except:
        print(OKGREEN + host + ' is free.' + ENDC)
        failure.append(host)
    i += 1
    x += 1
for site in succes:
    print("these are taken: " + str(site))

