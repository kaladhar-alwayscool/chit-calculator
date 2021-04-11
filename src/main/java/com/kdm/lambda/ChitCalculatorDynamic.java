package com.kdm.lambda;

import java.util.Scanner;

public class ChitCalculatorDynamic {

	
	public static void main(String[] args) {
		double months;
		double interestMonths;
		double totalPaid;
		double totalTaken;
		double bankInterestRate;
		double bankMonths = 6;
		//double totalAmount = 100000;
		//int commissionPercentage = 5;
		
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of months : ");
        months = scan.nextDouble();
        interestMonths = months/2;
        
        System.out.print("Enter total paid amount : ");
        totalPaid = scan.nextDouble();
        
        System.out.print("Enter total taken amount : ");
        totalTaken = scan.nextDouble();
        
        System.out.print("Enter bank interest rate : ");
        bankInterestRate = scan.nextDouble();
        
        System.out.print("Enter bank months : ");
        bankMonths = scan.nextDouble();
        
        scan.close();
		
		/*
		 * double commission = (totalAmount/100)*commissionPercentage;
		 * System.out.println("commission taken : "+commission);
		 */
		System.out.println("\n\nSUMMARY\n------------");
		
		double chitInterestGained = totalTaken - totalPaid;
		
		System.out.println("chit interest gain : "+chitInterestGained);
		double perMonthValue = chitInterestGained/interestMonths;
		// vaddi calculation (interest) i = ptr/100
		double interestRate = (chitInterestGained*100)/(totalPaid*interestMonths);
		System.out.println("chit interest rate : "+interestRate);
		
		double bankInterestGained = (totalTaken*bankMonths*bankInterestRate)/100;
		System.out.println("Bank Interest Gain : "+bankInterestGained);
		
		double totalGainedAmount = chitInterestGained + bankInterestGained;
		System.out.println("Total Gain : "+totalGainedAmount);
		
		double totalInterestRate = (totalGainedAmount*100)/(totalPaid*interestMonths);
		System.out.println("interest rate : "+totalInterestRate);
		
		
	}

	
	 
}
