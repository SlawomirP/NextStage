package ex7_06;

public class StarPrinter {
    //RYSUJE OKRESLONA ILOSC GWIAZDEK
    public String printer(int amountOfStars) {
        String stars = "";
        for (int i = 1; i <= amountOfStars; i++) {
            stars += "*";
        }
        return stars;
    }
}
