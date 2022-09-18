package base.transitionOperators;

public class BreakLoop2 {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            System.out.printf("Проход %d ", i);
            for (int j = 0; j < 100; j++) {
                if (j ==10) break outer;
                System.out.print(j + " ");
            }
        }
        System.out.println("После outer");
    }
}
