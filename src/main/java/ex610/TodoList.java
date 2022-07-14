package ex610;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;


    public TodoList(){
        this.list = new ArrayList<>();
    }
    public void add(String task){
        this.list.add(task);
    }
    public void print(){ // wyświetla pozycje i zadanie
        for(String task : list){
            System.out.println(task.indexOf(task) + ": " + task.);
        }
    }
    public void remove(int number){
            this.list.remove(number);
        }
    }
}
