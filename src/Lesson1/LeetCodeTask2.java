package Lesson1;

public class LeetCodeTask2 {
    public static void main(String[] args) {
        /*
        You are given two strings word1 and word2.
        Merge the strings by adding letters in alternating order, starting with word1.
        If a string is longer than the other, append the additional letters onto the end of
        the merged string.

        Вам даны две строки word1 и word2. Объедините строки,
        добавляя буквы в чередующемся порядке, начиная со слова1.
        Если строка длиннее другой, добавьте дополнительные буквы в конец объединенной строки.
         */
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int maxLenght = word1.length() > word2.length() ? word1.length() : word2.length();
        //Input: word1 = "ab", word2 = "pqrs"
        //Output: "apbqcr"
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLenght; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
