package base.typedata.simple.types.data;

import java.text.DecimalFormat;

public class Light {

    public static void main(String args[]) {

        int lightspeed;
        long days;
        long seconds;
        long distance;
// приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 365; //указать количество дней
        seconds = days * 24 * 60 * 60;
// преобразовать в секунды
        distance = lightspeed * seconds;
// вычислить расстояние
        System.out.print("Зa " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(String.format("%,d миль.", distance));
        System.out.println(new DecimalFormat("###,###.##").format(distance));
    }
}
