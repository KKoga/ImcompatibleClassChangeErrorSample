import java.lang.System;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("==============================");

        System.out.println("derived var test");
        try
        {
            derived_var_test();
        } catch (Error e)
        {
            System.out.println("error " + e);
        }

        System.out.println("==============================");

        System.out.println("base var test");
        try
        {
            base_var_test();
        } catch (Error e)
        {
            System.out.println("error " + e);
        }

        System.out.println("==============================");

        System.out.println("var free test");
        try
        {
            var_free_test();
        } catch (Error e)
        {
            System.out.println("error " + e);
        }

        System.out.println("==============================");
    }

    static void derived_var_test()
    {
        Derived d = new Derived();
	boolean b = d.isOk();
        System.out.println("bool="+b);
    }

    static void base_var_test()
    {
        Base d = new Derived();
	boolean b = d.isOk();
        System.out.println("bool="+b);
    }

    static void var_free_test()
    {
	boolean b = new Derived().isOk();
        System.out.println("bool="+b);
    }
}
