import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();    //Запись размера массива в переменную
        int array[] = new int[arraySize];    //Объявление массива
        System.out.print("Задайте элементы массива через пробел: ");
        for (int i = 0; i < arraySize; i++) {        //Цикл для записи значений в массив
            array[i] = in.nextInt();
        }
        for (int n = array.length - 1; n > 0; n--) {        //Внешний цикл сокращает фрагмент массива
            for (int j = 0; j < n; j++) {          //Внутренний цикл каждый раз ставит максимальный элемент справа
                if (array[j] > array[j + 1]) {        //Если элемент слева больше, чем элемент справа, то
                    int tmp = array[j];          //Кладём значение элемента слева в переменную tmp
                    array[j] = array[j + 1];    //Присваиваем значние для элемента слева, равное элементу справа (тот, что меньше)
                    array[j + 1] = tmp;    //Присваиваем значение для элемента справа равное значению слева
                }
                }
            }
        System.out.print("Отсортированный массив: ");
        for (int k = 0; k < arraySize; k++) {    //Вывод элементов массива
                System.out.print(array[k] + " ");
        }
    }
}