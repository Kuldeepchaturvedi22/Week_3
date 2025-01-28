package StudentRecordManagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        studentList.addStudent(1, "Alice", 20, "A", null);
        studentList.addStudent(2, "Bob", 21, "B", null);
        studentList.addStudent(3, "Charlie", 22, "C", null);
        studentList.displayStudents();

        studentList.deleteStudent(2);
        System.out.println("After Deletion:");
        studentList.displayStudents();

        studentList.updateGrade(3, "A+");
        System.out.println("After Grade Update:");
        studentList.displayStudents();
    }

}
