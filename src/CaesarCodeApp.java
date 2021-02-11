import java.util.Scanner;

public class CaesarCodeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        int option;
        do {
            System.out.println("---------- Caesar Code ---------- ");
            System.out.println("1 - encode text");
            System.out.println("2 - decode text");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine();  // \n

            switch (option) {
                case 1:
                    System.out.println("Text to encode: ");
                    text = scanner.nextLine();
                    if (CaesarCode.valid(text)) {
                        text = CaesarCode.encode(text);
                        System.out.println(text);
                    }
                    break;
                case 2:
                    System.out.println("Text to decode: ");
                    text = scanner.nextLine();
                    if (CaesarCode.valid(text)) {
                        text = CaesarCode.decode(text);
                        System.out.println(text);
                    }
                    break;
            }
        } while (option != 0);
    }
}