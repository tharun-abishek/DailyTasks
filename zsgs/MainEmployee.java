package org.task1.zsgs;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEmployee {
	 public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        Employee emp1 = new Employee(100,"Tharun","Software Developer" , 3 , "Development" ,"123456");
		        Employee emp2 = new Employee(101 ,"Sabari","Android Developer",2,"Development","7891011");
		        Employee emp3 = new Employee(102,"Salman","IOS Developer",3,"Development","12131415");
		        Employee emp4 = new Employee(103,"Arun","Web Developer" ,4,"Development","16171819");
		        Employee emp5 = new Employee(104,"Avinash","Android Developer",2,"Development","20212223");

		       ArrayList<Employee> employee = new ArrayList<Employee>();
		       employee.add(emp1);
		       employee.add(emp2);
		       employee.add(emp3);
		       employee.add(emp4);
		       employee.add(emp5);
		       System.out.println("Enter Id of the Employee between 100 to 104: ");
		       int id = sc.nextInt();
		       for(int i=0;i<employee.size();i++){
		           if(employee.get(i).empid==id){
		               System.out.println("ID : " +employee.get(i).empid);
		               System.out.println("Name : "+employee.get(i).name);
		               System.out.println("Role : "+employee.get(i).role);
		               System.out.println("Experience : "+employee.get(i).experience);
		               System.out.println("Deparment : "+employee.get(i).department);
		               System.out.println("Contact : "+employee.get(i).contact);
		               sc.close();
		           }
		       }
		        



		    }
}
