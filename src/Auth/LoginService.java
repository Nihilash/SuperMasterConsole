package Auth;

import Data.Database;
import Staff.Staff;
import Student.Student;

public class LoginService {
    public static Student validateStudent(String id, String password) {
        Student s = Database.getStudentById(id);
        return (s != null && s.getPassword().equals(password)) ? s : null;
    }

    public static Staff validateStaff(String id, String password) {
        Staff t = Database.getStaffById(id);
        return (t != null && t.getPassword().equals(password)) ? t : null;
    }
}
