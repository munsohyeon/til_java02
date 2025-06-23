package Control.ioc;

import control.Tv;

import static java.awt.SystemColor.control;

public class Test {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();

        //TvFactory tvFactory1 = new TvFactory(); //막아주세요.
        Tv tv = tvFactory.factory(args[0], args[1]);
        tv.sound();
    }
}