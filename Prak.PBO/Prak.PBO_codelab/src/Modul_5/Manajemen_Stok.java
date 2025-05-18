package Modul_5;
import javax.naming.directory.BasicAttribute;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Manajemen_Stok {

    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        daftarBarang.add(new Barang("Buku", 30));
        daftarBarang.add(new Barang("Pulpen", 20));
        daftarBarang.add(new Barang("Penggaris", 10));

        int pilihan = -1;

        while(pilihan != 0){
            System.out.println("====== Selamat Datang ======");
            System.out.println("====== Menu manajemen stok ======");
            System.out.println("1. Tambah data baru");
            System.out.println("2. Tampilkan data barang");
            System.out.println("3. Kurangi data barang");
            System.out.println("4. Hapus data");
            System.out.println("0. Keluar");
            System.out.println("Pilihan anda : ");

            try{
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan){
                    case 1:
                        System.out.println("Nama barang : ");
                        String nama = input.nextLine();
                        System.out.println("Jumlah stok awal : ");
                        try{
                            int stok = input.nextInt();
                            input.nextLine();
                            daftarBarang.add(new Barang(nama,stok));
                            System.out.println("Data berhasil ditambahkan");
                        } catch (InputMismatchException e){
                            System.out.println("Stok harus berupa angka");
                            input.nextLine();
                        }
                        break;
                    case 2:
                        if (daftarBarang.isEmpty()){
                            System.out.println("Data barang kosong");
                        }else{
                            System.out.println("====== Daftar barang ========");
                            for (Barang b: daftarBarang){
                                System.out.println("- "+ b.getNama() + "( Stok : " + b.getStok() + ")");
                            }
                        }
                        break;
                    case 3:
                        if (daftarBarang.isEmpty()){
                            System.out.println("Tidak ada barang yang dapat dikurangi stoknya");
                            break;
                        }

                        System.out.println(" Pilih barang : ");
                        for(int i = 0; i < daftarBarang.size(); i++){
                            System.out.println((i + 1)  + ". "+ daftarBarang.get(i).getNama() + "(Stok : " + daftarBarang.get(i).getStok() + " )");
                        }
                        try{
                            System.out.println("Masukkan nomor indeks barang : ");
                            int index = input.nextInt();
                            input.nextLine();

                            Barang barangDipilih = daftarBarang.get(index - 1);

                            System.out.println("Jumlah stok yang akan diambil : ");
                            int jumlah = input.nextInt();
                            input.nextLine();

                            if (jumlah > barangDipilih.getStok()){
                                throw new ExceptionStokTidakCukup("Stok untuk "+ barangDipilih.getNama() + " hanya tersisa " + barangDipilih.getStok());
                            }

                            barangDipilih.setStok(barangDipilih.getStok() - jumlah);
                            System.out.println("Jumlah stok berhasil dikurangi");
                        } catch (InputMismatchException e){
                            System.out.println("Input harus berupa angka");
                            input.nextLine();
                        }catch(IndexOutOfBoundsException e){
                            System.out.println("Indeks tidak valid");
                        }catch(ExceptionStokTidakCukup e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        if (daftarBarang.isEmpty()){
                            System.out.println("GAK BISA HAPUUSSSS");
                            break;
                        }
                        System.out.println(" Daftar barang : ");
                        for(int i = 0; i < daftarBarang.size(); i++){
                            Barang barangDihapus = daftarBarang.get(i);
                            System.out.println((i + 1)  + ". "+ daftarBarang.get(i).getNama() + "(Stok : " + daftarBarang.get(i).getStok() + " )");
                        }
                        try{
                            System.out.println("Masukkan data yang ingin dihapus : ");
                            int hapusData = input.nextInt();
                            input.nextLine();

                            if(hapusData < 0 || hapusData >= daftarBarang.size()){
                                System.out.println("Input tidak valid");
                            }else {
                                Barang barangDihapus = daftarBarang.remove(hapusData -1);
                                System.out.println("Barang " + barangDihapus.getNama()+" berhasil dihapus");
                            }
                        }catch(InputMismatchException e){
                            System.out.println("Input tidak valid");
                            input.nextLine();
                        }
                        break;

                    case 0:
                        System.out.println("TERIMAA KASIIIIIHHHH");
                        break;

                    default:
                        System.out.println("Pilihan apa yang kau pilih niiii");
                }
            } catch (InputMismatchException e){
                System.out.println("Masukkan angka yang valid");
                input.nextLine();
            }
        }
        input.close();
    }


}
