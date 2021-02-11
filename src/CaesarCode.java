public class CaesarCode {

    public static String encode(String text){
        StringBuilder newString = new StringBuilder();
        for(char c : text.toCharArray()){
            char encodedChar = (char)(65 + ( c - 62 ) % 26);
            newString.append(encodedChar);
        }
        return newString.toString();
    }
    
}
