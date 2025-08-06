package Student;

import java.util.ArrayList;
import java.util.List;

public class Semester {
    private int number;
    private List<Subject> subjects = new ArrayList<>();

    public Semester(int number) {
        this.number = number;
    }

    public void addSubject(Subject s) {
        subjects.add(s);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public float getTotal() {
        float total = 0;
        for (Subject s : subjects) total += s.getMarks();
        return total;
    }

    public float getAverage() {
        return subjects.isEmpty() ? 0 : getTotal() / subjects.size();
    }
}
