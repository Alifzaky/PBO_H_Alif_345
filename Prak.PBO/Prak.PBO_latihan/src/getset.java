class namaSiswa{
    String nama;

    void setName(String nama){
        this.nama = nama;
    }

    String getName(){
        return nama;
    }
}


public class getset {
    public static void main(String[] args) {
        namaSiswa obj = new namaSiswa();
        obj.setName("Alif");

        System.out.println("Nama : "+ obj.getName());
    }
}
