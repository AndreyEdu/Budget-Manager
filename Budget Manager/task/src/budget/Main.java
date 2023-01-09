package budget;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Manager man = new Manager();
        boolean stop = true;
        Scanner scanner = new Scanner(System.in);

        while (stop) {
            System.out.println("""
                    Choose your action:
                    1) Add income
                    2) Add purchase
                    3) Show list of purchases
                    4) Balance
                    0) Exit""");

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.println("\nEnter income:");
                    int income = scanner.nextInt();
                    scanner.nextLine();
                    man.addIncome(income);
                    System.out.println("Income was added!\n");
                    break;
                case 2:
                    System.out.println("\nEnter purchase name:");
                    String purchase = scanner.nextLine();
                    System.out.println("Enter its price:");
                    double price = scanner.nextDouble();
                    man.addPurchase(purchase, price);
                    System.out.println("Purchase was added!\n");
                    break;
                case 3:
                    if (man.getTotalSum() > 0) {
                        System.out.println();
                        for (String s : man.getListOfPurchases()) {
                            System.out.println(s);
                        }
                        System.out.printf("Total sum: $%.2f\n", man.getTotalSum());
                        System.out.println();
                    } else {
                        System.out.println("\nThe purchase list is empty\n");
                    }
                    break;
                case 4:
                    System.out.printf("\nBalance: $%.2f\n", man.getBalance());
                    System.out.println();
                    break;
                case 0:
                    stop = false;
                    System.out.println("\nBye!");
                    break;

            }
        }

    }
}
