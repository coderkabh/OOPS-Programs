public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;

    }

    Account(int id,double balance) {
        this();
        //this(); This is done automatically to take the default arguments from non-arg constructor (doubtful)
        this.id = id;
        this.balance = balance;

    }

    //mutator or setter
        //setter for id
    public void setId(int id){
        this.id=id;
    }
    //setter for balance
    public void setBalance(double balance){
        this.balance=balance;
    }
    //setter for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }

    //accessor or getter
        //getter for id
    public int getId(){
        return id;
    }

    //getter for balance
    public double getBalance(){
        return balance;
    }

    //getter for getAnnualInterestRate
    public  double getAnnualInterestRate(){
        return annualInterestRate;
    }

    //define getMonthlyInterestRate
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    //define getMonthlyInterest
    public double getMonthlyInterest(){
        return (balance*getMonthlyInterestRate())/100;
    }

    //define withdraw
    public boolean withdraw(double withdrawAmount){
        if (withdrawAmount<=balance){
            balance=balance-withdrawAmount;
            return true;
        }

        return  false;

    }

    //define deposit
    public double deposit(double depositAmount){
            return balance+=depositAmount;

    }




}


