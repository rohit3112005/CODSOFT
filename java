import java.util.Scanner;

public class StudentGrades {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = 4;
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        char Grade;
        if (averagePercentage >= 95) {
            Grade = 'E';
        } else if (averagePercentage >= 85) {
            Grade = 'A';
        } else if (averagePercentage >= 72) {
            Grade = 'B';
        } else if (averagePercentage >= 62) {
            Grade = 'C';
        } else if (averagePercentage >= 52) {
            Grade = 'D';
        }
        else  {
            Grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + Grade);
    }
}
