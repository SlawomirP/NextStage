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
            System.out.println((list.indexOf(task) + 1) + ": " + task);
        }
    }
    public void remove(int number){ // usuwa z listy task o indexie number
            this.list.remove(this.list.get(number - 1));
        }
    }

