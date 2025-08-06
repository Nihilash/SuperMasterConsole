package Student;

import Data.Database;
import Data.RevaluationRequest;

import java.util.Scanner;

public class StudentDashboard {
    private Student student;
    private Scanner sc;

    public StudentDashboard(Student student, Scanner sc) {
        this.student = student;
        this.sc = sc;
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n👨‍🎓 Welcome, " + student.getName() + " (ID: " + student.getId() + ")");
            System.out.println("1. View Semester Marksheet");
            System.out.println("2. Apply for Revaluation");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter semester number (1–8): ");
                    int semNo = sc.nextInt();
                    sc.nextLine();
                    Semester sem = student.getSemester(semNo);
                    if (sem == null) {
                        System.out.println("❌ No data found.");
                        break;
                    }
                    System.out.println("\n===== Marksheet for Semester " + semNo + " =====");
                    for (Subject subj : sem.getSubjects()) {
                        System.out.printf("%-20s %-35s Marks: %.1f  Grade: %s\n",
                                subj.getCode(), subj.getName(), subj.getMarks(), subj.getGrade());
                    }
                    System.out.printf("Total      : %.2f\n", sem.getTotal());
                    System.out.printf("Average    : %.2f\n", sem.getAverage());
                    System.out.printf("Percentage : %.2f%%\n", sem.getAverage());
                    System.out.println("============================================");
                    break;

                case 2:
                    System.out.print("Enter semester number to revaluate: ");
                    int rsem = sc.nextInt();
                    sc.nextLine();
                    Semester rsemObj = student.getSemester(rsem);
                    if (rsemObj == null) {
                        System.out.println("❌ No such semester.");
                        break;
                    }
                    for (Subject subj : rsemObj.getSubjects()) {
                        if (subj.getMarks() < 50) {
                            System.out.print("Apply revaluation for " + subj.getCode() + "? (y/n): ");
                            String res = sc.nextLine();
                            if (res.equalsIgnoreCase("y")) {
                                Database.addRevaluationRequest(new RevaluationRequest(student.getId(), rsem, subj));
                                System.out.println("✅ Revaluation requested for " + subj.getCode());
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("❌ Invalid option.");
            }
        }
    }
}
