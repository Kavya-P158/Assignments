arr=list(map(int,input("Enter the array numbers").strip().split()))
print("Divisible by 5:")
for i in arr:
    if(i%5==0):
        print(i)
