package ex7_06;

import java.util.Scanner;
public class UserPanel {

    private ListCreator pointsList;
    private ListCreator pointsForPassingGrade;
    private ListCreator gradesList;
    private PointsChangerToGrades changer;
    private Scanner scanner;
    private StarPrinter starPrinter;

    public UserPanel() {
        this.pointsList = new ListCreator();
        this.pointsForPassingGrade = new ListCreator();
        this.gradesList = new ListCreator();
        this.scanner = new Scanner(System.in);
        this.changer = new PointsChangerToGrades();
        this.starPrinter = new StarPrinter();
    }
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.parseInt(scanner.nextLine());
            if (points == -1) { // JEZELI UZYTKOWNIK WPROWADZI -1 TO STOP
                break;
            }
            if (points >= 50) { // DODA PUNKTY DO OSOBNEJ LISTY Z BONUSOWYMI PKT
                pointsForPassingGrade.add(points);
            }
            pointsList.add(points);
            if (points >= 0 && points <= 100) {
                gradesList.add(changer.changerM(points));
            }
        }
        System.out.println("Point average (all): " + pointsList.average());
        if (pointsForPassingGrade.average() != -1) { //  ZALEZNIE OD WYNIKU WYPISZE KOMUNIKAT
            System.out.println("Point average (passing): " + pointsForPassingGrade.average());
        } else {
            System.out.println("Point average (passing): -");
        }
        //WYSWIETLI PROCENTOWY UDZIAL ZDAJACYCH DO WSZYSTKICH ZALICZAJACYCH
        System.out.println("Pass percentage: " + (double) (100 * pointsForPassingGrade.getSize()) / pointsList.getSize());

        System.out.println("Grade distribution:" + "\n" + "5: " + starPrinter.printer(gradesList.numberOf(5)) +
                "\n" + "4: " + starPrinter.printer(gradesList.numberOf(4)) +
                "\n" + "3: " + starPrinter.printer(gradesList.numberOf(3)) +
                "\n" + "2: " + starPrinter.printer(gradesList.numberOf(2)) +
                "\n" + "1: " + starPrinter.printer(gradesList.numberOf(1)) +
                "\n" + "0: " + starPrinter.printer(gradesList.numberOf(0)));
    }
}

