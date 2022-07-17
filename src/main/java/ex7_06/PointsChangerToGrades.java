package ex7_06;

public class PointsChangerToGrades {
    public int changerM(int points) {
        int grade = 0;
        if (points >= 0 && points < 50) {
            grade = 0;
        }
        if (points >= 50 && points < 60) {
            grade = 1;
        }
        if (points >= 60 && points < 70) {
            grade = 2;
        }
        if (points >= 70 && points < 80) {
            grade = 3;
        }
        if (points >= 80 && points < 90) {
            grade = 4;
        }
        if (points >= 90 && points <= 100) {
            grade = 5;
        }
        return grade;
    }
}




