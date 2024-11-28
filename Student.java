public class Student {
    private final Integer studentID;
    private String fullName;
    private double score;
    private String rank;

    public Student(Integer studentID, String fullName, double score) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.score = score;
        this.rank = determineRank(score);
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public Integer getStudentID() {
        return studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
        this.rank = determineRank(score);
    }

    public String getRank() {
        return rank;
    }

    private String determineRank(double score) {
        if (score < 5.0) return "Fall";
        else if (score < 6.5) return "Medium";
        else if (score < 7.5) return "Good";
        else if (score < 9.0) return "Very Good";
        else return "Excellent";
    }

    @Override
    public String toString() {
        return "ID: " + studentID + ", Name: " + fullName + ", Score: " + score + ", Rank: " + rank;
    }
}

