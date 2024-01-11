num=int(input("Enter a number"))
temp=num
res=[]
while(temp>0):
    rem=temp%10
    res.append(rem)
    temp=temp//10
print(int("".join(map(str,res))))