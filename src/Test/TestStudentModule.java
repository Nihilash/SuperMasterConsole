package Test;

import Data.Database;
import Staff.Staff;
import Student.Student;
import Student.Subject;

public class TestStudentModule {
    public static void loadDummyData() {
        Student s = new Student("student01", "Nihilash", "pass123");
        s.addSubjectToSemester(1, new Subject("MA8151", "Engineering Maths I"));
        s.addSubjectToSemester(1, new Subject("PH8151", "Physics"));
        s.addSubjectToSemester(1, new Subject("CY8151", "Chemistry"));
        Database.addStudent(s);

        Staff t = new Staff("staff01", "Ms. Rekha", "admin123");
        Database.addStaff(t);
    }
}
