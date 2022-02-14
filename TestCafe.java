import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        
    /* 
      Necesitarás agregar 1 línea a este archivo para crear una instancia
      de la clase CafeUtil.
      Sugerencia: deberás corresponder con el nombre de la variable que se usa a continuación.
    */
        CafeUtil appTest = new CafeUtil();
    	
        /* ============ Casos de prueba de la App ============= */
    
        System.out.println("\n----- Prueba Meta café -----");
        System.out.printf("Compras necesarias para la semana 10: %s \n\n", appTest.getStreakGoal(10));
    
        System.out.println("----- Prueba Total Orden -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Total orden: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Prueba Mostrar Menú-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("café de goteo");
        menu.add("capuchino");
        menu.add("latte");
        menu.add("moka");
        appTest.displayMenu(menu);

        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(4.3);
        prices.add(4.5);
        prices.add(5.2);
        prices.add(3.4);
        appTest.displayMenu(menu, prices);
    
        System.out.println("\n----- Prueba agregar cliente-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Probar 4 veces ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        appTest.printPriceChart("Café Colombiano Molido", 12000.0, 3);
        appTest.printPriceChart("Café Colombiano Molido", 1600.0, 4);

        System.out.println("\n----- Prueba agregar cliente v2-----");
        ArrayList<String> customers2 = new ArrayList<String>();
        appTest.addCustomers2(customers2);
    }
}