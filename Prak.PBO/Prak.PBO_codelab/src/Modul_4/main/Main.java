package Modul_4.main;
import Modul_4.Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        Buku fiksi = new Fiksi("Logika Diatas Segalanya","Zaky Real");
        Buku nonFiksi = new NonFiksi("Indah Pada Waktunya", "Zaky pengarang\n");

        fiksi.displayInfo();
        nonFiksi.displayInfo();

        Anggota anggota_1 = new Anggota("ALif","345");
        Anggota anggota_2 = new Anggota("Raffi","341");
        Anggota anggota_3 = new Anggota("Ridwan", "343");

        anggota_1.pinjamBuku("Logika Diatas Segalanya");
        anggota_2.pinjamBuku("Indah Pada Waktunya",7);
        anggota_3.pinjamBuku("Indah Pada Saatnya",7);

        anggota_1.kembalikanBuku("Logika Diatas Segalanya");
        anggota_2.kembalikanBuku("Indah Pada Waktunya");
        anggota_3.kembalikanBuku("Indah Pada Saatnya");
    }
}
