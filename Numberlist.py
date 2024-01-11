flag=1
while(flag==1):
    i=int(input("Enter a number"))
    if i%5==0:
        print(i)
    elif i>150 and i<=500:
        continue
    elif i>500:
        flag=0
        break
