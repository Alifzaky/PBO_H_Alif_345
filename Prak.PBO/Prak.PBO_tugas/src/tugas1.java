import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        int role;
        String username, password;
        Scanner inputRole = new Scanner(System.in);
        Scanner inputUsername = new Scanner(System.in);
        Scanner inputPassword = new Scanner(System.in);

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
                System.out.print("Masukkan password : ");
                password = inputPassword.nextLine();
                if(username.equals("Admin345") && password.equals("Password345")){
                    System.out.println("login admin berhasi");
                }else{
                    System.out.println("Login gagal! Username atau password salah");
                }
                break;
            case 2:
                System.out.println("Login mahasiswa");
                System.out.print("Masukkan username : ");
                username = inputUsername.nextLine();
                System.out.print("Masukkan password : ");
                password = inputPassword.nextLine();
                if(username.equals("Alif Zaky Nasywa Muhammad") && password.equals("202410370110345")){
                    System.out.println("login mahasiswa berhasi");
                    System.out.printf("Nama : %s \n", username);
                    System.out.printf("NIM  : %s", password);
                }else{
                    System.out.println("Login gagal! nama atau nim salah");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
