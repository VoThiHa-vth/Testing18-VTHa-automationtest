public class LoginPage {
// thuộc tính: ô input cho username, password, nút login
    String username;
    String password;
    String loginBtn;

    public LoginPage() {}

    public LoginPage (String username, String password, String loginBtn){
        this.username = username;
        this.password = password;
        this.loginBtn = loginBtn;
    }

// không cần kết quả trả về nên dùng VOID cũng oki nhé
    public void  enterUsername (String username){
        System.out.println("Enter username: ");
        this.username = username;
    }

    public void  enterPassword (String password){
        System.out.println("Enter password: ");
        this.password = password;
    }

    public void  clickLoginBtn (){
        System.out.println("Click login button");
    }

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();
    }

    public boolean isLoginSuccess(){
        if (username.equals("admin") && password.equals("123456")){
            return true;
        }
        return  false;
    }





}
