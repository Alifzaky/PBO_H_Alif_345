public class Admin {

    String username, password;

    public void login() {
        if (username.equals("Admin345") && password.equals("Password345")) {
                System.out.println("login admin berhasi");
            } else {
                System.out.println("Login gagal! Username atau password salah");
            }
        }
}
