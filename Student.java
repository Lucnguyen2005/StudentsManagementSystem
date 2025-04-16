package Com.btec.assignment.lucnt;
public class Student {
    private String studentId;
    private String fullName;
    private double marks;
    private String rank;
    // Constructor
    public Student(String studentId, String fullName, double marks) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.marks = marks;
        computeRank();
    }
    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
        computeRank(); // Update rank after marks change
    }
    public String getRank() {
        return rank;
    }
    // Compute rank based on the marks according to the given scale
    private void computeRank() {
        if (marks < 5.0) {
            rank = "Fail";
        } else if (marks < 6.5) {
            rank = "Medium";
        } else if (marks < 7.5) {
            rank = "Good";
        } else if (marks < 9.0) {
            rank = "Very Good";
        } else if (marks <= 10.0) {
            rank = "Excellent";
        } else {
            rank = "Invalid"; // Marks outside allowed range
        }
    }
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + fullName + 
               ", Marks: " + marks + ", Rank: " + rank;
    }

    Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setName(String newName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setScore(double newScore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


