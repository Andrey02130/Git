/**
 *\file Functions.java
 *\brief Файл хранящий в себе функции математических операций.
 *\author Strokan Andrey
 *\version 1.1
 *\date 21.11.2018
 *\example Функции математических операций.
 *
 *Все необходимые методы для математических операций.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Functions{
    public static int power(int a, int n){
        /**
         *\file Functions.java
         *\brief Функция возвращает число a в степени n.
         * Используется в функции main()
         *\param[in] a Введённое пользователем число.
         *\param[in] n Степень.
         *\param[in] pow Число a после возведения в степень.
         *\return Число возведённое в степень.
         */
        int pow = 1;
        for(int i = 1; i<n+1 ;i++){
            pow *= a;
        }
        return pow;
    }
    public static int absM(int a){
        /**
         *\file Functions.java
         *\brief Функция возвращает модуль числа a.
         * Используется в функции main()
         *\param[in] a Введённое пользователем число.
         *\return Модуль числа a.
         */
        if(a<0){
            a *= -1;
        }
        return a;
    }
    public static int ANTIabsM(int a){
        /**
         *\file Functions.java
         *\brief Функция возвращает отрицательное число a.
         * Используется в функции main()
         *\param[in] a Введённое пользователем число.
         *\return Анти-Модуль числа a.
         */
        if(a>0){
            a *= -1;
        }
        return a;
    }
    public static int PiNum(int a){
        /**
         *\file Functions.java
         *\brief Функция число умноженное на ПИ.
         * Используется в функции main()
         *\param[in] a Введённое пользователем число.
         *\param[in] PI Число ПИ (3.14).
         *\return Число a умноженное на ПИ.
         */
        float PI = 3.14;
        a *= PI;
        return a;
    }
}