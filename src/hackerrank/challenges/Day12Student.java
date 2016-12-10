package hackerrank.challenges;

public class Day12Student extends Day12Person {

    private int[] testScores;

    public Day12Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    private char gradeCal() {
        int sum = 0;
        int avg;
        char grade;

        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }

        avg = sum / testScores.length;

        if (avg >= 90 && avg <= 100) {
            grade = 'O';
        } else if (avg >= 80 && avg < 90) {
            grade = 'E';
        } else if (avg >= 70 && avg < 80) {
            grade = 'A';
        } else if (avg >= 55 && avg < 70) {
            grade = 'P';
        } else if (avg >= 40 && avg < 55) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        return grade;
    }

    
}
