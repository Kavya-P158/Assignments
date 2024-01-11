import java.util.*;
class Employee{
    int id;
    String name;
    Double salary;
    String address;
    String contact;
    char gender;

    // public setId(int id){
    //     this.id=id;
    // }
    // public setName(String name){
    //     this.name=name;
    // }
    // public setSalary(Double salary){
    //     this.salary=salary;
    // }
    // public setAddress(String address){
    //     this.address=address;
    // }
    // public setContact(String contact){
    //     this.contact=contact;
    // }
    // public setGender(char gender){
    //     this.gender=gender;
    // }
    public static void main(String args[]){
          int id;
    String name;
    Double salary;
    String address;
    String contact;
    char gender;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter employee id");
       id=sc.nextInt();
        System.out.println("Enter employee name");
name=sc.nextLine();
 System.out.println("Enter employee salary");
 salary=sc.nextDouble();
  System.out.println("Enter employee address");
  address=sc.nextLine();
   System.out.println("Enter employee contact");
   contact=sc.nextLine();
    System.out.println("Enter employee gender");
    gender=sc.next().charAt(0);

    // Employee emp=new Employee();
    // emp.setId(id);
    // emp.setName(name);
    // emp.setSalary(salary);
    // emp.setAddress(address);
    // emp.setContact(contact);
    // emp.setGender(gender);

    System.out.println("--------------Employee details----------------");
System.out.println("Employee id is: "+id);
System.out.println("Employee name is: "+name);
System.out.println("Employee salary is: "+salary);
System.out.println("Employee address is: "+address);
System.out.println("Employee contact is: "+contact);
System.out.println("Employee gender is: "+gender);
    }
}