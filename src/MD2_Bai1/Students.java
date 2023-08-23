package MD2_Bai1;

import java.util.Comparator;

public class Students extends ClassesManager implements Comparator<Students> {
    private int id;
    private int age;
    private int avgPoint;
//    private Classes classes ;
    private String name;
    private String gender;

    public Students(int id, String name, int age, String gender, int avgPoint){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
//        this.classes =classes;
    }

    public Students() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(int avgPoint) {
        this.avgPoint = avgPoint;
    }

//    public Classes getClasses() {
//        return classes;
//    }
//
//    public void setClasses(Classes classes) {
//        this.classes = classes;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", age=" + age +
                ", avgPoint=" + avgPoint +
//                ", classes=" + classes +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }
        return -1;
    }
    public int compareByAvg(){
        return -1;
    }
}
