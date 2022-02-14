import java.util.ArrayList;

public class CafeUtil {
    // Bonus Ninja
    public Integer getStreakGoal(Integer numWeeks) {
        Integer total = 0;

        for (int i = 1; i <= numWeeks; i++) {
            total += i;
        }

        return total;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hola %s", userName));
        System.out.println("Hay " + customers.size() + " personas frente a ti");
        customers.add(userName);

        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + " " + customers.get(i));
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for(int i = 1; i <= maxQuantity; i++) {
            // Bonus Sempai
            double subtotal = price * i;
            double discount = 400 * (i - 1);

            double total = subtotal - discount;
            // Bonus Sensei
            System.out.println(String.format("%s $%.2f", i, total));
        }
    }

    // Bonus Ninja
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) + " -- " + prices.get(i));
        }

        return true;
    }

    // Bonus Sensei
    public void addCustomers2(ArrayList<String> customers) {
        String command = "";
        while (!command.equals("q")) {
            System.out.println("Por favor, ingresa tu nombre:");
            String userName = System.console().readLine();
            System.out.println(String.format("Hola %s", userName));
            System.out.println("Hay " + customers.size() + " personas frente a ti");
            customers.add(userName);
            for (int i = 0; i < customers.size(); i++) {
                System.out.println(i + " " + customers.get(i));
            }
            System.out.println("Para salir, escribe q. Si quieres continuar, presiona enter");
            String commandLine = System.console().readLine();
            command = commandLine;
        }
    }

}