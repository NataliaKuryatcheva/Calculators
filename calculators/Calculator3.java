package src.beginnig.calculators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

import java.util.* ; //Импортируем пакет java.util, который позволит нам работать со сканером

public class Calculator3 { //Создаем публичный класс Calculator

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in) ; // Создаем экземпляр класса Scanner, который будет считывать данные из инпута командной строки

        while (true) { //Вечный цикл (нужен для "перезапуска" калькулятора после выдачи результата

            System.out.print("\nВведите первое число: "); //Выводим в консоль "введите первое число:"
            double a = s.nextDouble(); //Считываем первое число (Double - число с плавающей точкой)

            System.out.print("\nВведите второе число: "); // Выводим в консоль "введите второе число:"
            double b = s.nextDouble();  // Считываем второе число

            System.out.print("\nВыберите нужное действие: ");
            System.out.println("\n1.Сложение");
            System.out.println("2.Вычитание");
            System.out.println("3.Умножение");
            System.out.println("4.Деление");
            System.out.print("\nВаш выбор: ");
            int selected = s.nextInt(); // Считываем число

            double c;

            switch (selected) { //Проверка переменной selected
                case 1: //Если selected == 1
                    c = a + b ; //Производим сложение
                    System.out.println("\n" + a + " + " + b + " = " + c ); //Выводим результат
                    break;
                case 2:
                    c = a - b ; //Производим вычитание
                    System.out.println("\n" + a + " - " + b + " = " + c ); //Выводим результат
                    break;
                case 3:
                    c = a * b ;
                    System.out.println("\n" + a + " X " + b + " = " + c );
                    break;
                case 4:
                    c = a / b ;
                    System.out.println("\n" + a + " : " + b + " = " + c);
                    break;
                default: //По умолчанию (если selected != ниодному вышеперечисленному варианту)
                    System.err.println("Неверный выбор!\n");
                    break;
            }
        }
    }
}