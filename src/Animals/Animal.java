package Animals;

public class Animal {
    private int numberOfLegs;
    private String preferredClimate;

    public void setNumberOfLegs(int legs){
        this.numberOfLegs = legs;
    }
    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }
    public String getPreferredClimate(){
        return this.preferredClimate;
    }



    public String getAnimalInfo(){
        return String.format("Number of Legs: %s %nHis preferred climate: %s",numberOfLegs, preferredClimate);
    }

    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }




}
