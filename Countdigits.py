n=int(input("Enter a number"))
temp=n
c=0
while(temp>0):
    rem=temp%10
    c=c+1
    temp=temp//10
print(c)