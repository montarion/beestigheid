import keyboard as k
import time as t

text = input("insert text: ")

try:
    text, tijd = text.split("|")
except ValueError:
    tijd = 5

textlist = list(text.strip())

u = " seconds"

for i in range(int(tijd)):
    if int(tijd) - i == 1:
        u = " second"
    print("You have " + str(int(tijd) - i) + u + " left!")
    t.sleep(1)

print("Starting right abouuut NOW!")

for w in textlist:
    if w == " ":
        w = "(spatie)"
    elif w == ",":
        w = "(komma)"
    elif w == ".":
        w = "(punt)"
    k.write(w)
    #t.sleep(0.1)
    k.press("shift")
    k.press_and_release('enter')
    k.release("shift")
    #t.sleep(0.4)
k.press_and_release('enter')
    
print("Done.")
t.sleep(2)
