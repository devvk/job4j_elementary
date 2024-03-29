package ru.job4j.array;

public class Square {
    /**
     * Метод заполняет массив целыми числами от 0 до bound, возведенными в квадрат.
     *
     * @param bound Определяет, до какого  числа нужно записывать числа.
     * @return Массив с элементами от 0 до bound, возведенными в квадрат.
     */
    public static int[] calculate(int bound) {
        int[] array = new int[bound];
        for (int i = 0; i < bound; i++) {
            array[i] = i * i;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
