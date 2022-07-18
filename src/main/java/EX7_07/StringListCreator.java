package EX7_07;

import java.util.ArrayList;

public class StringListCreator {

    private ArrayList<String> list;

    public StringListCreator() {
        this.list = new ArrayList<String>();
    }

    public ArrayList<String> getList() {
        return this.list;
    }

    public void add(String string){
        this.list.add(string);
    }
    public int getSize (){
        return this.list.size();
    }

    public void printList (){
        for(String position : list){
            System.out.println(position);
        }
    }
}
