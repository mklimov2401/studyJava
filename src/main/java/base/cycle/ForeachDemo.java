package base.cycle;

public class ForeachDemo {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = i * j;
            }
        }

        for (int[] x : arr) {
            for (int y : x) {
                System.out.println(y);
            }
        }
    }
}
