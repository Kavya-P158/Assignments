username=input("Enter username")
password=input("Enter password")
result=lambda username,password: 'login success' if username=='astrazeneca' and password=='astra123' else 'Login unsuccessful'
print(result(username,password))