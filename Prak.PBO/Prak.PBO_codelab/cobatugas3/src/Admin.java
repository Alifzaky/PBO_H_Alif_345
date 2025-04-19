public class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void login() {
        if ("Admin345".equals(username) && "Password345".equals(password)) {
            System.out.println("Login admin berhasil");
            displayInfo();
        } else {
            System.out.println("Login gagal! Username atau password salah");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Halo Admin, login berhasil!");
        super.displayInfo();
    }
}
