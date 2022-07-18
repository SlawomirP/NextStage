package ex7_08;

public class Bird {

    private String name;
    private String latinName;
    private int observationCounter;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCounter = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void observation(){
        this.observationCounter ++;
    }


    public String toString (){
        return this.name + "(" + this.latinName + "): " + this.observationCounter + " observations";
    }
}
