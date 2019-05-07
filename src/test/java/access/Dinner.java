package access;

import access.dessert.Cookie;

/**
 * @author jinbang
 * @create 2019-04-30 14:43
 */
public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();  //Output: Cookie constructor
        //注意：x.bite()不能access,因为bite()方法的权限修饰词默认是default,而default的访问范围是"可以被这个类本身或者同一个包中的其他类所访问"
    }
}
