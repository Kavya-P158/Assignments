import java.util.*;
class Checknumber{
    public static void main(String args[]){
System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        Scanner sc1=new Scanner(System.in);
        int num2=sc1.nextInt();
        System.out.println("Enter the third number");
        Scanner sc2=new Scanner(System.in);
        int num3=sc2.nextInt();
       int maxi=Math.max(num1,num2);
       System.out.println(Math.max(maxi,num3));

        return ;
    }
}