package com.company;

public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int[] main(String[] args) {
        int[] arr = new int[30];
        int sum = 0;
        for (int element : arr) {
            sum += element;
            System.out.println("Сумма трат за месяц " + sum + " рублей");
        }


        int maxWaste = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > maxWaste) {
                maxWaste = arr[i];
                System.out.println("Максимальная сумма трат составила " + maxWaste + " рублей");
            }

        int minWaste = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minWaste) {
                minWaste = arr[i];
                System.out.println("Миниимальная сумма трат составила " + minWaste + " рублей");
            }
        }

        float average = 0;
        average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int start = 0;
        int end = reverseFullName.length - 1;
        char temp;
        for (; end > start; start++, end--) {
            temp = reverseFullName[start];
            reverseFullName[start] = reverseFullName[end];
            reverseFullName[end] = temp;
            System.out.println(reverseFullName);
        }
    }
}
