a=int(input("Enter the no.:"))
for i in range(a):
    for j in range(a-i):
        print(f"{j+1}",end="")
    print("")