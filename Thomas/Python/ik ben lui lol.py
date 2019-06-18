import os
import time as t
import pyscreenshot as s
from PIL import Image as i
import win32gui as w
import keyboard as k

pw = ""

if __name__ == "__main__":
    filepath="C:\Riot Games\League of Legends\LeagueClient.exe"

    os.startfile(filepath)

    t.sleep(2)
    
    while True:
        img = s.grab(bbox=(1400,710,1401,711))
        pix = img.load()
        if pix[0,0] == (30, 35, 40):
            break
        img.close()

    while True:
        if "League of Legends" in w.GetWindowText(w.GetForegroundWindow()):
            t.sleep(0.3)
            k.write(pw)
            k.press_and_release('enter')
            break
    

    
    
