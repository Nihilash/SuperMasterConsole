package Staff;

import Data.Database;
import Data.RevaluationRequest;
import Student.*;

import java.util.*;

public class StaffDashboard {
    private Staff staff;
    private Scanner sc;

    public StaffDashboard(Staff staff, Scanner sc) {
        this.staff = staff;
        this.sc = sc;
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n Welcome, " + staff.getName() + " (ID: " + staff.getId() + ")");
            System.out.println("1. Add Student");
            System.out.println("2. Add Subject to Semester");
            System.out.println("3. Enter/Update Marks");
            System.out.println("4. View Revaluation Requests");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Password: ");
                    String pass = sc.nextLine();
                    Database.addStudent(new Student(id, name, pass));
                    System.out.println(" Student added.");
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    String sid = sc.nextLine();
                    Student s = Database.getStudentById(sid);
                    if (s == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    System.out.print("Semester: ");
                    int sem = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Subject Code: ");
                    String code = sc.nextLine();
                    System.out.print("Subject Name: ");
                    String sname = sc.nextLine();
                    s.addSubjectToSemester(sem, new Subject(code, sname));
                    System.out.println(" Subject added.");
                    break;

                case 3:
                    System.out.print("Student ID: ");
                    String stid = sc.nextLine();
                    Student stu = Database.getStudentById(stid);
                    if (stu == null) {
                        System.out.println(" Not found.");
                        break;
                    }
                    System.out.print("Semester: ");
                    int semno = sc.nextInt();
                    sc.nextLine();
                    Semester semobj = stu.getSemester(semno);
                    if (semobj == null) {
                        System.out.println(" No subjects.");
                        break;
                    }
                    for (Subject subj : semobj.getSubjects()) {
                        System.out.print("Marks for " + subj.getCode() + ": ");
                        float marks = sc.nextFloat();
                        subj.setMarks(marks);
                    }
                    break;

                case 4:
                    for (RevaluationRequest req : Database.getRevaluationRequests()) {
                        if (!req.isProcessed()) {
                            System.out.println(req);
                            System.out.print("Enter new marks: ");
                            float nm = sc.nextFloat();
                            req.getSubject().setMarks(nm);
                            req.markProcessed();
                            System.out.println("Updated.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Logging out...");
                    return;
            }
        }
    }
}

