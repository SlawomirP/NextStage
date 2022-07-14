package ex611;


import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) { // wpisujemy pkt a metoda na podst
        // tego korzysta z metody zamiany pkt na oceny i wpisuje do listy
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) { // sprawdza ile ocen okreslonego rodzaju
        // znajduje sie na liscie
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) { // zwraca ocene zaleznie od pkt
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    // metoda zwracająca srednia
    public double averageOfGrades() {
        return (double) sumOfGrades() / this.grades.size();
    }

    // robie metode pomocnicza ktora policzy wszystkie oceny
    private int sumOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int gradesSum = 0;
        for (Integer grade : this.grades) {
            gradesSum += grade;
        }
        return gradesSum;
    }
}
