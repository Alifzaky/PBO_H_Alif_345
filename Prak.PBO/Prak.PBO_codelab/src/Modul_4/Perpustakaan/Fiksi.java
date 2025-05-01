package Modul_4.Perpustakaan;

public class Fiksi extends Buku {

    public Fiksi(String judul, String penulis){
        super(judul,penulis);
    }

    @Override
    public void displayInfo(){
        System.out.println("Buku fiksi: "+ judul+ " oleh: "+ penulis );
    }
}
