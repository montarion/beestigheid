#!/usr/bin/env python3

import subprocess
import os
import time
import sys

def onePing(ipinput):
    #check if input is a string first
    if type(ipinput) != str:
        return "not correct, try again"
    # Make the command, split input
    doPing = "ping -c 1 {}".format(ipinput).split()
    #print result and hide output of subprocess
    result = subprocess.run(doPing, stdout=subprocess.DEVNULL)
    returncode = result.returncode
    
    return returncode, result

def checkFile(filee):
    if os.path.isfile(filee):
        print("file bestaat, nice.")
    else:
        print("not")
        sys.exit("File testcomparisonoutput bestaat niet, lekker leuk.")
   

def main():
    #check if file is even there, otherwise why run...
    checkFile('./testcomparisonoutput.txt')
    #continue anyway 
    i = 1
    while i < 4:
        #Build command
        ipStart = "192.168.56.{}".format(str(i))
        doPingS = "ping -c 1 {}".format(ipStart).split()
        #return output from doPingS
        returnCode, output = onePing(ipStart)
        #check returncodes, and output because own output is hidden
        
        if returnCode == 0:
            s = 'the ip {} is up'.format(output.args[-1])
            print("the ip {} is up".format(output.args[-1]))
            file = open("sampleoutput.txt","a+")
            file.write(s)
            file.write("\n")
        elif returnCode == 1:
            d = 'the ip {} is down'.format(output.args[-1])
            print("the ip {} is down".format(output.args[-1]))
            file = open("sampleoutput.txt","a+")
            file.write(d)
            file.write("\n")
        i+=1
        #allowing for some breathing room
        file.close()
        time.sleep(1)
    fname1 = "testcomparisonoutput.txt"
    fname2 = "sampleoutput.txt"

    #open file for reading in text mode (default mode)
    f1 = open(fname1)
    f2 = open(fname2)

    # print confirmation
    print("-----------------------------------")
    print("Comparing files ", " > " + fname1, " < " +fname2, sep='\n')
    print("-----------------------------------")
    print("NOTE: '<' and '>' Means that the output is now changed, meaning that you can tell if the host is now up or is now down, depending on which one comes first. and which file is different\n")

    #read the first line from the files
    f1_line = f1.readline()
    f2_line = f2.readline()

    #initialize counter for line number
    line_no = 1

    #loop if either file1 or file2 has not reached EOF
    while f1_line != '' or f2_line != '':

        #strip the leading whitespaces
        f1_line = f1_line.rstrip()
        f2_line = f2_line.rstrip()
    
        #compare the lines from both file
        if f1_line != f2_line:
        
            #if a line does not exist on file2 then mark the output with + sign
            if f2_line == '' and f1_line != '':
                print(">+", "Line-%d" % line_no, f1_line)
            #otherwise output the line on file1 and mark it with > sign
            elif f1_line != '':
                print(">", "Line-%d" % line_no, f1_line)
            
            #if a line does not exist on file1 then mark the output with + sign
            if f1_line == '' and f2_line != '':
                print("<+", "Line-%d" % line_no, f2_line)
            #otherwise output the line on file2 and mark it with < sign
            elif f2_line != '':
                print("<", "Line-%d" %  line_no, f2_line)

            #print a blank line
            print()

        #read the next line from the file
        f1_line = f1.readline()
        f2_line = f2.readline()


        #increment line counter
        line_no += 1

    #close the files
    f1.close()
    f2.close()
main()
