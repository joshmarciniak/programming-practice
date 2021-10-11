import turtle as t

t.pensize(3)
t.penup()
t.goto(-200, -50)
t.pendown()
t.circle(40, steps = 3)

t.penup()
t.goto(-100, -50)
t.pendown()
t.circle(40, steps = 4)

t.penup()
t.goto(0, -50)
t.pendown()
t.circle(40, steps = 5)

t.penup()
t.goto(100, -50)
t.pendown()
t.circle(40, steps = 6)

t.penup()
t.goto(200, -50)
t.pendown()
t.circle(40)

t.done()
