public class BankAccountClient{
	public static void main(String[] args) {

			//constructor
		BankAccount poorCollegeStudent = new BankAccount("PoorCollegeStudent");
			//setter
		poorCollegeStudent.setInterestRate(0.01);
		poorCollegeStudent.getOwner();
		poorCollegeStudent.getBalance();
		poorCollegeStudent.getIsChecking();
		poorCollegeStudent.getInterestRate();

		//constructor

		BankAccount scroogeMcDuck = new BankAccount("Scrooge McDuck",50000.0,false,0.85);
		
			//setter
		scroogeMcDuck.setInterestRate(0.85);
		

		//using methods

		poorCollegeStudent.deposit(600.00);
		scroogeMcDuck.withdraw(2250.00);
		double a = 0.01 +0.5;
		poorCollegeStudent.setInterestRate(a );
		double b = 0.85+ 0.5;
		scroogeMcDuck.setInterestRate(b);
		poorCollegeStudent.payInterest();
		scroogeMcDuck.payInterest();



}
	}
	