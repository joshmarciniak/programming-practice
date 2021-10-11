from tkinter import *
import urllib.request

def main():
    file1 = input("Enter a filename: ").strip()
    infile = open(file1, "r")

    numberOfVertices = eval(infile.readline())

    vertices = []
    edges = []

    for i in range(numberOfVertices):
        line = infile.readline().strip().split()

        vertices.append([eval(line[0]), eval(line[1]), eval(line[2])])

        for j in range(3, len(line)):
            edges.append([eval(line[0]),eval(line[j])])
            
    infile.close()

    window = Tk()
    window.title("Display a Graph")

    frame1 = Frame(window)
    frame1.pack()

    canvas = Canvas(frame1, width = 300, height = 200)
    canvas.pack()

    radius = 3

    for vertex, x, y in vertices:

        canvas.create_text(x-2 * radius, y-2*radius, text = str(vertex), tags = "graph")

    for v1,v2 in edges:
        canvas.create_line(vertices[v1][1],
                           vertices[v1][2], vertices[v2][1], vertices[v2][2], tags = "graph")
    window.mainloop()
    
main()
