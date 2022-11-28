import java.util.Scanner;

public class Parallelepipedtin {
    public void formula(int height, int length, int width) throws ArithmeticException {
        System.out.println("Area: "+2 * ((height * length) + (length * width) + (height * width)));
    }

    public void formula2(int height, int length, int width) {
        System.out.println("Volume: "+(length * width * height));
    }
}
