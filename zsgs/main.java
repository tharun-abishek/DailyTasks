package org.task1.zsgs;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		studentRecord ob = new studentRecord();
		System.out.println("Enter the Name:");
		String Name = input.nextLine();
		ob.setName(Name);
		System.out.println("Enter your Age: ");
		int Age =input.nextInt();
		ob.setAge(Age);
		System.out.println("Enter the EmailId: ");
		String EmailId=input.next();
		ob.setEmailId(EmailId);
		System.out.println("Enter the gender: ");
		String gender=input.next();
		ob.setGender(gender);
		System.out.println("Enter the mobileno: ");
		long mobileno=input.nextLong();
		ob.setMobileNumber(mobileno);
		System.out.println("Enter the regno: ");
		long regno=input.nextLong();
		ob.setRegNo(regno);
		
		System.out.println("Name: "+ob.getName());
		System.out.println("Age : "+ob.getAge());
		System.out.println("EmailId : "+ob.getEmailId());
		System.out.println("Gender : "+ob.getGender());
		System.out.println("MobNo : "+ob.getMobileNumber());
		System.out.println("RegNo : "+ob.getRegNo());
		
	}

}
