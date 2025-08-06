package Student;

import java.util.*;

public class Student {
    private String id;
    private String name;
    private String password;
    private Map<Integer, Semester> semesters = new HashMap<>();

    public Student(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getPassword() { return password; }

    public void addSubjectToSemester(int semNo, Subject s) {
        semesters.putIfAbsent(semNo, new Semester(semNo));
        semesters.get(semNo).addSubject(s);
    }

    public Semester getSemester(int semNo) {
        return semesters.get(semNo);
    }
}

