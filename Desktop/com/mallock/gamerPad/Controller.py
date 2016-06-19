import time

import pyautogui

MOTION_CONSTANT = 10.0


def pressKey(c):
    pyautogui.keyDown(c)
    time.sleep(0.2)
    pyautogui.keyUp(c)


def mouseUp():
    pyautogui.moveRel(yOffset=-1 * MOTION_CONSTANT)


def mouseDown():
    pyautogui.moveRel(yOffset=MOTION_CONSTANT)


def mouseLeft():
    pyautogui.moveRel(xOffset=-1 * MOTION_CONSTANT)


def mouseRight():
    pyautogui.moveRel(xOffset=MOTION_CONSTANT)
