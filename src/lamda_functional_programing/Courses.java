package lamda_functional_programing;

public class Courses {
    //POJO==>plain Old Java Object
    //variables
    //getters setters
    //constructor
    //toString()
    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    //1) constructor with non parametrise


    public Courses() {

    }
        // 2) constructor with paremeters
    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    // 3) getters and setters


    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    //4) toString()


    @Override
    public String toString() {
        return "Courses{" +
                "Season='" + Season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageScore=" + averageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
