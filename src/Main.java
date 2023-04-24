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

        System.out.println("Input number: ");
        double numb = in.nextDouble();
        System.out.println(" The square of number " + numb + " is equal to " + sqrtDouble(numb));

    }
   /* public static float convertLength(int a, int b, int c, float convert){
        return  (a * 48 + b * 16 + c) * convert;
    }*/
    public static int sqrtInt (int a){
        return a * a;
    }

    public static double sqrtDouble (double a) {
        return a * a;
    }
}

