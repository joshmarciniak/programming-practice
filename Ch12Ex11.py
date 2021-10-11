from tkinter import *
import tkinter.messagebox

class BirthdaySet:

    def __init__(self, container, datesSet):
        self.container = container
        self.text = datesSet
        self.day = 0
        self.display()

    def processCheckButton(self):
        if self.s.get() == 1:
            self.day = getDay(self.text)
        else:
            self.day = 0

    def display(self):

        f = Frame(self.container)
        f.pack(side = LEFT)

        Label(f, text=self.text, relief=GROOVE).pack()

        self.s = IntVar()
        Checkbutton(f, variable = self.s, command = self.processCheckButton).pack()

def getDay(str):

    item = str.split()
    lst = [int(x) for x in item]
    return lst[0]

def processButton():

    day = s1.day + s2.day + s3.day + s4.day + s5.day
    if day == 0:
        tkinter.messagebox.showerror("Error. Please make a choice!!")
    else:
        tkinter.messagebox.showinfo("Your birthday is " + str(day))
        
w = Tk()
w.title("Guess Birthday")

set1 = " 1 3 5 7\n9 11 13 15\n 17 19 21 23\n 25 27 29 31"
set2 = " 2 3 6 7\n10 11 14 15\n18 19 22 23\n26 26 29 31"
set3 = " 4 5 6 7\n12 13 14 15\n20 21 22 23\n28 29 30 31"
set4 = " 8 9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31"
set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31"

Label(w, text = "Check the boxes if your birthday is in these sets").pack()

f = Frame(w)
f.pack()

s1 = BirthdaySet(f, set1)
s2 = BirthdaySet(f, set2)
s3 = BirthdaySet(f, set3)
s4 = BirthdaySet(f, set4)
s5 = BirthdaySet(f, set5)

Button(w, text="Guess Birthday", command = processButton).pack()

mainloop()

