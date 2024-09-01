fruits = {
    "apple":10,
    "orange":8,
    "banana":5
}
check = input("enter the fruit name of your choice:").lower()

if(check in fruits):
    print("Yes, the fruit is available")
else:
    print("No, the fruit is not available")