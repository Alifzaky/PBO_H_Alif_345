import java.util.Scanner;

class Admin{
    String username, password;

    public void login() {
        if (username.equals("Admin345") && password.equals("Password345")) {
            System.out.println("login admin berhasi");
        } else {
            System.out.println("Login gagal! Username atau password salah");
        }
    }
}

class Mahasiswa {
    String username, password;

    public void login(){
        if(username.equals("Alif Zaky Nasywa Muhammad") && password.equals("202410370110345")){
            System.out.println("login mahasiswa berhasi");
            displayInfo();
        }else{
            System.out.println("Login gagal! nama atau nim salah");
        }
    }

    public void displayInfo(){
        System.out.printf("Nama : %s \n", username);
        System.out.printf("NIM  : %s"   , password);
    }
}

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
