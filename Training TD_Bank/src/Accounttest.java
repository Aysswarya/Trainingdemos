import com.sun.java_cup.internal.runtime.Scanner;

public class Accounttest {
	int accountNo;
	double accountBalance;
	String accountType;
	static int accountCount;
	
	public Accounttest()
	{
		System.out.println("Default constructor");
	}

	    public Accounttest(int accountNo, double accountBalance, String accountType) {
		//super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	    
	    public int getAccountNo() {
			return accountNo;
		}


		public double getAccountBalance() {
			return accountBalance;
		}

		public String getAccountType() {
			return accountType;
		}

		public static int getAccountCount() {
			return accountCount;
		}

		public static void setAccountCount(int accountCount) {
			Accounttest.accountCount = accountCount;
		}

		void depositAmount(double amount)
	    {
	    	accountBalance = accountBalance + amount;
	    }
	    void getAccountDetails()
	    {
	    	System.out.println("The account details are ");
	    }
	    
		public static void main(String[] args) {
	        //Scanner scanner = new Scanner(System.in);
	        Accounttest saving = new Accounttest(111223344,20000.0,"Savings");
	       saving.getAccountBalance();
	       saving.getAccountDetails();
	       Accounttest current = new Accounttest();
	       current.setAccountCount(2);
	       double accountBalance = 15600.00;
	       current.depositAmount(10000.00);
	       current.getAccountBalance();
	       current.getAccountDetails();
	        

	        }
	}

