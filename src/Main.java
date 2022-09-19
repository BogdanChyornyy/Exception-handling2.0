import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*DevideByZeroException();
        ArrayIndexOutOfBoundsException();
        NegativeArraySizeException(5,-4);

        String[][] arr = new String[10][];
        SecondTask(arr);

        int[] first = {5,2,4,2,1,5,3,9};
        int[] second = {5,6,1,3,5,7,8};
        ThirdTask(first,second);
        FourthTask(first,second);

        SecondLesson.FirstTask();
        SecondLesson.SecondTask();
        SecondLesson.FourthTask();*/

        while (true){
            ThirdLesson.Launcher();
        }
    }
    // 1.1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
    public static void  DevideByZeroException(){

        int x=5;
        int y=0;

        try{
            int answer = x/y;
        }
        catch (ArithmeticException e){
            System.out.println("1 excp: " + e.getMessage());
        }
    }

    public static void ArrayIndexOutOfBoundsException(){
        int[][] array = new int[10][10];

        try{
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 11; j++){
                    array[i][j] = i*j+5;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2 excp: " + e.getMessage());
        }
    }

    public static void NegativeArraySizeException(int a, int b){

        try{
            int[][] array = new int[a][b];
        }
        catch (NegativeArraySizeException  e){
            System.out.println("3 excp: " + e.getMessage());
        }
    }

    // 1.2) Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static int SecondTask(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                try{
                    int val = Integer.parseInt(arr[i][j]); // Ловим NullPointerException.
                    sum += val;
                }
                catch (NullPointerException e){
                    System.out.println(e.getMessage());
                }
            }
            break;
        }
        return sum;
    }

    // 1.3) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
    // и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
    // в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int[] ThirdTask(int[] first, int[] second) {
        int dif = first.length - second.length;
        int[] third = new int[first.length];

        if (dif != 0){
            System.out.println("Arrays length is difference");
        }
        else{
            for(int i = 0; i < first.length; i++){
                third[i] = first[i] - second[i];
            }
            for(int i = 0; i < first.length; i++){
                System.out.println(third[i]);
            }
        }

        return third;
    }

    // 1.4) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
    // и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
    // в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь
    // может увидеть - RuntimeException, т.е. ваше.

    public static int[] FourthTask(int[] first, int[] second) {
        int dif = first.length - second.length;
        int[] third = new int[first.length];

        try{
            for(int i = 0; i < first.length; i++){
                third[i] = first[i]/second[i];
            }
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return third;
    }
}