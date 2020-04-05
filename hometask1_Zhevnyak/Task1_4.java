package by.itacaemy;

import java.util.Scanner;

public class Task1_4 {
    //4. Пройти по массиву и поменять местами каждые 2 соседних элемента.
    static private Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int[] a;
        int x = scan.nextInt();                                 //Задаём длинну массива через консоль
        a = new int[x];


        for (int i = 0; i < a.length; i++) {
            a[i] = (int)((Math.random()*10)-1);                 //Заполняем массив случайными числами
            System.out.print(a[i]);                             //Выводим начальный массив в консоль
        }
        System.out.println();
        int n = a.length;

        //Временная переменная, которая использоваться во вреся обмена элементов
        int temp;

        for (int i = 0; i < n; i++) {
            temp = a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            i++;
        }

        //Выводим конечный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
