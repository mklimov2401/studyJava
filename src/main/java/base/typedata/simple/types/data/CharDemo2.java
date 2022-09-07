package base.typedata.simple.types.data;

public class CharDemo2 {

    public static void main(String[] args) {
        char ch1 = 0;
        for (int i = 0; i < 128; i++) {
            System.out.print(ch1++);
        }
        char ch2 = 'A';
        System.out.println("");
        System.out.println(Character.getType(ch2));
    }
}
