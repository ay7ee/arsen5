package Task2;

public class Student {

    private String name;
    private  int age;


    Student (String name, int age){}


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
