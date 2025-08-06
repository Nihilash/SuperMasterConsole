package Data;

import Student.Subject;

public class RevaluationRequest {
    private String studentId;
    private int semester;
    private Subject subject;
    private boolean processed = false;

    public RevaluationRequest(String studentId, int semester, Subject subject) {
        this.studentId = studentId;
        this.semester = semester;
        this.subject = subject;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getSemester() {
        return semester;
    }

    public Subject getSubject() {
        return subject;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void markProcessed() {
        this.processed = true;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Semester: " + semester +
               ", Subject: " + subject.getCode() + " - " + subject.getName() +
               ", Marks: " + subject.getMarks() +
               ", Processed: " + processed;
    }
}
