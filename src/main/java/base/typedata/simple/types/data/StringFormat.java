package base.typedata.simple.types.data;

import java.util.Date;

public class StringFormat {

    public static void main(String[] args) {
        String s6 = String.format("Hello, %2$s  %1$,.2f",2120033.45, "world!");
        System.out.println(s6);
        String s = String.format("Hello, %s", "world!");
        System.out.println(s);
        String s1 = String.format("Hello, %b", null);
        System.out.println(s1);
        String s2 = String.format("Hello, %h", "null");
        System.out.println(s2);
        String s3 = String.format("Hello, %c", 'n');
        System.out.println(s3);
        String s4 = String.format("Hello, %d", 120);
        System.out.println(s4);
        String s5 = String.format("Hello, %tA", new Date());
        System.out.println(s5);
    }
}
