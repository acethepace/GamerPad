import pyautogui
import time



def pressKey(c):
    pyautogui.keyDown(c)
    time.sleep(0.2)
    pyautogui.keyUp(c)


def mouseUp():
    pyautogui.moveRel(yOffset=-10.0)


def mouseDown():
    pyautogui.moveRel(yOffset=10.0)


def mouseLeft():
    pyautogui.moveRel(xOffset=10.0)


def mouseRight():
    pyautogui.moveRel(xOffset=-10.0)

pressKey('w')
mouseUp()
time.sleep(1)
mouseDown()
time.sleep(1)
mouseLeft()
time.sleep(1)
mouseRight()
time.sleep(1)