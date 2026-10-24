public class CheckingAccount extends Account{
    private static final double OVERDRAFT_LIMIT = 1_000_000;

    public CheckingAccount(double balance, String owner){
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0 || amount > OVERDRAFT_LIMIT){
            throw new IllegalArgumentException("Invalid amount");
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdraw successfully");

    }
}
