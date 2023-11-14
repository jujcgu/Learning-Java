package conditional;

import java.util.Scanner;

public class ConditionalsIntegratorExercise {
    public static void main(String[] args) {

        double salary = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter the employee's role:");
            String employee = scanner.nextLine();

            switch (employee) {
                case "replenisher": {
                    salary = 15890 + (15890 * 0.10);
                    break;
                }
                case "cashier": {
                    salary = 26630.89;
                    break;
                }
                case "supervisor": {
                    salary = 35560.20 - (35560 * 0.11);
                    break;
                }
                default:
                    System.out.println("employee role typed incorrectly");
            }
        }
        System.out.println("the employee's salary is: " + salary);
    }
}
