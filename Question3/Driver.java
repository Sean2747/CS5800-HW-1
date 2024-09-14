public class Driver {
    public static void main(String[] args) {
        // a course with only one instructor and one textbook
        Instructor davarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course course1 = new Course("5800 Advanced Software Engineering", davarpanah, cleanCode);
        course1.print();

        // a course with only two instructors and two textbooks
        Instructor scorsese = new Instructor("Martin", "Scorsese", "NY-1942");
        Instructor lynch = new Instructor("David", "Lynch", "MO-1946");
        Textbook story = new Textbook("Story", "Robert McKee", "Methuen Publishing Ltd");
        Textbook dogme = new Textbook("Dogme95", "Richard Kelly", "Faber & Faber");
        Course course2 = new Course("Film Class with Two Masters", scorsese, lynch, story, dogme);
        course2.print();
    }
}
