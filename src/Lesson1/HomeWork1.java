package Lesson1;

import java.util.Arrays;

public class HomeWork1 {
    /*
    Учитывая массив целых чисел фиксированной длиныarr, дублируйте каждое вхождение нуля, сдвигая остальные элементы вправо.

    Обратите внимание, что элементы, длина которых превышает длину исходного массива, не записываются. Внесите вышеуказанные изменения во входной массив на месте и ничего не возвращайте.
     */
    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0,1};
        duplicateZeros(array);
    }
    // [1,0,0,2,3,0,0,4]
    public static void duplicateZeros(int[] arr){
        for (int i = 0, j = 0; i + j < arr.length - 1; i++) {
            if (arr[i + j] == 0){
                muve(arr, i + j);
                j++;
            }
        }
    }
    public static void muve(int[ ]arr, int index){
        for (int i = 0; i < arr.length - 1 - index; i++) {
            arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
        }
    }
}
