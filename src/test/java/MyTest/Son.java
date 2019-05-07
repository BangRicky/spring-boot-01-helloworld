package MyTest;

/**
 * @author jinbang
 * @create 2019-05-05 17:29
 */
public class Son extends Father{
    private int i = test();
    private static int j = method();

    static{
        System.out.print("(6)");
    }
    Son(){
        super();//写或不写都在，在子类的构造器中一定会调用父类的构造器
        System.out.print("(7)");
    }
    {
        System.out.print("(8)");
    }

    public int  test(){
        System.out.print("(9)");
        return 1;
    }
    public static int method(){
        System.out.print("(10)");
        return 1;
    }
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println();
        Son son2 = new Son();
    }

}
