package Lesson1;

public class HomeWork3 {
    /*
    Input: s = "the sky is blue"
    Output: "blue is sky the"
     */
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        char searchingSymbol = ' ';
        StringBuilder stringBuilder = new StringBuilder();
        String buffer = "";

        while (true){
            s = s.trim();
            buffer = s.substring(s.lastIndexOf(searchingSymbol) + 1, s.length());
            stringBuilder.append(buffer.trim());
            if (s.lastIndexOf(searchingSymbol) == -1){
                break;
            }
            stringBuilder.append(searchingSymbol);
            s = s.substring(0, s.lastIndexOf(searchingSymbol));
        }
        return stringBuilder.toString();
    }
}
