package org.tuni.belovMExceptionsHW;

class Dishwasher {
    private Status status = Status.READY;
    private final int maxDishes;
    private int dirtyDishes;
    private int cleanDishes;

    public int getMaxDishes() {
        return maxDishes;
    }

    public int getDirtyDishes() {
        return dirtyDishes;
    }

    public Status getStatus() {
        return status;
    }

    Dishwasher(int maxDishes) {
        this.maxDishes = maxDishes;
    }

    // Загрузка машины по одному предмету переменной dirtyDishes, количество которых не может превышать заданное в конструкторе значение maxDishes
    // При попытке загрузить посуду в работающую машину, либо загрузить количество, превышающее максимальное, метод выкинет RuntimeException.
    public void load() {
        if (dirtyDishes >= maxDishes) {
            throw new IllegalArgumentException("Maximum amount of dishes is reached.");
        } else if (status == Status.WORKING) {
            throw new RuntimeException("The dishwasher is working now.");
        } else if (cleanDishes != 0) {
            throw new RuntimeException("Unload the clean dishes first.");
        }
        dirtyDishes += 1;
        System.out.println("Amount of dirty dishes now is: " + dirtyDishes);

    }

    //Метод позволяет выгрузить всю посуду из машины.
    //Если машина пуста, то выкинется RuntimeException.
    public void unload() throws RuntimeException {
        if (cleanDishes == 0 && dirtyDishes == 0) {
            throw new RuntimeException("The dishwasher is already empty.");
        }
        cleanDishes = 0;
        dirtyDishes = 0;
        status = Status.READY;
        System.out.println("The dishwasher is empty now.");
    }

    //Метод запускает работу машины. В случае если она уже работает, то метод выкинет WashingInProgressException.
    public void run() throws WashingInProgressException {
        if (status == Status.WORKING) {
            throw new WashingInProgressException("The dishwasher is already working!");
        }
        System.out.println("Dishwashing is in progress...");
        status = Status.WORKING;

    }

    // Данный метод останавливает работающую машину. Если машина не работает, то метод выкинет StopWorkException.
    public void stop() throws StopWorkException {
        if (status == Status.WORKING) {
            System.out.println("Dishwashing is complete.");
            cleanDishes = dirtyDishes;
            dirtyDishes = 0;
            status = Status.FINISHED;
        } else throw new StopWorkException("The dishwasher does not working.");
    }
}