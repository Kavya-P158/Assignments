import java.util.*;
class SumandAvg{
    public static void main(String args[]){
        int i=1;
 
System.out.println("Enter first number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        System.out.println("Enter second number");
        Scanner sc1=new Scanner(System.in);
        int num2=sc1.nextInt();

        System.out.println("Enter third number");
        Scanner sc2=new Scanner(System.in);
        int num3=sc2.nextInt();

        System.out.println("Enter fourth number");
        Scanner sc3=new Scanner(System.in);
        int num4=sc3.nextInt();

        System.out.println("Enter fifth number");
        Scanner sc4=new Scanner(System.in);
        int num5=sc4.nextInt();

int total=num1+num2+num3+num4+num5;
float avg=total/5;
        System.out.println("Sum of the numbers is "+total);
        System.out.println("Average of the numbers is "+avg);


    }}
