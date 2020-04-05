package by.itacaemy;

import java.util.Scanner;

public class Task1_5 {
    //5. Циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м, 2-й станет 4-м и т.д.)
    static private Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        //Создаём обычный массив и массив с +2 элементами
        int[] a;
        int[] a1;
        int x = scan.nextInt();                                 //Задаём длинну массива через консоль
        a = new int[x];
        a1 = new int[x+2];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)((Math.random()*10)-1);                 //Заполняем исходный массив случайными числами
            System.out.print(a[i]);                             //Выводим начальный массив в консоль
            a1[i+2] = a[i];                                     //Заполняем второй массив числами из первого, со здвигом
        }

        for (int i:a1){
            System.out.print(i);                                //Выводим второй массив в консоль
        }
    }
}
