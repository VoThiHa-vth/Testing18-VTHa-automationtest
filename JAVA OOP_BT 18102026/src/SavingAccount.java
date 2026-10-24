// Lý thuyết về Interface: chỉ có tính trừu tượng
// interface Account {
// double getBalance();
// void setBalance(double balance);
// void withdraw(double amount);
//}

// public class SavingAccount implement Account // =>> câu lệnh kế thừa
// Khi kế thừa interface => BẮT BUỘC DEFINE đầy đủ các function trong interface

public class SavingAccount extends Account{
    public SavingAccount(double balance, String owner){
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0 || amount > getBalance())
            throw new IllegalArgumentException("Invalid amount");
        setBalance(getBalance() - amount);
        System.out.println("Withdraw successfully");
    }
}
