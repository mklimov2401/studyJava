package base.cycle;

public class ForDemo {
    public static void main(String[] args) {
        boolean done = false;
        int i = 0;

        for (;!done;){
            if (i == 10) done = true;
            System.out.println(i);
            i++;

        }

        //for (;;);
    }
}
