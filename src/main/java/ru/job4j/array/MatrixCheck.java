package ru.job4j.array;

public class MatrixCheck {
    /**
     * Метод проверяет что все элементы в строке заполнены символом 'X'.
     *
     * @param board Массив для проверки
     * @param row   Строка для проверки
     * @return Результат проверки true или false
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет что все элементы в колонке заполнены символом 'X'.
     *
     * @param board  Массив для проверки
     * @param column Строка для проверки
     * @return Результат проверки true или false
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заполняет одномерный массив элементами диагонали из двухмерного массива.
     *
     * @param board Двумерный массив с элементами диагонали
     * @return Заполненный одномерный массив
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод проверяет, находится ли на поле выигрышная ситуация в сокобан.
     * Цель игры - расположить крестики в линию на 5 элементов.
     * Массив всегда квадратный и всегда на 5 элементов.
     *
     * @param board Дмумерный массив игрового поля.
     * @return Результат проверки true или false
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
