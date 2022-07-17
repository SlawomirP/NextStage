import java.util.ArrayList;

public class Temptest {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();

        test.add(1);
        test.add(5);
        test.add(6);
        test.add(4);
        test.add(8);
        test.add(2);
        test.add(3);
        test.add(11);

        System.out.println(test.indexOf(8));

    }
}
