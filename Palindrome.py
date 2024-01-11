num=int(input("Enter a number to check for palindrome"))
l=list(map(int,str(num)))
if(l==l[::-1]):
    print(l)
    print(reversed(l))
    print("Yes it is a palindrome number")
else:
    print("No it is not a palindrome number")