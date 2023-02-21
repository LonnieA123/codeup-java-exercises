package Animals;

import Animals.Animal;

public class Dog extends Animal {

    private String breed;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getAnimalInfo(){
        return String.format("Number of Legs: %s %nHis preferred climate: %s %nhis breed: %s"
                ,getNumberOfLegs(), getPreferredClimate(),getBreed());
    }

    Dog(int numberOfLegs, String preferredClimate, String breed){
        super(numberOfLegs,preferredClimate);
        this.breed = breed;
    }
}


