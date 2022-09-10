package base.typedata.simple.types.data;

import base.typedata.numbers.systems.NumberSystem;

public class Letter {
    public static void main(String[] args) {
        double num = 12__111.22;
        char ch = 'g';
        char ch1 = '\141';
        char ch2 = '\t';
        System.out.println(String.format("%s %s",ch2 , ch1));
        int d = 258;
        byte b = (byte) d;
        short s = b;
        byte b1 = (byte) s;
        System.out.println(b);
        NumberSystem.converterNumSys("1000000", 10, 2);
        //String numSys = NumberSystem.converterNumSys("00000010", 2, 10);
        //System.out.println(1000/256);
        byte b2 = 100;
        b2 *= 2;
        double d1 = .1233;
        int i = 1000000;
        byte b3 = (byte) i;
        System.out.println(b3);
    }
}
