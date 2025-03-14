import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        int role;
        String username, password;
        Scanner inputRole     = new Scanner(System.in);
        Scanner inputUsername = new Scanner(System.in);
        Scanner inputPassword = new Scanner(System.in);

        Admin objekAdmin   = new Admin();
        Mahasiswa objekMhs = new Mahasiswa();

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Input : ");
        role = inputRole.nextInt();
        switch (role){
            case 1:
                System.out.println("Login admin");
                System.out.print("Masukkan username : ");
                username = inputUsername.nextLine();
                objekAdmin.username = username;
                System.out.print("Masukkan password : ");
                password = inputPassword.nextLine();
                objekAdmin.password = password;
                objekAdmin.login();
                break;
            case 2:
                System.out.println("Login mahasiswa");
                System.out.print("Masukkan username : ");
                username = inputUsername.nextLine();
                objekMhs.username = username;
                System.out.print("Masukkan password : ");
                password = inputPassword.nextLine();
                objekMhs.password = password;
                objekMhs.login();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
