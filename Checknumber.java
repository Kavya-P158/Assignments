import java.util.*;
class Checknumber{
    public static void main(String args[]){
System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>=0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }

        return ;
    }
}