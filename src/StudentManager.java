import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Them sinh vien
    public void addStudent() {
        System.out.println("Id: ");
        String id = scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Major: ");
        String major = scanner.nextLine();

        // Check ID
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println("Id da ton tai.");
                return;
            }
        }

        students.add(new Student(id, name, age, major));
        System.out.println("Da them thanh cong!");
    }

    // Hien thi danh sach
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sach trong.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Update thong tin
    public void editStudent() {
        System.out.println("Nhap Id sinh vien can update: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Nhap ten moi: ");
                student.setName(scanner.nextLine());
                System.out.println("Nhap tuoi moi: ");
                student.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhap chuyen nganh moi: ");
                student.setMajor(scanner.nextLine());
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien id: " + id);
    }

    // Delete sinh vien
    public void deleteStudent() {
        System.out.println("Nhap id sinh vien can xoa: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Da xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien id: " + id);
    }

    // Tim kiem
    public void searchStudent() {
        System.out.println("Nhap id sinh vien: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien id: " + id);
    }

    // Hiển thị menu
    public void menu() {
        while (true) {
            System.out.println("\n--- Quản lý sinh viên ---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xem danh sách sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}