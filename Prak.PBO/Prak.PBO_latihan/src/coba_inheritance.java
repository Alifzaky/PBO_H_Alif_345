class tes1{
    int a = 1;
    int b = 2;
}

class tes2 extends tes1{
    int c = 3;
    int d = 4;
}

public class coba_inheritance {
    public static void main(String[] args) {
        tes2 objek = new tes2();
        System.out.println(objek.a);
        System.out.println(objek.b);
        System.out.println(objek.c);
        System.out.println(objek.d);
    }
}
