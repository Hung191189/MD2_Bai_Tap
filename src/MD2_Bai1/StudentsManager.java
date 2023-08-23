package MD2_Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsManager extends Students{
    ArrayList<Students> arrayListStudent = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addStudent(){
        int size;
        System.out.println("Enter size: ");
        size = scanner.nextInt() + arrayListStudent.size();
        for (int i = arrayListStudent.size()+1; i <= size ; i++) {
//            System.out.println("Enter ID student:");
//            setId(scanner.nextInt());
            setId(i);
            System.out.println("Enter student name:");
            setName(scanner.next());
            System.out.println("Enter student age:");
            setAge(scanner.nextInt());
            System.out.println("Enter gender");
            setGender(scanner.next());
            System.out.println("Enter Avg point");
            setAvgPoint(scanner.nextInt());

            Students students = new Students(getId(),getName(),getAge(),getGender(),getAvgPoint());
            arrayListStudent.add(students);
        }

    }
    public void displayStudent(){
        for (Students student:arrayListStudent) {
            System.out.println(student);
        }
    }
    public void displayStudentById(){
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        for (Students students : arrayListStudent) {
            if (students.getId() == id) {
                System.out.println(students);
                break;
            }
        }
    }
    public void deleteStudent(){
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayListStudent.size(); i++) {
            if(arrayListStudent.get(i).getId() == id){
                arrayListStudent.remove(arrayListStudent.get(i));
            }
        }
    }
    public void editStudent(){
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayListStudent.size(); i++) {
            if(arrayListStudent.get(i).getId() == id){
                System.out.println("Enter name: ");
                String name = scanner.next();
                System.out.println("Enter age: ");
                int age = scanner.nextInt();
                System.out.println("Enter gender: ");
                String gender = scanner.next();
                System.out.println("Enter avg point: ");
                int avg = scanner.nextInt();
                arrayListStudent.get(i).setName(name);
                arrayListStudent.get(i).setAge(age);
                arrayListStudent.get(i).setGender(gender);
                arrayListStudent.get(i).setAvgPoint(avg);
            }
        }
    }
    public void findStudent(){
        ArrayList<Students> listFind = new ArrayList<>();
        System.out.println("Enter char");
        String a = scanner.next();
        char ch = a.charAt(0);
        for (int i = 0; i < arrayListStudent.size(); i++) {
            char[] abc = arrayListStudent.get(i).getName().toCharArray();
            System.out.println(abc);
            for (int j = 0; j < abc.length; j++) {
                if(ch==(abc[j])) {
                    listFind.add(arrayListStudent.get(i));
                }
            }
        }
        for (Students students : listFind) {
            System.out.println(students);
        }
    }


    public static void main(String[] args) {
    StudentsManager studentsManager = new StudentsManager();
    ComparatorAvgPoint comparatorAvgPoint = new ComparatorAvgPoint();
    ComparatorAge comparatorAge = new ComparatorAge();
    studentsManager.addStudent();
//    studentsManager.arrayListStudent.sort(comparatorAge);
    studentsManager.displayStudent();
//    studentsManager.addStudent();
//    studentsManager.displayStudent();
    studentsManager.findStudent();

    }
}
