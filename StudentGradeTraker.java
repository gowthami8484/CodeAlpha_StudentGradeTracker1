import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTraker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grade for student" + (i + 1) + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int grade : grades) {
            sum += grade;
            if (grade > highest)
                highest = grade;
            if (grade < lowest)
                lowest = grade;
        }
        double average = (double) sum / grades.size();
        System.out.println("\n--Student Grades Summary--");
        System.out.println("All Grades:" + grades);
        System.out.println("Average Score:" + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        scanner.close();
    }
}