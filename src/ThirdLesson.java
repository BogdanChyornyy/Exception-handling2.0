import java.util.Scanner;
import java.io.*;

public class ThirdLesson {

    public static String CorrectingType;

    public static String[] SFMGlobal;
    public static String BirthDateGlobal;
    public static long PhoneNumberGlobal;
    public static String GenderGlobal;
    public static void Launcher(){
        Processer();
    }

    public static void Processer(){

        EnterSFMName();
        EnterBirthDate();
        EnterPhoneNumber();
        EnterGender();

        String DirectoryName = SFMGlobal[0];
        try(FileWriter writer = new FileWriter(DirectoryName + ".txt", true))
        {
            // запись всей строки
            writer.write(SFMGlobal[0] + " " + SFMGlobal[1] + " " + SFMGlobal[2] + " " + BirthDateGlobal + " " + PhoneNumberGlobal + " " + GenderGlobal + "\n");
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void EnterSFMName() {

        Scanner in = new Scanner(System.in); // Экземпляр класса сканер.

        System.out.print("Enter second, first and middle name: ");
        String SFM = in.nextLine(); // Ввод данных ФИО.

        String[] SFMOutput = SFM.split(" "); // Разбиваем строку по пробелу

        while(SFMOutput.length != 3){
            System.out.print("You entered wrong SFM format. Try again...");

            System.out.print("Enter first, second and middle name: ");
            SFM = in.nextLine(); // Ввод данных ФИО.

            SFMOutput = SFM.split(" "); // Разбиваем строку по пробелу
        }
        SFMGlobal = SFMOutput;
    }

    public static void EnterBirthDate() {

        Scanner in = new Scanner(System.in); // Экземпляр класса сканер.

        System.out.print("Enter your birth date, using dd.mm.yyyy format: ");
        String birthDate = in.nextLine(); // Ввод данных даты рождения.

        String[] birthDateOutput = birthDate.split("\\."); // Разбиваем строку по точке

        while(birthDateOutput.length != 3){
            System.out.print("You entered wrong birth date format. Try again...");

            System.out.print("Enter birth date again, using right dd.mm.yyyy format: ");
            birthDate = in.nextLine(); // Ввод данных даты рождения.

            birthDateOutput = birthDate.split("\\."); // Разбиваем строку по точке.
        }

        CorrectingType = "day";
        int day = Utils.StringParser(birthDateOutput[0]);
        while(day > 31 || day < 1){
            System.out.print("You entered wrong day format. Try again...");
            day = Utils.StringParser(in.nextLine()); // Ввод данных дня.
        }

        CorrectingType = "month";
        int month = Utils.StringParser(birthDateOutput[1]);
        while(month > 12 || month < 1){
            System.out.print("You entered wrong month format. Try again...");
            month = Utils.StringParser(in.nextLine()); // Ввод данных месяца.
        }

        CorrectingType = "year";
        int year = Utils.StringParser(birthDateOutput[2]);
        while(year > 2018 || year < 1900){
            System.out.print("You entered wrong year format. Try again...");
            year = Utils.StringParser(in.nextLine()); // Ввод данных года.
        }

        String rightBirthDate = day+"."+month+"."+year;
        BirthDateGlobal = rightBirthDate;
    }

    public static void EnterPhoneNumber(){
        Scanner in = new Scanner(System.in); // Экземпляр класса сканер.
        System.out.print("Enter your phone number: ");

        CorrectingType = "phone number";
        long number = Utils.NumberParser(in.nextLine());
        while(number > 99999999999d || number < 10000000000d){
            System.out.print("You entered wrong phone number format. Try again...");
            number = Utils.NumberParser(in.nextLine()); // Ввод данных номера телефона.
        }
        PhoneNumberGlobal = number;
    }

    public static void EnterGender(){
        Scanner in = new Scanner(System.in); // Экземпляр класса сканер.
        System.out.print("Enter your gender: ");
        String gender = in.nextLine();

        /*while(gender != "man" || gender != "woman"){
            System.out.print("You entered not exist gender. Try again...");
            gender = in.nextLine();
        }*/
        GenderGlobal = gender;
    }
}
