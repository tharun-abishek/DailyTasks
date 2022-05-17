package org.task1.zsgs;
import java.util.*;
public class ForEach {

	public static void main(String[] args) {
		List<Object> employeeData=new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		employeeData.add(0,name);
		System.out.println("Enter your age: ");
		byte age = sc.nextByte();
		employeeData.add(1,age);
		System.out.println("Enter your id_No: ");
		long id_No= sc.nextLong();
		employeeData.add(2,id_No);
		
		for(Object data : employeeData) {
			System.out.print(data+" " );
		}
		System.out.println();
		
	}

}
