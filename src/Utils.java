import java.util.Scanner;

public class Utils {
    public static int RightValue;
    public static long RightNumber;
    public static int StringParser(String value){

        Scanner in = new Scanner(System.in);

        try{
            RightValue = Integer.parseInt(value.trim()); // Конвертируем строку в число для сравнения.
        }
        catch (NumberFormatException ex){
            System.out.print("Uncorrect format - " + ThirdLesson.CorrectingType + ", try again: ");
            StringParser(value = in.nextLine());
        }

        return RightValue;
    }

    public static long NumberParser(String number){

        Scanner in = new Scanner(System.in);

        try{
            RightNumber = Long.parseLong(number.trim()); // Конвертируем строку в число для сравнения.
        }
        catch (NumberFormatException ex){
            System.out.print("Uncorrect format - " + ThirdLesson.CorrectingType + ", try again: ");
            NumberParser(number = in.nextLine());
        }

        return RightNumber;
    }
}
