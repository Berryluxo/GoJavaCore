package Offline.Ofline5;

/**
 * Created by Lina.Burkalo on 23.02.2017.
 */
public class SomeChild extends SomeParent {

    protected String classNameChild = "[" + getClass().getSimpleName() + "]";
    private String name = "Pasha";
    private String secondName;

    private int years = calculate();

    {
        System.out.println(classNameChild + " init block");
        System.out.println(classNameChild + " secondName: " + secondName);

        secondName = name + years;

        System.out.println(classNameChild + " secondName: " + secondName);

    }

    public SomeChild() {
        super(5);
        System.out.println(classNameChild + " constructor");

    }

    private int calculate() {
        System.out.println(classNameChild + " Calculate method");
        return 17;
    }
}
