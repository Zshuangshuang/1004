/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-03
 * Time:9:32
 **/

class Val{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class Exchange {

    public static void swap(Val val1,Val val2){
        int tmp = val1.getNum();
        val1.setNum(val2.getNum());
        val2.setNum(tmp);
    }

    public static void main(String[] args) {
        Val val1 = new Val();
        val1.setNum(10);
        Val val2 = new Val();
        val2.setNum(20);
        swap(val1,val2);
        System.out.println(val1.getNum());
        System.out.println(val2.getNum());
    }
}
