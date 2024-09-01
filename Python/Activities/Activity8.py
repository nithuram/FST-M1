numbers = list(input("enter the list of numbers:").split(','))
firstNumber = numbers[0]
lastNumber = numbers[-1]
if(firstNumber == lastNumber):
    print(True)
else:
    print(False)    