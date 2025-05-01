package Modul_4.Perpustakaan;

public class Anggota implements Peminjaman{
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
    }


    @Override
    public void pinjamBuku(String judul){
        System.out.printf("Anggota : %s dengan ID (%s) \n", nama, idAnggota);
        System.out.println(nama + " dengan ID : "+ idAnggota + " Meminjam buku dengan judul: "+ judul+ "\n");
    }

    @Override
    public void pinjamBuku(String judul, int durasi) {
        System.out.printf("Anggota : %s dengan ID (%s) \n", nama, idAnggota);
        System.out.println(nama + " dengan ID: "+ idAnggota + " Meminjam buku dengan judul: "+judul+" selama "+ durasi+ " hari \n");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama+ " dengan ID: "+idAnggota+ " Mengembalikan buku dengan judul "+judul);
    }
}
