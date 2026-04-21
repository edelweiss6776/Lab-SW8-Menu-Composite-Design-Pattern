public class RestoApp {
    public static void main(String[] args) {

        // Step 1 — Leaf items
        MenuItem classicBurger = new MenuItem("Classic Burger", 250.00);
        MenuItem largeFries    = new MenuItem("Large Fries",    85.00);
        MenuItem rootBeer      = new MenuItem("Root Beer",      60.00);

        // Step 2 — Sub-composite: Barkada Solo Meal
        MenuCategory barkadaSoloMeal = new MenuCategory("BARKADA SOLO MEAL");
        barkadaSoloMeal.add(classicBurger);
        barkadaSoloMeal.add(largeFries);
        barkadaSoloMeal.add(rootBeer);

        // Step 3 — Another leaf
        MenuItem vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);

        // Step 4 — Top-level composite: Main Menu
        MenuCategory mainMenu = new MenuCategory("MAIN MENU");
        mainMenu.add(barkadaSoloMeal);
        mainMenu.add(vanillaSundae);

        // Step 5 — Print and total
        mainMenu.print();
        System.out.println();
        System.out.println("==============================");
        System.out.printf("Total Menu Value: \u20b1%.2f%n", mainMenu.getPrice());
    }
}