listO = [10, 20, 23, 11, 17]
listT = [13, 43, 24, 36, 12]

print("First List ", listO)
print("Second List ", listT)

listTH = []

for num in listO:
    if (num % 2 != 0):
        (listTH.append(num))

for num in listT:
    if (num % 2 == 0):
        listTH.append(num)

print("the result is:",listTH) 