package Tdd;

public class StudentGradeReport {

    int[][] grades = new int[5][6];

    public StudentGradeReport(int[][] grades) {
        this.grades = grades;
    }

    public int getSumForStudent(int indexNumber) {
        int sum = 0;
        for (int counter = 0; counter < grades[indexNumber].length; counter++) {
            sum += grades[indexNumber].length;
        }
        return sum;
    }

    public double getAverage(int indexNumber) {
        return (double) getSum(indexNumber) / grades[indexNumber].length;
    }

    private Object getSum(int indexNumber) {
        return 0;
    }

}


