package Polymorphism;
public class Bank5 
{
	String Bank_Name;
	Bank5(String Bank_Name)
	{
		this.Bank_Name=Bank_Name;
	}
	void showBankInfo()
	{
		System.out.println("The Bank Name is: "+Bank_Name);
	}
}
class SavingsAccount extends Bank5
{
	String Account_Holder;
	double Balance;
	SavingsAccount(String Bank_Name,String Account_Holder,double Balance )
	{
		super(Bank_Name);
		this.Account_Holder=Account_Holder;
		this.Balance=Balance;
	}
	void displayAccountInfo()
	{
		System.out.println("Savings Account");
		System.out.println("Account holder "+Account_Holder+" Balnace is: "+Balance);
	}
}
class CurrentAccount extends Bank5
{
	String Account_Holder;
	double Balance;
	CurrentAccount(String Bank_Name,String Account_Holder,double Balance)
	{
		super(Bank_Name);
		this.Account_Holder=Account_Holder;
		this.Balance=Balance;
	}
	void displayAccountInfo()
	{
		System.out.println("Current Account");
		System.out.println("Account holder "+Account_Holder+" Balnace is: "+Balance);
	}
	public static void main(String[] args) 
	{
		SavingsAccount s=new SavingsAccount("Paytm","Tarun",50000);
		s.showBankInfo();
		s.displayAccountInfo();
		CurrentAccount c=new CurrentAccount("Patym","Shafi",50000);
		c.showBankInfo();
		c.displayAccountInfo();
	}
}