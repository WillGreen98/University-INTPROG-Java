package inClass.overloading;

public class OverloadingMain {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        overloading.example();
        System.out.println();
        overloading.example(2, 6);
        System.out.println();
        overloading.example(12.6);
        System.out.println();
        overloading.example(8);

    }
}
