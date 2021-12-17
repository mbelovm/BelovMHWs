package org.tuni.belovMExceptionsHW;

public class Main {
    public static void main(String[] args) {
        Dishwasher dishwasher1 = new Dishwasher(4);

        dishwasher1.load();
        dishwasher1.load();

        dishwasher1.unload();

        //dishwasher1.unload();

        dishwasher1.load();
        dishwasher1.load();

        dishwasher1.run();
        //dishwasher1.run();
        //System.out.println(dishwasher1.isWorking());
        System.out.println(dishwasher1.getStatus());
        dishwasher1.stop();
        //dishwasher1.stop();
        //System.out.println(dishwasher1.getCleanDishes());

    }
}
