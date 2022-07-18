package ex7_08;

import java.util.ArrayList;


public class ListForBirds {

    private ArrayList<Bird> birdList;


    public ListForBirds() {
        this.birdList = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birdList.add(bird);
    }

    public void all() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    public void one(String oneName) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(oneName)) {
                System.out.println(bird);
            }
        }
    }

}
