package MD2_Bai1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;


public class ClassesManager extends Classes{
    ArrayList<Classes> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void inputClasses(){
        int size;
        System.out.println("Enter size: ");
        size = scanner.nextInt() + arrayList.size();
        for (int i = arrayList.size(); i < size; i++) {
            setId(i);
            System.out.println("Enter Class:");
            setName(scanner.next());
            Classes classes = new Classes(getId(),getName());
            arrayList.add(classes);
        }
    }
    public void displayClass(){
        for (Classes classes:arrayList) {
            System.out.println(classes);
        }
    }
    public void deleteClass(){
        System.out.println("Enter id delete:");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getId()== id){
                arrayList.remove(arrayList.get(i));
            }
        }
    }
    public void editClass(){
        System.out.println("Enter id edit");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getId()==id){
                System.out.println("Enter name new:");
                String name = scanner.next();
                arrayList.get(i).setName(name);
                break;
            }else {
                System.out.println("Not found ID");
            }
        }
    }
    public void classByID(ClassesManager id){

    }
    public static void main(String[] args) {
        ClassesManager classesManager = new ClassesManager();
        classesManager.inputClasses();
    }
}
