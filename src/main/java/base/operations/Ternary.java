package base.operations;

public class Ternary {
    public static void main(String[] args) {
        int k, i;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println(String.format("%d равно %d", i, k));

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println(String.format("%d равно %d", i, k));

    }
}
