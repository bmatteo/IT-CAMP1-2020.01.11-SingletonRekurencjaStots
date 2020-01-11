package pl.camp.it;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(silnia(5));

        a();
    }

    public static void a() {
        System.out.println("metoda a");
        b();
    }

    public static void b() {
        System.out.println("metoda b");
        c();
    }

    public static void c() {
        System.out.println("metoda c");
        d();
    }

    public static void d() {
        System.out.println("metoda d");
        int[] a = new int[1];
        a[2] = 3;
    }

    public static int silnia(int a) {

        if(a == 1) {
            return 1;
        } else {
            return a * silnia(a-1);
        }
    }
}
