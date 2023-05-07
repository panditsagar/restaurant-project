//Project Restuarent v 1.0
package foundation;
import java.util.Scanner;

public class program_47{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = 0;
        int ch;
        do {
            System.out.println("Welcome to baba ka dhaba");
            System.out.println("1 - Indian\n2 - Chinise\n3 - Italian");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("1 - Butter panner masala & kulcha");
                    System.out.println("2 - Daal baati\n3 - Masala Dosa");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> amt += 170;
                        case 2 -> amt += 200;
                        case 3 -> amt += 50;
                    }
                }
                case 2 -> {
                    System.out.println("1 - Chomin");
                    System.out.println("2 - Hakkaa Neudals\n3 - Chilli Panner");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> amt += 60;
                        case 2 -> amt += 70;
                        case 3 -> amt += 150;
                    }
                }
                case 3 -> {
                    System.out.println("1 -  Caprese Salad with Pesto Sauce");
                    System.out.println("2 - Panzenella \n3 -  Bruschetta");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1 -> amt += 1200;
                        case 2 -> amt += 450;
                        case 3 -> amt += 680;
                    }
                }
            }
            System.out.println("Press 0 to exit");
            ch = sc.nextInt();
        } while (ch != 0);
        System.out.println("Amount = " + amt);
    }
}


