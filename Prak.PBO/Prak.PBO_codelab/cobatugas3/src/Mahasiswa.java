public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        if ("Alif Zaky Nasywa Muhammad".equals(getNama()) &&
                "202410370110345".equals(getNim())) {
            System.out.println("Login mahasiswa berhasil");
            displayInfo();
        } else {
            System.out.println("Login gagal! Nama atau NIM salah");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Halo Mahasiswa, login berhasil!");
        super.displayInfo();
    }
}
