public class CaesarCodeApp {
    public static void main(String[] args) {
        String text = "ALAMAKOTAXYZ";

        String encodedText = CaesarCode.encode(text);

        System.out.println(encodedText);

    }
}
