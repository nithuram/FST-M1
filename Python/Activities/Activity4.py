user1=input("Enter the name of user1 :")
user2=input("Enter the name of user2 :")

while True:
    User1_choice = input(user1 +",do you want choose Rock,scessior,Paper?:").lower()
    User2_choice = input(user2 +",do you want choose Rock,scessior,Paper?:").lower()

    if User1_choice == User2_choice:
        print("game is tie")

    elif User1_choice == 'rock':
        if User2_choice == 'scessior':
            print(user1 + " " +"wins")
        else:
            print(user2 +" "+"wins")

    elif User1_choice == 'scessior':
        if User2_choice == 'paper':
            print(user1 + " " +"wins")
        else:
            print(user2 +" "+"wins")

    elif User1_choice == 'paper':
        if User2_choice == 'rock':
            print(user1 + " " +"wins")
        else:
            print(user2 +" "+"wins")

    else:
        print("you entered wrong choice, try again")
        
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit