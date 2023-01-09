package budget;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        ArrayList<String> purchases = new ArrayList<>();

        while(scanner.hasNext()) {
            purchases.add(scanner.nextLine());
        }

        for (String s : purchases) {
            System.out.println(s);
            String[] arr;
            arr = s.split("\\$");
            sum += Double.parseDouble(arr[1]);
        }



        System.out.println("Total: $" + sum);
    }
}
