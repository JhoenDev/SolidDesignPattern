public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Jhoen");

        LibraryResource book = new Book("Software Engineering");
        LibraryResource journal = new Journal("Software Engineerng 2");

        student.borrowResource(book);
        student.borrowResource(journal);

    }
}
