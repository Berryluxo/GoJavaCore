package Offline.Offline5;

import java.math.BigDecimal;

/**
 * Created by Lina.Burkalo on 23.02.2017.
 */
public class ConvertationGrnToDol {

    double course;


    public ConvertationGrnToDol(double course) {
        this.course = course;
    }

    public double convert(double summ) {
       double res = summ / course;

       res = new BigDecimal(res).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
       return res;
    }


}
