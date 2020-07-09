package GeekBrains;

public class Cat {
    private int hunger;
    private boolean satiety;


    public Cat(int hunger) {
        this.hunger = hunger;
    }

    public boolean willToEat() {
        return satiety;
    }

    public int eat(int foodPlate) {
        if (hunger <= foodPlate) {
            satiety = true;
            foodPlate -= hunger;
            return foodPlate;
        }
        return foodPlate;
    }

    public void eat2(PlateWithFood food) {
        satiety = food.takeFood(hunger);
    }
}
