package Collection_Problems;

import java.util.ArrayList;

class Student
{
    String name;
    int id;
    double perc;
    public Student(String name, int id, double perc)
    {
        this.name=name;
        this.id=id;
        this.perc=perc;
    }

    @Override
    public String toString()
    {
        return "Student[name="+name+",id="+id+",perc= "+perc+"]";
    }
}

public class UserDefineObject {
    public static void main(String[] args) {
        Student s1 = new Student("Chayan", 101, 65.76);
        Student s2 = new Student("Sanjoy", 102, 65.76);
        Student s3 = new Student("Ranjit", 103, 65.76);
        Student s4 = new Student("Sunil", 105, 65.76);
        Student s5 = new Student("Rupali", 104, 65.76);
        Student s6 = new Student("Dalim", 106, 65.76);

        // Add student object to ArrayList
        ArrayList<Student> stdList = new ArrayList<Student>();
        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);
        stdList.add(s4);
        stdList.add(s5);
        stdList.add(s6);
        System.out.println(stdList);
        stdList.forEach(obj -> System.out.println(obj));

    }
}
