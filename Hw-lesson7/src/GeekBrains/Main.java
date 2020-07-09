package GeekBrains;

public class Main {

    public static void main(String[] args) {
        PlateWithFood foodPlate = new PlateWithFood(32);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat(12);
        cats[1] = new Cat(20);
        cats[2] = new Cat(300);
        cats[3] = new Cat(5);
        for (int i = 0; i < cats.length; i++) {
            foodPlate.setFood(cats[i].eat(foodPlate.getFood()));
//            cats[i].eat2(foodPlate);
            System.out.println("Satiety:" + cats[i].willToEat());
            System.out.println("Food left:" + foodPlate.getFood());
        }
        foodPlate.addFood(30);
        System.out.println("Food have been added, food left: " + foodPlate.getFood());
    }
}
