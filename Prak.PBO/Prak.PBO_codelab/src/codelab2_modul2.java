class rekeningBank {
    String nomorRekening, namaPemilik;
    double saldo;

    public void tampilkanInfo(){
        System.out.println("=======================================");
        System.out.println("Nomor rekening      : "+ nomorRekening);
        System.out.println("Nama pemilik        : "+ namaPemilik);
        System.out.println("Saldo               : "+ saldo);
        System.out.println("=======================================");
        System.out.println();
    }

    public void setorUang(){
        double jumlah = 200000;
        saldo += jumlah;
        System.out.println("===========================================================");
        System.out.printf ("%s Mentransfer uang sebesar Rp.%f. Saldo sekarang : Rp.%f \n",namaPemilik,jumlah,saldo);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void tarikUang(){
        double jumlah = 500000;

       if(saldo < jumlah){
           System.out.println("===========================================================");
           System.out.printf ("%s Menarik uang sebesar Rp.%f. Gagal (Saldo tidak mencukupi). Saldo sekarang : Rp.%f \n",namaPemilik,jumlah,saldo);
           System.out.println("===========================================================");
           System.out.println();
       }else {
           saldo -= jumlah;
           System.out.println("===========================================================");
           System.out.printf ("%s Menarik uang sebesar Rp.%f. Berhasil. Saldo sekarang : Rp.%f \n",namaPemilik,jumlah,saldo);
           System.out.println("===========================================================");
           System.out.println();
       }
    }

}
public class codelab2_modul2 {
    public static void main(String[] args) {
        rekeningBank rekeningBank1 = new rekeningBank();
        rekeningBank rekeningBank2 = new rekeningBank();

        rekeningBank1.nomorRekening = "202410370110345";
        rekeningBank1.namaPemilik = "Alif Zaky Nasywa Muhammad";
        rekeningBank1.saldo = 200000;

        rekeningBank2.nomorRekening = "202410370110332";
        rekeningBank2.namaPemilik = "Nur Muhammad Yazid Salim";
        rekeningBank2.saldo = 400000;

        rekeningBank1.tampilkanInfo();
        rekeningBank2.tampilkanInfo();

        rekeningBank1.setorUang();
        rekeningBank2.setorUang();

        rekeningBank1.tarikUang();
        rekeningBank2.tarikUang();

        rekeningBank1.tampilkanInfo();
        rekeningBank2.tampilkanInfo();


    }
}
