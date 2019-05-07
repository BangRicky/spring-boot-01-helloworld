package access;

/**
 * @author jinbang
 * @create 2019-05-05 10:02
 */
public class Cake {
    public static void  main(String[] args){
        Pie pie = new Pie();
        pie.f();   //因为同属access包，所以可以创建Pie对象并调用它的f()方法
    }
}
