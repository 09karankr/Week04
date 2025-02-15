package banktransactionsystem;

public class BankAccountSystem {
    static class InsufficientFundsException extends Exception{
        private double amount;
        public InsufficientFundsException(String message, double amount){
            super(message);
            this.amount = amount;
        }
        public double getAmount(){
            return amount;
        }
    }
    public static class BankAccount{
        private double balance;
        public BankAccount(double initialBalance){
            this.balance = initialBalance;
        }
        public void withdrawl(double amount) throws InsufficientFundsException{
            if (amount> balance){
                throw new InsufficientFundsException("Insufficient funds for withdrawal", amount - balance);
            }
            balance -= amount;
        }
        public double getBalance(){
            return  balance;
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(999999.0);
        try {
            System.out.println("Withdrawal 5000");
            bankAccount.withdrawl(725683);
            System.out.println("New Balance : " + bankAccount.getBalance());
        } catch (InsufficientFundsException e){
            System.out.println("Exception is " + e.getMessage());
            System.out.println("Shortfall " + e.getAmount());
        }
    }
}
