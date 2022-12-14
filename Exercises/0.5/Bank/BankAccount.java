public class BankAccount{
    private String customerName;
    private int customerNum;
    private boolean isChecking;
    private double balance;

    public BankAccount(){
    }
    public BankAccount(String name, int number, boolean checking, double currentBal){
        this.customerName = name;
        this.customerNum = number;
        this.isChecking = checking;
        this.balance = currentBal;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public void setCustomerNum(int num){
        this.customerNum = num;
    }
    public void setIsChecking(boolean checking){
        this.isChecking = checking;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getName(){
        return this.customerName;
    }
    public int getCustNum(){
        return this.customerNum;
    }
    public String getChecking(){
        if(isChecking = true){
            return "This is a checking account";
        }
        else {
            return "This is not a checking account";
        }
        }
    public double getBal(){
        return balance;
    }
    public String deposit(double amount){
        this.balance = this.balance + amount;
        return "Your balance is now: $" + this.balance;
    }
    public double displayBalance(){
        return balance;
    }
    public String withdraw(double amount){
        if(amount <= this.balance){
            this.balance = this.balance - amount;
            return "$" + amount + " was withdrawled succesfully \nCurrent Balance: $" + this.balance;
        }
        else{
            return "Your balance is not high enough to withdraw $" + amount + "\nCurrent Balance: $" + this.balance;
        }
    }
    public String toString(){
        return "Name: " + this.customerName
        + "\nAccount number: " + this.customerNum
        + "\nAccount type: " + getChecking()
        + "\nBalance: $" + this.balance;
    }
}