/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-03
 * Time:9:14
 **/



class Calculator{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Calculator() {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int plus(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return (num1-num2);
    }
    public double div(int num1,int num2){
        return (double)(num1/num2);
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
}

class MyValue{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class HomeWork {
    public static void swap(MyValue myValue1,MyValue myValue2){
       int tmp = myValue1.getValue();
       myValue1.setValue(myValue2.getValue());
       myValue2.setValue(tmp);
    }

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
        myValue1.setValue(10);
        myValue2.setValue(20);
        swap(myValue1,myValue2);
        System.out.println(myValue1.getValue());
        System.out.println(myValue2.getValue());
    }

    public static void main1(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setNum1(20);
        calculator.setNum2(3);
        System.out.println(calculator.div(calculator.getNum1(), calculator.getNum2()));

    }
}
