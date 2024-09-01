number_list = list(input("Enter the numbers into the list:").split(','))
sum = 0

for num in number_list:
    sum+= int(num)

print(sum)