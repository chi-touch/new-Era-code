package menstuatinon;
import java.util.Date;
import java.util.Scanner;
public class MenstruationMain {
    public static void main(String[] args) {
        applicationMain();
    }
    public static void applicationMain() {
        Menstruation menstruation = new Menstruation();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        if (age > 11 && age < 55) {
            System.out.print("What is your menstruation cycle: ");
            int cycle = Integer.parseInt(input.nextLine());
            System.out.println(" ");
            System.out.println("Enter details of your last menstrual flow below...");

            System.out.print("Please Enter Last Menstrual Day: eg 05 : ");
            String day = input.nextLine();

            System.out.print("Please Enter Last Menstrual Month: eg 09 : ");
            String month = input.nextLine();

            System.out.print("Please Enter Last Menstrual Year eg 2022 : ");
            String year = input.nextLine();

            Date date = new Date();
            String newDate = String.valueOf(date);
            menstruation.setLastMonthMenstrualFlow(year, month, day);
            String lastFlow = String.valueOf(menstruation.getLastMonthMenstrualFlow());
            String nextMenstrualFlow = String.valueOf(menstruation.getNextMenstualFlow(cycle, year, month, day));
            String ovulation = String.valueOf(menstruation.getOvulation());
            String safePeriodStart = String.valueOf(menstruation.getSafePeriodStart());
            String safePeriodEnds = String.valueOf(menstruation.getSafePeriodEnds());

            System.out.printf("""
                    ========================================
                    WELCOME TO CHI-CHI MENSTRUAL CALCULATOR
                    ========================================
                    Results loading..........
                                    
                    Today's Date: %s
                    Full Name: %s
                    Age: %d
                    Menstrual Cycle: %d
                    Last Menstrual Flow: %s
                    Next Possible Menstrual Flow: %s
                    Possible Ovulation Or Fertile Window Date: %s
                    Possible Safe Period Starts: %s
                    Possible Safe Period Ends: %s
                    Thank you.......%s for using this App.
                        
                    ========================================
                    """, newDate, name, age, cycle, lastFlow, nextMenstrualFlow, ovulation, safePeriodStart, safePeriodEnds, name);
        }
        else {
            System.out.println("You are either under age or reached menopause.. sorry you cannot use this App ");
        }
    }


}
