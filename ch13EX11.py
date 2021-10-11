import math

def main():
    side1, side2, side3 = eval(input("Enter three sides: "))
    print()

    if isLegal(side1, side2, side3):
        raise RuntimeError("The three sides", side1, side2, side3, "cannot form any triangle")

    triangle = Triangle(side1, side2, side3)

    color = input("Enter color:")
    triangle.setColor(color)
    filled = eval(input("Enter 1/0 for filled (1: true, 0: false): "))

    isFilled = (filled ==1)
    triangle.setFilled(isFilled)

    print("The area is", triangle.getArea())
    print("The perimeter is", triangle.getPerimeter())
    print("Color is", triangle.getColor())
    print("Filled is", triangle.isFilled())
    
def isLegal(side1, side2, side3):
    if (side1 + side2 <= side3) or (side1 + side3 <= side2) or (side2 + side3 <= side1):
        return True
    else:
        return False

class GeometricObject:
    def __init__(self, color="green", filled = True):
        self.__color=color
        self.__filled = filled

    def getColor(self):
        return self.__color

    def setColor(self,color):
        self.__color = color

    def isFilled(self):
        return self.__filled

    def setFilled(self, filled):
        self.__filled = filled
        
    def __str__(self):
        return "color: " + self.__color + " and filled: " + str(self.__filled)

class Triangle(GeometricObject):
    def __init__(self, side1, side2, side3):
        self.__side1 = side1
        self.__side2 = side2
        self.__side3 = side3
        GeometricObject.__init__(self)
        
    def getSide1(self):
        return self.__side1
    
    def getSide2(self):
        return self.__side2
    
    def getSide3(self):
        return self.__side3

    def getArea(self):
        s = (self.__side1 + self.__side2 + self.__side3)/2
        return round(math.sqrt(s*(s-self.__side1) * (s-self.__side2)*(s-self.__side3)),2)
    
    def getPerimeter(self):
        return self.__side1 + self.__side2 +self.__side3
    
    def toString(self):
        return "Triangle: side 1 = " + str(self.__side1) + " side 2 = " + str(self.__side2) + "side 3 = " + str(self.__side3)
    
main()
