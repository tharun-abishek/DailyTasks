package org.task1.zsgs;
import java.util.Scanner;

public class switchWithoutBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		String vowel=sc.next();
		String ch=vowel.toLowerCase();
		//switch without break
		/*switch(ch) {
		case "a":
			System.out.println("Entered alphabet is" +ch+ " vowel");
		case "e":
			System.out.println("Entered alphabet is"+ch+" vowel");
		case "i":
			System.out.println("Entered alphabet is"+ch+" vowel");
		case "0":
			System.out.println("Entered alphabet is"+ch+" vowel");
		case "u":
			System.out.println("Entered alphabet is"+ch+"  vowel");
		default:
			System.out.println("Entered alphabet is"+ch+"  consonant");
			
			//switch with break
			switch(ch) {
			case "a":
				System.out.println("Entered alphabet is "+ch+ " vowel");
				break;
			case "e":
				System.out.println("Entered alphabet is "+ch+" vowel");
				break;
			case "i":
				System.out.println("Entered alphabet is "+ch+" vowel");
				break;
			case "0":
				System.out.println("Entered alphabet is "+ch+" vowel");
				break;
			case "u":
				System.out.println("Entered alphabet is "+ch+"  vowel");
				break;
			default:
				System.out.println("Entered alphabet is "+ch+"  consonant");
		
		//using if else
		if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")) */
		if(ch="a")
			System.out.println(ch+" is a vowel");	
			
		else 
			System.out.println(ch+" is a consonant");
		
	}

	}


