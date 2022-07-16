package ex7002Corrected;

public class Container {
    private int amountOfWater;


    public Container() {
        this.amountOfWater = 0;
    }

    public int contains(){
        return this.amountOfWater;
    }

    public void add (int amount){
        if (amount > 0) {
            if (this.amountOfWater + amount > 100){
                this.amountOfWater = 100;
            }
            if (this.amountOfWater + amount >= 0 && this.amountOfWater + amount <= 100){
                this.amountOfWater += amount;
            }
        }
    }
    public void remove(int amount){
        if(amount > 0){
            if (this.amountOfWater < amount){
                this.amountOfWater = 0;
            }
            if(this.amountOfWater > amount){
                this.amountOfWater -= amount;
            }
        }
    }
    public String toString (){
        return this.amountOfWater + "/100";
    }
}
