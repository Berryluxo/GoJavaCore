package Offline.Ofline5;

/**
 * Created by Lina.Burkalo on 23.02.2017.
 */
public class SomeParent {

    protected String classNameParent = "[ Parent ]";
    private int yearsParent = calculateParentYears();

    private int calculateParentYears() {

        System.out.println(classNameParent + " Calculate parent years method");
        return 100;
    }

    {
        System.out.println(classNameParent + " init block");

    }

    public  SomeParent(int years) {

        System.out.println(classNameParent + "constructor");
    }
}
