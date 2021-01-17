package ru.geekbrains.java.level1.lesson2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        {
            delimeter(1);
            int[] intArr1 = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0};
            System.out.println("Исходный массив:      " + Arrays.toString(intArr1));
            int[] intArr2 = new int[intArr1.length];
            for (int i = 0; i < intArr1.length; i++) {
                switch (intArr1[i]) {
                    case 1 -> intArr2[i] = 0;
                    case 0 -> intArr2[i] = 1;
                }
            }
            System.out.println("Результирующий массив:" + Arrays.toString(intArr2));
        }
        /*
        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
        значениями 0 3 6 9 12 15 18 21;
         */
        {
            delimeter(2);
            int[] intArr3 = new int[8];
            System.out.println("Исходный массив:      " + Arrays.toString(intArr3));
            for (int i = 0, j = 0; i < intArr3.length; i++, j += 3) {
                intArr3[i] = j;
            }
            System.out.println("Результирующий массив:" + Arrays.toString(intArr3));
        }
        /*
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2
         */
        {
            delimeter(3);
            int[] intArr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Исходный массив:      " + Arrays.toString(intArr4));
            for (int i = 0; i < intArr4.length; i++) {
                if (intArr4[i] < 6) {
                    intArr4[i] *= 2;
                }
            }
            System.out.println("Результирующий массив:" + Arrays.toString(intArr4));
        }
        /*
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
         */
        {
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
        5. Задать одномерный массив и найти в нем минимальный и максимальный элементы
         */
        {
            delimeter(5);
            int[] arr1 = {1, 0, 100, -2, 29, 9, 27, -13, 4, 38, 12, 7, 33, 27, 130};
            System.out.println("Исходный массив " + Arrays.toString(arr1));
            System.out.println("Минимальное значение " + maxMinValueArr(arr1, "min"));
            System.out.println("Максимальное значение " + maxMinValueArr(arr1, "max"));
        }

        /*
        6. Работа метода, в который передается не пустой одномерный целочисленный массив.
        Метод возвращает true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        */
        {
            delimeter(6);

            int[][] arr2 = new int[][]{
                    {1, 2, 3, 1, 1, 1, 1, 2},
                    {3, 5, 3, 3, 1},
                    {2, 4, 5, 1},
                    {3, 1, 1, 5, 10}
            };
            for (int[] arrItem : arr2) {
                System.out.println(Arrays.toString(arrItem) + ": " + arrMet(arrItem));
            }
        }

        /*
        7. Демонстрация работы метода которому на вход подается одномерный массив и число n
        (может быть положительным, или отрицательным), при этом метод смещает все элементы массива на n позиций.
        Элементы смещаются циклично.
         */
        {
            delimeter(7);
            int[] arr3 = {1,2,3,4,5,6,7,8,9};
            int bias1 = -3;
            System.out.println("исходный массив: " + Arrays.toString(arr3));
            System.out.println("смещение: " + bias1);
            retArrMet(arr3, bias1);
            System.out.println("результирующий массив: " + Arrays.toString(arr3));
            int bias2 = 5;
            System.out.println("смещение: " + bias2);
            retArrMet(arr3, bias2);
            System.out.println("результирующий массив: " + Arrays.toString(arr3));
        }

    }

    /*
    метод печатет линию разделитель заданий
     */
    public static void delimeter(int numTask) {
        System.out.println("----------" + numTask + "----------");
    }

    /*
    4. метод выводит на печать двухмерный массив
     */
    public static void arrPrinter(int[][] arr, int arrLength) {
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /*
    5. метод принимает одномерний int массив и параметр "min" или "max" и возвращает
    соответственно минимальное или максимальное значение массива
     */
    public static int maxMinValueArr(int[] arr, String par) {
        int retValue = arr[0];
        switch (par) {
            case "min":
                for (int j : arr) {
                    if (j < retValue) {
                        retValue = j;
                    }
                }
                break;
            case "max":
                for (int j : arr) {
                    if (j > retValue) {
                        retValue = j;
                    }
                }
                break;
            default:
                System.out.println("Не верно задан параметр, введите min или max");
        }
        return retValue;
    }

    /*
    6. Метод, в который передается не пустой одномерный целочисленный массив.
    Метод возвращиет true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean arrMet(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int sum1 = 0;
            int sum2 = 0;
            for (int j =0; j <= i; j++){
                sum1 = sum1 + arr[j];
            }
            for (int j = i + 1; j < arr.length; j++){
                sum2 = sum2 + arr[j];
            }
            if (sum1 == sum2){
                return true;
            }
        }
        return false;
    }

    /*
    7. Метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод смещает все элементы массива на n позиций. Элементы смещаются циклично.
     */
    public static void retArrMet(int[] arr, int num) {
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                int arr0 = arr[arr.length - 1];
                for (int j = arr.length - 2; j >= 0; j--) {
                    arr[j+1] = arr[j];
                }
                arr[0] = arr0;
            }
        }
        if (num < 0) {
            for (int i = -1; i >= num; i--) {
                int arrn = arr[0];
                for (int j = 0; j<= arr.length - 2; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = arrn;
            }
        }
    }
}




