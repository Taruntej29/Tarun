package Polymorphism;
class Bank
{
	String Bank_Name;
	Bank(String Bank_Name)
	{
		this.Bank_Name=Bank_Name;
	}
	void showBankInfo()
	{
		System.out.println("Bank name is: "+Bank_Name);
	}
}
class Account extends Bank
{
	String Account_Holder;
	double Balance;
	Account(String Bank_Name,String Account_Holder,double Balance)
	{
		super(Bank_Name);
		this.Account_Holder=Account_Holder;
		this.Balance=Balance;
	}
	void displayAccountInfo()
	{
		System.out.println(Account_Holder+" "+"Balance is "+Balance);
	}
}
class SavingAccount extends Account 
{
	double Interest_Rate;
	SavingAccount(String Bank_Name,String Account_Holder,double Balance,double Interest_Rate)
	{
		
		super(Bank_Name,Account_Holder,Balance);
		this.Interest_Rate=Interest_Rate;
	}
	void displayInterestRate()
	{
		System.out.println("Interest_Rate: "+Interest_Rate);
	}
	public static void main(String[] args) 
	{	
		SavingAccount s=new SavingAccount("PAYTM","TARUN",50000,10);
		s.showBankInfo();
		s.displayAccountInfo();
		s.displayInterestRate();
	}
}

