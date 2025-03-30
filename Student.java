public class Student {

    //private instance variables
    private String Sname;
    private int grade;

    //getter and setter methods for Sname and grade
    public String getSName() {
        return Sname;
    }

    public void setSName(String Sname) {
        this.Sname = Sname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //method to check if the grade is valid (between 0 and 100)
    public void checkGrade() {
        if (grade < 0 || grade > 100) {
            grade = 0;
        }
    }

    //method to to display output
    public void printStudent() {
        System.out.println("Student Name: " + Sname);
        System.out.println("Grade: " + grade);
    }

    //main method to test the class
    public static void main(String[] args) {

        Student student = new Student();

        student.setSName("Wesley Githinji");
        student.setGrade(69);

        student.checkGrade();
        student.printStudent();
    }

}