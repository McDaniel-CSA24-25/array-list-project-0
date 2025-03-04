import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class gradeTracker {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many grades would you like to add?");
        int gradeAmount = input.nextInt();

        for (int i = 0; i < gradeAmount; i++) {
            System.out.println("Please enter the grade (0-100)");
            Double grade = input.nextDouble();

            grades.add(grade);
        }

        double sum = 0;
        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        double mean = (sum/grades.size());
        System.out.println("Your average grade is: " + mean);

        double lowestGrade = grades.get(0);
        for (int i = 1; i < grades.size(); i++){
            if (lowestGrade > grades.get(i)) {
                lowestGrade = grades.get(i);
            }
        }
        System.out.println("Your lowest grade is: " + lowestGrade);

        double highestGrade = grades.get(0);
        for (int i = 1; i < grades.size(); i++){
            if (highestGrade < grades.get(i)) {
                highestGrade = grades.get(i);
            }
        }
        System.out.println("Your highest grade is: " + highestGrade);

        ArrayList<Double> passingGrades = new ArrayList<Double>();
        ArrayList<Double> failingGrades = new ArrayList<Double>();
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) < 60) {
                failingGrades.add(grades.get(i));
            }
            else {
                passingGrades.add(grades.get(i));
            }
        }
        System.out.println("Your passing grades are: " + Arrays.toString(new ArrayList[]{passingGrades}));
        System.out.println("Your failing grades are: " + Arrays.toString(new ArrayList[]{failingGrades}));
    }
}
