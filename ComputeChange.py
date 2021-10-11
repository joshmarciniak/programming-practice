amount = eval(input("Enter an amound, for example, 11.56: "))
remainingAmount = int(amount*100)
dollars = remainingAmount // 100
remainingAmount = remainingAmount%100
quarters = remainingAmount // 25
remainingAmount = remainingAmount % 25
dimes = remainingAmount // 10
remainingAmount = remainingAmount % 10
nickels = remainingAmount // 5
remainingAmount = remainingAmount % 5
pennies = remainingAmount
print("Your amount", amount, "consists of\n",
      "\t", dollars, "dollars\n"
      "\t", quarters, "quarters\n",
      "\t", dimes, "dimes\n",
      "\t", nickels, "nickels\n",
      "\t", pennies, "pennies")
        
