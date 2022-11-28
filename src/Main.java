import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Parallelepipedtin parallelepipedtin = new Parallelepipedtin();
            Scanner scanner = new Scanner(System.in);
            System.out.println("              Select             ");
            System.out.println("AREA== 1                  VOLUME== 2");
            int areaVolume = scanner.nextInt();


            if (areaVolume == 1) {
                System.out.println("Height");
                int height = scanner.nextInt();
                System.out.println("Width");
                int width = scanner.nextInt();
                System.out.println("Length");
                int length = scanner.nextInt();
                if (height > 0 || width > 0 || length > 0) {

                    parallelepipedtin.formula(height, length, width);

                    if (height < 10 && length < 10 && width < 10) {

                    } else {
                        throw new RuntimeException("san 10 chon bolo albait!!");
                    }
                } else {
                    throw new RuntimeException("ters san berbe!!");
                }

            } else if (areaVolume == 2) {
                System.out.println("Height");
                int height = scanner.nextInt();
                System.out.println("Width");
                int width = scanner.nextInt();
                System.out.println("Length");
                int length = scanner.nextInt();
                if (height > 0 && width > 0 && length > 0) {

                    parallelepipedtin.formula2(height, length, width);

                    if (height < 10 && length < 10 && width < 10) {

                    } else {
                        throw new RuntimeException("san 10 chon bolo albait!!");
                    }
                } else {
                    throw new RuntimeException("ters san berbe!!");
                }

            }
        } catch (InputMismatchException a) {
            System.err.println("Tamga berugo bolboit");
        }


    }

}
