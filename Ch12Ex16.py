class Stack(list):

    def __init__(self):

        super().__init__()

    def isEmpty(self):
        if len(list.copy(self)) == 0:
            return True
        else:
            return False

    def peek(self):
        if self.isEmpty():
            return None
        else:
            return super().copy()[len(listcopy(self))-1]

    def push(self,value):
        super().append(value)

    def pop(self):
        if self.isEmpty():
            return None
        else:
            return super().pop(len(list.copy(self))-1)

    def getSize(self):
        return len(list.copy(self))

    def reverse(self):
        return super().reverse()

    def __str__(self):
        return super().__str__()

strings = input("Enter five strings: ").split()
st = Stack()

for i in range(len(strings)):
    st.push(strings[i])

print("Original stack->",st)
st.reverse()
print("Reverse stack ->", st)
