package com.kdm.lambda;

public class ChitCalculator {

	
	public static void main(String[] args) {
		double months = 10;
		double interestMonths = 12;
		double totalPaid = 100000;
		double totalTaken = 112000;
		double bankInterestRate = 0.5;
		double bankMonths = 6;
		double totalAmount = 100000;
		int commissionPercentage = 5;
		
		double commission = (totalAmount/100)*commissionPercentage;
		System.out.println("commission taken : "+commission);
		
		
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
