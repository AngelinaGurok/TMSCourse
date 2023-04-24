/**
 * Тривиальная (1 балл)
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см. 0.04445 m
 */

/**
 * Пример
 *
 * Вычисление квадрата целого числа
 */
/**
 * Простая (2 балла)
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */

/**
 * Простая (2 балла)
 *
 * Пользователь задает целое число, больше или равно 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */

/**
 * Тривиальная (3 балла).
 *
 * Задача имеет повышенную стоимость как первая в списке.
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       /* final float convert = 0.04445f;*/

        Scanner in = new Scanner(System.in);

        /* System.out.print("Input length in sazhen: ");
        int sazh = in.nextInt();
        System.out.print("Input length in arshin: ");
        int arsh = in.nextInt();
        System.out.print("Input length in vershki: ");
        int versh = in.nextInt();
        System.out.print(convertLength(sazh, arsh, versh, convert));*/

        /*System.out.println("Input integer number: ");
        int numb = in.nextInt();
        System.out.println(" The square of number " + numb + " is equal to " + sqrtInt(numb));*/

        /*System.out.println("Input number: ");
        double numb = in.nextDouble();
        System.out.println(" The square of number " + numb + " is equal to " + sqrtDouble(numb));*/

        /*        System.out.println("Input train departure time in hours and minutes: ");
        int hoursDep = in.nextInt();
        int minutesDep = in.nextInt();
        System.out.println("Input train arrival time in hours and minutes: ");
        int hoursArr = in.nextInt();
        int minutesArr = in.nextInt();
        System.out.println(" Travel time in minutes is " + travelTime(hoursDep, minutesDep, hoursArr, minutesArr));*/

        /*System.out.println("Input time in hours, minutes and seconds: ");
        int hours = in.nextInt();
        int minutes = in.nextInt();
        int seconds = in.nextInt();
        System.out.println(timeCalc(hours, minutes, seconds) + " second have passed since the beginning of the day");*/

        System.out.println("Input number: ");
        int numb = in.nextInt();
        System.out.println("Reversed number is: " + reverseNumb(numb));
    }

    public static int reverseNumb (int a){
        return (100 * (a % 10) + 10 * ((a / 10) % 10) + (a / 100));
    }

    /*public static int timeCalc (int h, int m, int s){
        return (h * 60 * 60 + m * 60 + s);
    }*/

   /* public static int thirdDigit (int a) {
        int result = a;
        do{
            result = result / 10;
        }while(result > 100);
        result = result % 10;
        return result;
    }*/

    /*public static int travelTime (int hDep, int mDep, int hArr, int mArr){
        return (mArr + (60 - mDep) + (hArr - hDep - 1) * 60);
    }*/
   /* public static float convertLength(int a, int b, int c, float convert){
        return  (a * 48 + b * 16 + c) * convert;
    }*/
   /* public static int sqrtInt (int a){
        return a * a;
    }*/

 /*   public static double sqrtDouble (double a) {
        return a * a;
    }*/
}

