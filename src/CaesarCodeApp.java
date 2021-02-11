public class CaesarCodeApp {
    public static void main(String[] args) {
        String text = "ALAMAKOTAXYZ";

        // wyświetlamy tekst
        System.out.println(text);

        String encodedText = CaesarCode.encode(text);

        // zakodowany tekst
        System.out.println(encodedText);

        String decodedText = CaesarCode.decode(encodedText);

        // odkodowany tekst
        System.out.println(decodedText);

    }
}
