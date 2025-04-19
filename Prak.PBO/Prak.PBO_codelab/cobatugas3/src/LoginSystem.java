import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Input : ");
        int role = input.nextInt();
        input.nextLine(); // buang newline

        switch (role) {
            case 1:
                System.out.println("Login Admin");
                System.out.print("Masukkan nama: ");
                String namaAdmin = input.nextLine();
                System.out.print("Masukkan NIM: ");
                String nimAdmin = input.nextLine();

                Admin admin = new Admin(namaAdmin, nimAdmin);
                System.out.print("Masukkan username: ");
                admin.setUsername(input.nextLine());
                System.out.print("Masukkan password: ");
                admin.setPassword(input.nextLine());

                admin.login();
                break;

            case 2:
                System.out.println("Login Mahasiswa");
                System.out.print("Masukkan nama: ");
                String namaMhs = input.nextLine();
                System.out.print("Masukkan NIM: ");
                String nimMhs = input.nextLine();

                Mahasiswa mhs = new Mahasiswa(namaMhs, nimMhs);
                mhs.login();
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }

        input.close();
    }
}
