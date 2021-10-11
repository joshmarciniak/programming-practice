from tkinter import *

COUNT_LIMIT = 60


def paint():
    x = -2.0
    while x < 2.0:
        y = -2.0
        while y < 2.0:
            curr_count = count(complex(x,y))
            if curr_count == COUNT_LIMIT:
                color = "red"
            else:
                color = "#" + toHex(curr_count*37 % 256) +\
                        toHex(curr_count*58%256) +\
                        toHex(curr_count*159%256)

            canvas.create_rectangle(x * 100 + 200, y * 100 + 200, x * 100 + 200 + 5,
                                     y * 100 + 200 + 5, fill = color)
            y += 0.05
        x += 0.05
        
def count(c):
    cur_z = complex(0, 0)

    for i in range(COUNT_LIMIT):
        cur_z = cur_z * cur_z + c
        if abs(cur_z)> 2: return i
    return COUNT_LIMIT

def toHex(decimalValue):
    hexStr = ""

    while decimalValue !=0:
        hexValue = decimalValue % 16
        hexStr = toHexChar(hexValue) + hexStr
        decimalValue = decimalValue // 16

    if len(hexStr) < 2:
        hexStr = "0" + hexStr
    return hexStr

def toHexChar(hexValue):
    if hexValue <= 9 and hexValue >= 0:
        return chr(hexValue + ord('0'))
    else:
        return chr(hexValue - 10 + ord('A'))

window = Tk()
window.title("Mandelbrot fractal")

width = 400
height = 400

canvas = Canvas(window, width = width, height = height)
canvas.pack()

Button(window, text = "Display", command = paint).pack()

window.mainloop()

