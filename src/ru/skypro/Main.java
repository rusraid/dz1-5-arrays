package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task12();
        task3();
        task4();
//        task5();
    }

    public static void task12() {
//          task 1.1

        int[] massiveOne = new int[]{1, 2, 3};
//        System.out.print(massiveOne[0] + ", ");
//        System.out.print(massiveOne[1] + ", ");
//        System.out.println(massiveOne[2] + " ");

        for (int i = 0; i < massiveOne.length; i++) {
            if (i != massiveOne.length - 1) {
                System.out.print(massiveOne[i] + ", ");
            } else {
                System.out.println(massiveOne[i]);
            }
        }
//        System.out.println(massiveOne[0]);
//        System.out.println(massiveOne[1]);
//        System.out.println(massiveOne[2]);


//          task 1.2
        float[] massiveTwo = {1.57f, 7.654f, 9.986f};
//        System.out.println(massiveTwo[0]);
//        System.out.println(massiveTwo[1]);
//        System.out.println(massiveTwo[2]);

//        for (int d = 0; d < massiveTwo.length; d++) {
//            System.out.println(massiveTwo[d]);
//        }

//        или
        double[] massiveTwo2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < massiveTwo2.length; i++) {
            if (i != massiveTwo2.length - 1) {
                System.out.print(massiveTwo2[i] + ", ");
            } else {
                System.out.println(massiveTwo2[i]);
            }
        }

//          task 1.3
        char[] chars = {71, 79, 68};
//        System.out.print(chars[0]);
//        System.out.print(chars[1]);
//        System.out.print(chars[2]);
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                System.out.print(chars[i] + ", ");
            } else {
                System.out.println(chars[i]);
            }
        }
    }

    public static void task3() {
        int[] massiveOne = new int[]{1, 2, 3};

//        for (int i = massiveOne.length - 1; i >= 0 ; i--) {
//            if (i == massiveOne.length -1) {
//                System.out.println(massiveOne[i] + ", ");
//            } else {
//                System.out.println(massiveOne[0] + "одно");
//            }
//        }

        for (int i = massiveOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveOne[i]);
            } else {
                System.out.print(massiveOne[i] + ", ");
//            }
            }
        }

        double[] massiveTwo2 = {1.57, 7.654, 9.986};
        for (int i = massiveTwo2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveTwo2[i]);
            } else {
                System.out.print(massiveTwo2[i] + ", ");
            }
        }

        char[] chars = {71, 79, 68};
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + ", ");
            }
        }

    }

    public static void task4() {

        int[] massiveOne = new int[]{1, 2, 3};
//        System.out.print(massiveOne[0] + ", ");
//        System.out.print(massiveOne[1] + ", ");
//        System.out.println(massiveOne[2] + " ");

        for (int i = 0; i < massiveOne.length; i++) {
            if (i % 2 == 0) {
                System.out.println(massiveOne[i] + 1);
            } else {
                System.out.println(massiveOne[i]);
            }
        }

    }

    public static void task5() {

    }
}

