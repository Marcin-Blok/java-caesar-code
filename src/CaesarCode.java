public class CaesarCode {

    public static String encode(String text){
        StringBuilder newString = new StringBuilder();
        for(char c : text.toCharArray()){
            char encodedChar = (char)(65 + ( c - 62 ) % 26);
            newString.append(encodedChar);
        }
        return newString.toString();
    }

    public static String decode(String text){
        StringBuilder newString = new StringBuilder();
        for(char c : text.toCharArray()){
            char encodedChar = (char)(65 + ( c - 42 ) % 26);
            newString.append(encodedChar);
        }
        return newString.toString();
    }

    public static boolean valid(String text){
        for(char c : text.toCharArray()){
            if(c < 'A' || c > 'Z'){
                return false;
            }
        }
        return true;
    }
}
