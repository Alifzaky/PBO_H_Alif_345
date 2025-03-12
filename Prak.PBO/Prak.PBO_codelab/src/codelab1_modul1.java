import java.time.LocalDateTime;
import java.util.Scanner;
public class codelab1_modul1 {
    public static int hitungUmur(int age){

        return LocalDateTime.now().getYear() - age;

    }

    public static void main(String[] args) {
        String nama, jenisKelamin;
        int tahunLahir;


        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        nama = inputUser.nextLine();

        System.out.print("Masukkan jenis kelamin anda (P/L) :");
        jenisKelamin = inputUser.nextLine();

        System.out.print("Masukkan tahun lahir : ");
        tahunLahir = inputUser.nextInt();


        switch (jenisKelamin) {
            case "P":
                jenisKelamin = "Perempuan";
                break;
            case "L":
                jenisKelamin = "Laki-laki";
                break;
            default:
                jenisKelamin = "kaum luth";
        }

        System.out.println("========== Data Diri ==========");
        System.out.println("=============================== \n");
        System.out.printf("Nama          : %s \n", nama);
        System.out.printf("Jenis Kelamin : %s\n", jenisKelamin);
        System.out.printf("Umur          : %d tahun\n", hitungUmur(tahunLahir));

    }
}
