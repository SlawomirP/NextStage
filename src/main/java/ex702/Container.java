package ex702;

public class Container {

    private String name;
    private int amountOfWater;
    private int amountLimit;

    public Container(String name) {
        this.name = name;
        this.amountOfWater = 0;
        this.amountLimit = 100;
    }

    public void add(int amountOfWater) {
        if (this.amountOfWater + amountOfWater > this.amountLimit) {
            this.amountOfWater = 100;
        }
        this.amountOfWater += amountOfWater;
    }

    public void remove(int amountOfWater){
        if(this.amountOfWater - amountOfWater < 0){
            this.amountOfWater = 0;
        }
        if(this.amountOfWater - amountOfWater >= 0){
            this.amountOfWater -= amountOfWater;
        }
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public int getAmountLimit() {
        return amountLimit;
    }

    public String toString() {
        return this.name + ": " + this.amountOfWater + "/" + this.amountLimit;
    }
}

