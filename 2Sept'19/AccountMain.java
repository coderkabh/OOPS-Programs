public class AccountMain {
    public static void main(String[] args) {
        int id=1122;
        double initialBalance=20000;
        double depositAmount=3000;
        double withdrawAmount=2500;
        double annualInterestRate=4.5;

        Account a1=new Account(id,initialBalance);
        a1.setAnnualInterestRate(annualInterestRate); //setting value by setter
        //System.out.println(a1.getAnnualInterestRate());

        if(a1.withdraw(withdrawAmount)){
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Withdrawn Amount = "+withdrawAmount);
            System.out.println("Remaining Amount is = "+a1.getBalance());
        }
        else{
            System.out.println("Insufficient Balance");
        }

        double newBalance=a1.deposit(depositAmount);
        System.out.println("Your Account is Credited with "+depositAmount);
        System.out.println("Balance is = "+newBalance);

        System.out.println("Monthly interest is ="+ a1.getAnnualInterestRate());
    }
}
