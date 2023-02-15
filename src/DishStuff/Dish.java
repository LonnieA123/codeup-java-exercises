package DishStuff;

public class Dish {
    public float costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;


    public String printSummary(){
        return String.format("Cost: %.2f, Name: %s, Recommended? %b", costInCents,nameOfDish,wouldRecommend);
    }

}

