/**
 *\file Test.java
 *\brief Файл для проверки от дурака, и для вызова функций.
 *\author Strokan Andrey
 *\version 1.3
 *\date 21.11.2018
 *\example Проверка на дурака.
 *
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Test{
    Functions f = new Functions();
    public static void main(String[] args){
        /**
         *\file Test.java
         *\brief Функция проверяет введённые данные, а так же вызывает функцию power().
         *\param[in] a Введённое пользователем число, которое нужно возвести в степень.
         *\param[in] exit Используется для выхода из бесконечного цикла.
         *\param[in] s1 Используется для выхода из бесконечного цикла.
         */
        int a = 0;
        boolean exit = false;

        for (;exit == false;) {
            Scanner s1 = new Scanner(System.in);
            try {
                a = s1.nextInt();
                exit = true;
            } catch (InputMismatchException e) {
                System.out.println("Вы Ввели не число!");
            }
        }
        System.out.println(f.power(a, 4));
        System.out.println(f.absM(a));
        System.out.println(f.ANTIabsM(a));
        System.out.println(f.PiNum(a));
        
    }
}