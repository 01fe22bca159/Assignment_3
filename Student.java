public class Student extends Marks {
    String stud_name = "Shashank";
    String usn = "01fe22bca159";
    String program = "BCA";
    String dept = "Computer Applications";

    public void display() {
        System.out.println("Student name:" + stud_name);
        System.out.println("USN:" + usn);
        System.out.println("Program:" + program);
        System.out.println("Department:" + dept);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s.getCourses();
        s.getMarks();
        s.displayMarksLessThan40();
    }
}