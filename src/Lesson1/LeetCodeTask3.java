package Lesson1;

public class LeetCodeTask3 {
    public static void main(String[] args) {
        /*
        Given two binary strings a and b, return their sum as a binary string.
        Имея две двоичные строки a и b, верните их сумму в виде двоичной строки.
         */
        addBinary("1010", "1011");
    }
    public static String addBinary(String a, String b){
        // Input: a = "1010", b = "1011"
        //Output: "10101"
        StringBuilder result = new StringBuilder();
        int maxLenght = Math.min(a.length(), b.length());
        int buffer = 0;
        for (int i = 0; i < maxLenght; i++) {
            if (Integer.parseInt(String.valueOf(a.charAt(a.length() - i - 1))) == 1 && Integer.parseInt(String.valueOf(b.charAt(b.length() - i - 1))) == 1){
                result.append(0);
                buffer = 1;
            } else if (Integer.parseInt(String.valueOf(a.charAt(a.length() - i - 1))) == 0 && Integer.parseInt(String.valueOf(b.charAt(b.length() - i - 1))) == 1) {
                if (buffer != 0){

                }
                result.append(1);
            }else if (Integer.parseInt(String.valueOf(a.charAt(a.length() - i - 1))) == 1 && Integer.parseInt(String.valueOf(b.charAt(b.length() - i - 1))) == 0) {
                result.append(1);
            }
        }
        return result.toString();
    }
}
