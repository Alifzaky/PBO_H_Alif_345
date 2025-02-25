import java.util.Scanner;
public class Codelab_1 {
    public static void main(String[] args) {
        String nama, jenisKelamin;
        int tahunLahir, tahunSekarang, umur;
        tahunSekarang = 2025;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        nama = inputUser.nextLine();

        System.out.print("Masukkan jenis kelamin anda (P/L) :");
        jenisKelamin = inputUser.nextLine();

        System.out.print("Masukkan tahun lahir : ");
        tahunLahir = inputUser.nextInt();
        umur = tahunSekarang - tahunLahir;

        switch (jenisKelamin) {
            case "P":
                System.out.println("Jenis kelamin : perempuan");
                break;
            case "L":
                System.out.println("Jenis kelamin : laki-laki");
                break;
            default:
                System.out.println("Memilih untuk tidak memberi tahu");

        }

        System.out.println("========== Data Diri ==========");
        System.out.println("=============================== \n");
        System.out.printf("Nama          : %s \n", nama);
        System.out.printf("Jenis Kelamin : %s\n", jenisKelamin);
        System.out.printf("Umur          : %d tahun\n", umur);

    }

}
