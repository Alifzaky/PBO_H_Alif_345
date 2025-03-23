class Mobil{
    String nama;
    int speed;

    Mobil(String nama, int speed){
        this.nama = nama;
        this.speed = speed;
        System.out.printf("Nama motor : %s dan speed %d \n", this.nama, this.speed);
    }

}

public class penerapan_construktor {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota",123);
        Mobil mobil2 = new Mobil("Yamaha", 143);
        Mobil mobil3 = new Mobil("Jazz",200);
    }
}


