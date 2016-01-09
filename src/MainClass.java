import java.io.IOException;
import java.util.Scanner;


/**
 * Created by Вадим on 12.12.2015.
 */
public class MainClass {

    public static void main(String[] args) throws IOException {

//        int[] count = {1, 2, 3, 4};
        int target[] = {1, 2, 3, 4};
        String ananas[] = {"hi", "holla", "guy"};
//        int read = System.in.read();
        Scanner sc = new Scanner(System.in);
 String count = System.in.read();
        int target1 = sc.nextInt();
        String ananas1 = sc.next();
        switch (count) {
            case 1:

                switch (target1) {
                    case 1:
                        System.out.println(target[1]);
                        break;
                    case 2:
                        System.out.println(target[2]);
                        break;
                }
                break;
            case 2:

                switch (ananas1) {
                    case "hi":
                        System.out.println("ananas is working 1");
                        break;
                    case "holla":
                        System.out.println("ananas is working 2");
                        break;

                }
                break;
        }
    }
}