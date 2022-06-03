package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

public class DecamelizeTest {
    public static void main(String[] args) {
        StringFun sf = new StringFun();
        String txt = "TakaZabawnaFunkcjaToJest";
        System.out.printf(StringFun.dec(txt));
    }
}