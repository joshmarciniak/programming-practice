from tkinter import *

import math

class Circle2D:

    def __init__(self, x=0, y=0, radius = 0):
        self.x = x
        self.y = y
        self.radius = radius

    #Get x coordinate of center
    def getX(self):
        return self.x

    #Get y coordinate of center
    def getY(self):
        return self.y

    #Get radius of circle
    def getRadius(self):
        return self.radius

    #Set x coordinate of center
    def setX(self,x):
        self.x = x

    #Set y coordinate of center
    def setY(self,y):
        self.y = y

    #Set radius of circle
    def setRadius(self, radius):
        self.radius = radius

    #Calculate perimeter of circle
    def getPerimeter(self):
        return 2* self.radius *math.pi

    #Calculate area of circle
    def getArea(self):
        return (self.radius**2) * math.pi

    #Circle contains points
    def containsPoint(self,x,y):
        d = distance(x,y,self.x,self.y)
        
        return d <= self.radius

    #Circle contains other circle
    def contains(self, circle):
        d = distance(self.x, self.y, circle.x, circle.y)

        return  d + circle.radius <= self.radius

    #Circle overlaps other circle
    def overlaps(self, circle):
        return distance(self.x, self.y, circle.x, circle.y) <= self.radius + circle.radius

#Distance between 2 points
def distance(x1, y1, x2, y2):
    return math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))

#Draw Circle
def displayCircle(c, heading):
    canvas.delete("text")
    canvas.create_oval(c.x - c.radius, c.y - c.radius, c.x + c.radius, c.y + c.radius,
                       tags = heading)
    canvas.create_text(c.x, c.y, text = heading, tags = heading)

'''def mouseDragged(event):
    if cir1.containsPoint(event.x, event.y):
        cir1.setX(event.x)
        cir1.setY(event.y)
        
        displayCircle(cir1, "c1")
        
        cir1x.set(cir1.getX())
        cir1y.set(cir1.getY())
        cir1Radius.set(cir1.getRadius())
        
        checkOverlap(cir1, cir2)

    elif cir2.containsPoint(event.x, event.y):
        cir2.setX(event.x)
        cir2.setY(event.y)
        
        displayCircle(cir2, "c2")
        cir2x.set(cir2.getX())
        cir2y.set(cir2.getY())
        cir2Radius.set(cir2.getRadius())
        
        checkOverlap(cir1, cir2)'''

#Check if circles overlap and display overlap message
def checkOverlap(cir1, cir2):
    if cir1.overlaps(cir2):
        label["text"] = "Two circles intersect"
    else:
        label["text"] = "Two circles don't intersect"

def redraw():
    cir1.x =cir1x.get()
    cir1.y=cir1y.get()
    cir1.radius = cir1Radius.get()
    cir2.x=cir2x.get()
    cir2.y = cir2y.get()
    cir2.radius = cir2Radius.get()

    displayCircle(cir1,"c1")
    displayCircle(cir2,"c2")

    checkOverlap(cir1,cir2)
        
window = Tk()
window.title("Two Circles")

label = Label(window, text = "Two circles intersect")
label.pack()

width = 400
height = 200

canvas = Canvas(window, width = width, height = height)
canvas.pack()

'''canvas.bind("", mouseDragged)'''

cir1 = Circle2D(150, 150, 20)
cir2 = Circle2D(60, 80, 40)

displayCircle(cir1, "c1")
displayCircle(cir2, "c2")

frame1 = Frame(window)
frame1.pack()

Label(frame1, text = "C1 Center x:").grid(row=1, column = 1)
Label(frame1, text = "C1 Center y:").grid(row=2, column = 1)
Label(frame1, text = "C1 Radius:").grid(row=3, column = 1)

cir1x = DoubleVar()
cir1x.set(cir1.x)
Entry(frame1, width = 5, justify = RIGHT, textvariable =cir1x).grid(row = 1, column = 2)

cir1y = DoubleVar()
cir1y.set(cir1.y)
Entry(frame1, width = 5, justify = RIGHT, textvariable = cir1y).grid(row = 2, column = 2)

cir1Radius = DoubleVar()
cir1Radius.set(cir1.radius)
Entry(frame1, width = 5, justify = RIGHT, textvariable = cir1Radius).grid(row = 3, column = 2)

Label(frame1, text = "C2 Center x:").grid(row=1, column = 3)
Label(frame1, text = "C2 Center y:").grid(row=2, column = 3)
Label(frame1, text = "C2 Radius:").grid(row=3, column = 3)

cir2x = DoubleVar()
cir2x.set(cir2.x)
Entry(frame1, width = 5, justify = RIGHT, textvariable =cir2x).grid(row = 1, column = 4)

cir2y = DoubleVar()
cir2y.set(cir2.y)
Entry(frame1, width = 5, justify = RIGHT, textvariable = cir2y).grid(row = 2, column = 4)

cir2Radius = DoubleVar()
cir2Radius.set(cir2.radius)
Entry(frame1, width = 5, justify = RIGHT, textvariable = cir2Radius).grid(row = 3, column = 4)

frame2 = Frame(window)
frame2.pack()

Button(frame2, text = "Redraw Circles", command = redraw).pack()

w.mainloop()
    

    

    
