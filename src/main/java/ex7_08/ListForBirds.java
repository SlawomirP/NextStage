package ex7_08;

import java.util.ArrayList;
import java.util.Scanner;

public class ListForBirds {

    private ArrayList<Bird> birdList;


    public ListForBirds() {
        this.birdList = new ArrayList<>();
    }

    public void add(Bird bird) {
        birdList.add(bird);
    }

    public void all(){
        for(Bird bird : birdList){
            System.out.println(bird);
        }
    }

}
