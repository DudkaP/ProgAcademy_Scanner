import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your birthday year?");
        int birthYear = scanner.nextInt();

        Date date = new Date();
        int yo = date.getYear()+1900-birthYear;

        System.out.println("You are " + yo + " y.o.");
    }
}