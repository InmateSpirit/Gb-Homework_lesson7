package GeekBrains;

public class PlateWithFood {
    private int food;

    public PlateWithFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int amountToAdd) {
        food += amountToAdd;
    }

    public boolean takeFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        System.out.println("Not enough food");
        return false;
    }


}
