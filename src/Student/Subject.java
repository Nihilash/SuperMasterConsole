package Student;

public class Subject {
    private String code;
    private String name;
    private float marks;

    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public float getMarks() { return marks; }
    public void setMarks(float marks) { this.marks = marks; }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
}

