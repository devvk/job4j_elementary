package ru.job4j.array;

public class SquareArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
