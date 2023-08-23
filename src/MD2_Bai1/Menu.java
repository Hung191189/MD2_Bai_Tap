package MD2_Bai1;

import java.util.Scanner;

public class Menu {
    public static void MenuList(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        ClassesManager classesManager = new ClassesManager();
        StudentsManager studentsManager = new StudentsManager();
        ComparatorAvgPoint comparatorAvgPoint = new ComparatorAvgPoint();
        ComparatorAge comparatorAge = new ComparatorAge();
        int choiceStudent;
        do{
            System.out.println("Menu:");
            System.out.println("1. Enter Classes:");
            System.out.println("2. Enter Student:");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    classesManager.inputClasses();
                    break;
                }
                case 2:{
                    System.out.println("1. Add Student: ");
                    System.out.println("2. Delete Student: ");
                    System.out.println("3. Edit Student: ");
                    System.out.println("4. Find Student: ");
                    System.out.println("5. Student sort by age: ");
                    System.out.println("6. Student sort by point: ");
                    System.out.println("7. Display student by ID: ");
                    System.out.println("8. Display all student: ");
                    System.out.println("9. Back to menu: ");
                    choiceStudent = scanner.nextInt();
                    if (choiceStudent == 1){
                        studentsManager.addStudent();
                    } else if (choiceStudent == 2) {
                        studentsManager.deleteStudent();
                    } else if (choiceStudent == 3) {
                        studentsManager.editStudent();
                    } else if (choiceStudent == 4) {
                        studentsManager.findStudent();
                    } else if (choiceStudent == 5) {
                        studentsManager.arrayListStudent.sort(comparatorAge);
                    } else if (choiceStudent == 6) {
                        studentsManager.arrayListStudent.sort(comparatorAvgPoint);
                    } else if (choiceStudent == 7) {
                        studentsManager.displayStudentById();
                    }else if (choiceStudent == 8) {
                        studentsManager.displayStudent();
                    } else if (choiceStudent == 9) {
                        MenuList();
                    }
                }
            }
        }while (choice !=0);

    }

}
