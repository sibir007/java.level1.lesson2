package ru.geekbrains.java.level1.lesson2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
            delimeter(1);
            int[] intArr1 = {0,1,1,0,1,0,0,1,1,1,0,0,0,1,1,0,1,0}; //Исходный массив
            System.out.println("Исходный массив:      " + Arrays.toString(intArr1));
            int[] intArr2 = new int[intArr1.length]; //Результирующий массив
            for (int i = 0; i < intArr1.length; i++){
                switch (intArr1[i]){
                    case 1:
                        intArr2[i] = 0;
                        break;
                    case 0:
                        intArr2[i] = 1;
                }
            }
            System.out.println("Результирующий массив:" + Arrays.toString(intArr2));

        /*
        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
        значениями 0 3 6 9 12 15 18 21;
         */
            delimeter(2);
            int[] intArr3 = new int[8];
            System.out.println("Исходный массив:      " + Arrays.toString(intArr3));
            for (int i = 0, j = 0; i < intArr3.length; i++, j += 3) {
                intArr3[i] = j;
            }
            System.out.println("Результирующий массив:" + Arrays.toString(intArr3));

        /*
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2
         */
            delimeter(3);
            int[] intArr4 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.println("Исходный массив:      " + Arrays.toString(intArr4));
            for (int i = 0; i < intArr4.length; i++) {
                if (intArr4[i] < 6) {
                    intArr4[i] *= 2;
                }
            }
            System.out.println("Результирующий массив:" + Arrays.toString(intArr4));

        /*
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
         */
            delimeter(4);
            int arrLength = 10;
            int[][] intArr5 = new int[arrLength][arrLength];
            for (int i = 0; i < arrLength; i++) {
                for (int j = 0; j < arrLength; j++) {
                    if (i == j || (i + j) == arrLength - 1) {
                        intArr5[i][j] = 1;
                    }
                }
            }
            System.out.println("Результирующий массив:");
            arrPrinter(intArr5, arrLength);
    }
    /*
    метод печатет линию разделитель заданий
     */
        public static void delimeter(int numTask){
            System.out.println("----------" + numTask + "----------");
        }

    /*
    4. метод выводит на печать дбухмерный массив
     */
        public static void arrPrinter(int[][] arr, int arrLength) {
            for (int i = 0; i < arrLength; i++) {
                for (int j = 0; j < arrLength; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }

}
