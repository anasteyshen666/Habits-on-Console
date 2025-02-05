import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte valueHabits = 0;
        String[] habits = new String[10];

        System.out.println("Welcome to my program for habits!");

        Scanner scanner = new Scanner(System.in);
        String inputHabits;
        do {
            System.out.println("Input your habits(until 10 or command 'listend'):");
            inputHabits = scanner.nextLine();
            if(inputHabits.equals("listend")) {
                break;
            }else {
                habits[valueHabits] = inputHabits;
                valueHabits++;
            }

        }while(valueHabits != 10);

        System.out.println("Input list for print your habits: ");
        String listHabits = scanner.nextLine();
        if(listHabits.equals("list")) {
            System.out.println("LIST OF HABITS:");
            for (String habit : habits) {
                if(habit == null) {
                    break;
                }else {
                    System.out.println(habit);
                }
            }
        }
        System.out.println("_____________________");
        System.out.println("END");


    }
}
