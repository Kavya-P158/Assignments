arr=list(map(int,input("Enter the array numbers").strip().split()))
for i in range(len(arr)):
    if i%2!=0:
        print(arr[i])
