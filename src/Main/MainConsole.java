package Main;

import Auth.LoginService;
import Staff.Staff;
import Staff.StaffDashboard;
import Student.Student;
import Student.StudentDashboard;
import Test.TestStudentModule;

import java.util.Scanner;

public class MainConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Load dummy data
        TestStudentModule.loadDummyData();

        while (true) {
            System.out.println("\n======= 🎓 Welcome to SuperMasterConsole =======");
            System.out.println("Choose Login Type:");
            System.out.println("1. Student");
            System.out.println("2. Staff");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String spass = sc.nextLine();
                    Student student = LoginService.validateStudent(sid, spass);
                    if (student != null) {
                        StudentDashboard sd = new StudentDashboard(student, sc);
                        sd.showMenu();
                    } else {
                        System.out.println("❌ Invalid Student ID or Password.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Staff ID: ");
                    String tid = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String tpass = sc.nextLine();
                    Staff staff = LoginService.validateStaff(tid, tpass);
                    if (staff != null) {
                        StaffDashboard td = new StaffDashboard(staff, sc);
                        td.showMenu();
                    } else {
                        System.out.println("❌ Invalid Staff ID or Password.");
                    }
                    break;

                case 3:
                    System.out.println("✅ Thank you for using SuperMasterConsole.");
                    return;

                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}

