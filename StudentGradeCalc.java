import java.util.Scanner;

public class StudentGradeCalc {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the number of subjects: ");
			int numSubjects = sc.nextInt();
			int totalMarks = 0;
			System.out.println("----------------------------");
			for (int i = 0; i < numSubjects; i++) {
				System.out.print("Enter marks for subject " + (i + 1) + ": ");
				int marks = sc.nextInt();
				if (marks < 0 || marks > 100) {
					System.out.println("----------------------------");
					System.out.println("Marks Should Be Between 0 To 100" + "\nExiting Program ...");
					return;
				} else {
					totalMarks += marks;
				}
			}
			double average = (double) totalMarks / numSubjects;

			System.out.println("----------------------------");

			System.out.println("Total Marks: " + totalMarks);
			System.out.println("Average Marks: " + average);
			if (average >= 90) {
				System.out.println("Grade: A");
			} else if (average >= 80) {
				System.out.println("Grade: B");
			} else if (average >= 70) {
				System.out.println("Grade: C");
			} else if (average >= 60) {
				System.out.println("Grade: D");
			} else if (average >= 40) {
				System.out.println("Grade: E");
			} else if (average == 40) {
				System.out.println("Grade: pass");
			} else {
                System.out.println("----------------------------");
				System.out.println("Failed !!");
                System.out.println("Avg Required To Pass Is 40");
			}
            System.out.println("----------------------------");

		} catch (Exception e) {
			System.out.println("----------------------------");
			System.out.println("Input Can Only Be Numbers!!");
		}

		sc.close();
	}
}
