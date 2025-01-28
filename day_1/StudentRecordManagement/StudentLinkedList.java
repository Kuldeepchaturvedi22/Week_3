package StudentRecordManagement;

public
class StudentLinkedList {
    private StudentNode head;

    public StudentLinkedList() {
        this.head = null;
    }

    // Add a new student at the beginning, end, or a specific position
    public void addStudent(int rollNumber, String name, int age, String grade, Integer position) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (position == null) {  // Add at end
            if (head == null) {
                head = newNode;
            } else {
                StudentNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        } else if (position == 0) {  // Add at beginning
            newNode.next = head;
            head = newNode;
        } else {  // Add at specific position
            StudentNode current = head;
            int count = 0;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Delete a student by Roll Number
    public void deleteStudent(int rollNumber) {
        StudentNode current = head;
        StudentNode prev = null;
        while (current != null && current.rollNumber != rollNumber) {
            prev = current;
            current = current.next;
        }
        if (current != null) {  // Student found
            if (prev != null) {
                prev.next = current.next;
            } else {
                head = current.next;
            }
        }
    }

    // Search for a student by Roll Number
    public StudentNode searchStudent(int rollNumber) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Display all student records
    public void displayStudents() {
        StudentNode current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    // Update a student's grade by Roll Number
    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode student = searchStudent(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }
}
