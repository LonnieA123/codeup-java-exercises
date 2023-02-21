package Animals;

public class Fish extends Animal {
    private double waterTemp;
    private int numberOfFins;

    public void setWaterTemp(float waterTemp) {
        this.waterTemp = waterTemp;
    }

    public double getWaterTemp() {
        return waterTemp;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    @Override
    public String getAnimalInfo() {
        return String.format("Number of fins: %s %nHis preferred climate: %s with a temp of %s",numberOfFins, getPreferredClimate(),getWaterTemp());
    }

    public Fish(int numberOfFins, String preferredClimate, double waterTemp) {
        super(numberOfFins, preferredClimate);
        this.numberOfFins = numberOfFins;
        this.waterTemp = waterTemp;
    }

}
