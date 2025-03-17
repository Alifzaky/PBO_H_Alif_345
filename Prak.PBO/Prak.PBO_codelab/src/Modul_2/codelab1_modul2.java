package Modul_2;

class Hewan {
    String nama, jenis, suara;

    public void tampilkanInfo(){
        System.out.println("Nama hewan  : "+ nama);
        System.out.println("Jenis       : "+ jenis);
        System.out.println("Suara       : "+ suara);
        System.out.println("======================");
    }
}
public class codelab1_modul2 {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.nama = "Kucing";
        hewan1.jenis = "Mamalia";
        hewan1.suara = "Nyann--";

        hewan2.nama = "Anjing";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Woof-Wooff!!";

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();

    }
}
