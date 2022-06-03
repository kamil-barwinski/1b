package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;


public class CamelizeTest {
    public static void main(String[] args) {
        StringFun sf = new StringFun();
        String txt = "Taka Zabawna funkcja";
        System.out.printf(StringFun.camelize(txt));
    }
}
