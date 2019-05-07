package MyTest;

/**
 * @author jinbang
 * @create 2019-05-05 17:20
 */
public class Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("(1)");
    }

    Father() {
        System.out.print("(2)");
    }

    {
        System.out.print("(3)");
    }

    private int test() {
        System.out.print("(4)");
        return 1;
    }

    private static int method() {
        System.out.print("(5)");
        return 1;
    }


}
