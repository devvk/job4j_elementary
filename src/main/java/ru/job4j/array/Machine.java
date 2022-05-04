package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    /**
     * Жадный алгоритм. Сдача в кофе машине
     *
     * @param money купюра
     * @param price цена
     * @return массив купюр для сдачи
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money > 0) {
                if (money - coin >= 0) {
                    money -= coin;
                    rsl[size] = coin;
                    size++;
                } else {
                    break;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
