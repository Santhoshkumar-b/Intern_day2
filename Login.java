package com.santhoshkumar;

public class Login extends firstpage {
	public void loginPage()
	{
		System.out.println("Enter your mobile number");
		String mobile_no=sc.next();
		while(mobile_no.length()!=10)
		{
			System.out.println("Please enter a valid mobile number");
			System.out.println("Enter your mobile number");
			mobile_no=sc.next();
	
		}
		
		System.out.println("Enter your password");
		String password=sc.next();
		while(password.length()<8)
		{
			System.out.println("Enter password with Atleast 8 character");
			System.out.println("Enter your password");
			password=sc.next();
		}
		
		
		
	}

}
