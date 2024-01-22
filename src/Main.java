import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int age = 17;
        double gpa = 3.8;
        boolean isRaining = false;
        System.out.println(age + "!" + gpa + "!" + isRaining);
        String city = "Columbus";
        System.out.println(city);
        System.out.println(city.toUpperCase());

        int dailyHighs[] = {50, 60, 70, 80, 90, 100};
        System.out.println(dailyHighs.length);

        for(int i=0; i< dailyHighs.length; i++){
            System.out.println(dailyHighs[i]);
        }
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println(name.toLowerCase());
    }
}