
public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        manager.menu();
        manager.addStudent();
        manager.deleteStudent();
        manager.editStudent();
        manager.searchStudent();

    }
}