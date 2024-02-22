package Tasks;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class Task1 {
   /* public static int getAge(String dateOfBirth){
        return Period.between(LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.now()).getYears();

    }*/
    /*
    public static int getAge(String dateOfBirth){
        return Period.between(LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.now()).getYears();
    }*/

    public static int getAge(String dateOfBirth){
        return Period.between(LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter when dey born u");
        String dateOfBirth = input.nextLine();
        getAge(dateOfBirth);
        System.out.println(getAge(dateOfBirth));
    }























   /* public static int getAge(String dateOfBirth){
         return Period.between(LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.now()).getYears();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date of birth");
        String dateOfBirth = input.nextLine();
        getAge(dateOfBirth);
        System.out.println(getAge(dateOfBirth));
    }*/


}

