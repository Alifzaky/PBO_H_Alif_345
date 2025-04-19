class mahasiswa{
    String nama;
    String jurusan;

    mahasiswa(String nama, String jurusan){
        this.nama = nama;
        this.jurusan = jurusan;
    }
    void talk(){
        System.out.println("Nama saya adalah " + nama + " Dan jurusan saya adalah "+ jurusan);
    }
}

class jurusan{
    String nama;
    jurusan(String nama){
        this.nama = nama;
    }
}




public class prak_cons {
    public static void main(String[] args) {
        jurusan jurus1 = new jurusan("Informatika");
        jurusan jurus2 = new jurusan("TKJ");
        jurusan jurus3 = new jurusan("Sipil");

        mahasiswa mahasis1 = new mahasiswa("Alif", jurus1.nama);
        mahasiswa mahasis2 = new mahasiswa("Zaky", jurus2.nama);
        mahasiswa mahasis3 = new mahasiswa("Nasywa", jurus3.nama);

        mahasis1.talk();
        mahasis2.talk();
        mahasis3.talk();
    }
}