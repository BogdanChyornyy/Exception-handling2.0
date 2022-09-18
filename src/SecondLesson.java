import java.util.Scanner;

public class SecondLesson {
    // 2.1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void FirstTask(){

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();

            System.out.println(num);
        }
        catch (Exception e){
            System.out.println("Enter a number!!!");
            FirstTask();
        }

    }

    // 2.) Исправлям код.
    public static void SecondTask(){
        try {
            int[] intArray = new int[10]; // Инициализация массива.

            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    // 3.) Исправлям код.
    public static void ThirdTask(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        /*} catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");*/ // Либо мы ловим все либо точечно.
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) throws java.io.FileNotFoundException {
        System.out.println(a + b);
    }

    // 4.) Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static void FourthTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input smt: ");
        var str = in.nextLine();

        if(str == ""){
            System.out.print("You entered empty stroke, try again: ");
            FourthTask();
        }

        System.out.println(str);
    }
}

