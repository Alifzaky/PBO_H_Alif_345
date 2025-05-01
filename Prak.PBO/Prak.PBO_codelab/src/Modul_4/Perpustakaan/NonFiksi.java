package Modul_4.Perpustakaan;

public class NonFiksi extends Buku{
    public NonFiksi(String judul, String penulis){
        super(judul,penulis);
    }

    @Override
    public void displayInfo(){
        System.out.println("Buku non fiksi: "+ judul+ " oleh: "+ penulis );
    }
}
