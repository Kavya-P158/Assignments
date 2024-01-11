string=input("Enter the string")
substring=input("Enter the substring to search")

count=0
ind=0
for i in range(len(string)):
    j=string.find(substring,ind)
    if(j!=-1):
        ind=j+1
        count=count+1
print(count)