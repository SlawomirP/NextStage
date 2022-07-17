package ex7_06;

import java.util.ArrayList;

public class ListCreator {
    private ArrayList<Integer> list;

    public ListCreator() {
        this.list = new ArrayList<>();
    }

    // DODAJE PUBKTY TYLKO Z OKRESLONEGO ZAKRESU
    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.list.add(grade);
        }
    }

    // ZWRACA STWORZONA LISTE
    public ArrayList<Integer> getList() {
        return this.list;
    }

    // SUMUJE PUNKTY W ;ISCIE O ILE NIE JET PUSTA
    public int sum() {
        if (list.size() != 0) {
            int sumPointsInList = 0;
            for (Integer points : list) {
                sumPointsInList += points;
            }
            return sumPointsInList;
        }
        return 0;
    }

    // OBLICZA SREDNIA Z LISTY O ILE NIE JEST PUSTA
    public double average() {
        if (list.size() != 0) {
            return (double) sum() / list.size();
        }
        return -1;
    }

    public int getSize() {
        return this.list.size();
    }

    // SPRAWDZA ILE RAZY WYSTAPI W TABLICY SZUKANA WARTOSC
    public int numberOf(int lookingFor) {
        int counter = 0;
        for (Integer number : this.list) {
            if (number == lookingFor) {
                counter++;
            }
        }
        return counter;
    }
}
