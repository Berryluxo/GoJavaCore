package Zoo;

/**
 * Created by Lina.Burkalo on 16.02.2017.
 */
public class Animals {

    private String foodName = "food";

    public void feed() {
        System.out.println(getClass().getSimpleName() + " feed with " + foodName);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
