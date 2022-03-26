public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int balanceFunding = 1050;
        int bonus = 0;
        if (balanceFunding >= 1000) {
            bonus = balanceFunding / 100;
        }
        currentBalance = currentBalance + balanceFunding + bonus;
        System.out.println("Начисленные бонусы: " + bonus);
        System.out.println("Текущий баланс: " + currentBalance);
    }
}
