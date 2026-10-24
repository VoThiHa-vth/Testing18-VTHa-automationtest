//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Tài khoản ngân hàng
// saving account: không được rút tiền quá số dư trong tài khoản (gọi là thẻ ghi nợ)
// checking account: rút tối đa 1.000.000vnd
// Account - class cha
// saving account  - class con
// checking account  - class con


    SavingAccount account1 = new SavingAccount(1_000_000, "An");
//    account1.withdraw(2_000_000);  // case hiển thị msg lỗi
    account1.withdraw(500_000);
    System.out.println((account1.getBalance()));

    CheckingAccount account2 = new CheckingAccount(1_000_000, "Bình");
//    account2.withdraw(1_200_000); // case hiển thị msg lỗi
    account2.withdraw(8_000_00);
    System.out.println((account2.getBalance()));







    }
}