public class Course {
    private String courseName;
    private Instructor courseInstructor1;
    private Instructor courseInstructor2;
    private Textbook courseTextbook1;
    private Textbook courseTextbook2;

    public Course(String cn, Instructor i, Textbook t) {
        setCourseName(cn);
        this.courseInstructor1 = i;
        this.courseTextbook1 = t;
    }

    public Course(String cn, Instructor i1, Instructor i2, Textbook t1, Textbook t2) {
        setCourseName(cn);
        this.courseInstructor1 = i1;
        this.courseTextbook1 = t1;
        this.courseInstructor2 = i2;
        this.courseTextbook2 = t2;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void print() {
        if (courseInstructor2 == null) {
            System.out.println("<<<" + getCourseName() + ">>>");
            System.out.println("---Instructor---");
            courseInstructor1.print();
            System.out.println("---Textbook---");
            courseTextbook1.print();
        } else {
            System.out.println("<<<" + getCourseName() + ">>>");
            System.out.println("---Instructors---");
            System.out.println("[Instructor #1]");
            courseInstructor1.print();
            System.out.println("[Instructor #2]");
            courseInstructor2.print();
            System.out.println("---Textbooks---");
            System.out.println("[Textbook #1]");
            courseTextbook1.print();
            System.out.println("[Textbook #2]");
            courseTextbook2.print();
        }
        System.out.println();

    }
}
