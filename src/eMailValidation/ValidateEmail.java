package eMailValidation;

import java.util.*;
import java.util.regex.*;

public class ValidateEmail {
	void validation(String arr[]) 
	{
		Scanner sc  =  new Scanner(System.in); 
		System.out.println("enter user String ");
		String user_input = sc.next();
		 Pattern p = Pattern.compile("[\s[a-zA-z0-9]+[.]*?[a-zA-z0-9]+[@][a-zA-z0-9]+[.][a-zA-z0-9]+\s]*[a-zA-z0-9]");
		 Matcher c = p.matcher(user_input); 
		 boolean a = c.matches();
		 
		 int q=0;
		 for(int i=0;i<arr.length;i++) 
		 {
			 String b=arr[i];
			 if(b.equals(user_input)) 
			 {
				 q++;
			 }
			
		 }
		 if(q>0) 
		 {
			 System.out.println("email id is present in the array");
		 }
		 else 
		 {
			 System.out.println("not present in the array");
		 }
		 
	}

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		String  arr[] = {
				"ladha@outlook.in",
				"harnish@hotmail.com","surbhi@gmail.com","mansi.32@reddit.com","yadu97@yahoo.com"
		};
		
		ValidateEmail obj =  new ValidateEmail();
			obj.validation(arr);

	}

}
