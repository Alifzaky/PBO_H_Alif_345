class alatTulis{
    String nama;
    int harga;

    alatTulis(String nama, int harga){
        this.nama = nama;
        this.harga = harga;

    }

}
public class tes_cons {
    public static void main(String[] args) {
        alatTulis alat1 = new alatTulis("Pensil", 1000);
        alatTulis alat2 = new alatTulis("Pulpen", 2000);
        alatTulis alat3 = new alatTulis("Penggaris", 3000);
        alatTulis alat4 = new alatTulis("Buku", 4000);
    }
}
