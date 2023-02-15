package DishStuff;
public class Dish {

    private float costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public float getCost(){
        return this.costInCents;
    }

    public String getName(){
        return this.nameOfDish;
    }
    public boolean getRec(){
        return this.wouldRecommend;
    }


    public void setCost(float cost){
        this.costInCents = cost;
    }

    public void setName(String name){
        this.nameOfDish = name;
    }

    public void setRec(boolean rec){
        this.wouldRecommend = rec;
    }


    public Dish(float costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
        System.out.printf(printSummary());
    }

    public Dish(){
        this.costInCents = 000;
        this.nameOfDish = "unknown";
        this.wouldRecommend = true;
        System.out.printf(printSummary());
    }


    public String printSummary(){
        return String.format("Cost: %.2f, Name: %s, Recommended? %b %n", costInCents,nameOfDish,wouldRecommend);
    }


}

