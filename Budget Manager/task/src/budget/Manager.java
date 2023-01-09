package budget;

import java.util.ArrayList;

public class Manager {

    private double balance;
    private double totalSum;
    public ArrayList<String> purchases = new ArrayList<>();

    public double getBalance() {
        return this.balance;
    }

    public void addIncome(int income) {
        balance = this.balance + income;
    }

    public void addPurchase(String purchase, double price) {
        purchases.add(purchase + " $" + price);
        this.totalSum += price;
        this.balance -= price;
    }

    public ArrayList<String> getListOfPurchases() {
        return this.purchases;
    }

    public double getTotalSum() {
        return this.totalSum;
    }

}
