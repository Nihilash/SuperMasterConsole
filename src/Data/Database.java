package Data;

import Staff.Staff;
import Student.Student;

import java.util.*;

public class Database {
    private static Map<String, Student> studentMap = new HashMap<>();
    private static Map<String, Staff> staffMap = new HashMap<>();
    private static List<RevaluationRequest> revalRequests = new ArrayList<>();

    public static void addStudent(Student s) {
        studentMap.put(s.getId(), s);
    }

    public static Student getStudentById(String id) {
        return studentMap.get(id);
    }

    public static void addStaff(Staff t) {
        staffMap.put(t.getId(), t);
    }

    public static Staff getStaffById(String id) {
        return staffMap.get(id);
    }

    public static void addRevaluationRequest(RevaluationRequest req) {
        revalRequests.add(req);
    }

    public static List<RevaluationRequest> getRevaluationRequests() {
        return revalRequests;
    }
}
