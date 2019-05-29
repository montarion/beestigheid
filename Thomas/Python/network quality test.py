import os
import time
from threading import Thread

count = 0
done = False
last = time.monotonic()
global canTrace
canTrace = True
file = open("logs.txt", 'w')

try:
    def doTrace():
        global canTrace
        canTrace = False
        trace = os.popen('tracert -4 www.google.com')
        result = trace.readlines()
        for l in result:
            if not l == "\n":
                if "  " in l:
                    file.write(l)
                    print(l.strip("\n"))
        canTrace = True
            
    while(1):
        ping = os.popen('ping www.google.com -n 1')
        result = ping.readlines()
        msLine = result[-1].strip()
        val1 = msLine.split(' = ')[-1]
        ping = os.popen('ping 192.168.178.1 -n 1')
        result = ping.readlines()
        msLine = result[-1].strip()
        val2 = msLine.split(' = ')[-1]
        if len(val1) > 4 or len(val2) > 3:
            now = time.monotonic()
            gap = now - last
            line = val1 + " : " + val2.strip(',') + ", correct: " + str(count) + " package's, time: " + str(round(gap, 2)) + "s"
            file.write(line + '\n')
            print(line)
            count = 0
            if len(val1) > 4:
                if canTrace:
                    try:
                        Tracing.join()
                    except:
                        pass
                    Tracing = Thread(target=(doTrace), args=(), daemon=True)
                    Tracing.start()
            last = time.monotonic()
        else:
            line = val1 + " : " + val2
            print(line)
            count += 1
except:
    try:
        Tracing.join()
    except:
        pass
    file.close()
finally:
    try:
        Tracing.join()
    except:
        pass
    file.close()

