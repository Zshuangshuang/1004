package java10_04;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-03
 * Time:8:38
 **/

class Student{
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static{
        System.out.println("静态代码块");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    {
        this.name = "嘻嘻";
        System.out.println("实例代码块");
    }

    public Student() {
        this.name = name;
        this.age = age;
        System.out.println("构造代码块");
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Student student = new Student();
    }
}
