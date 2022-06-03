package pl.lublin.wsei.java.cwiczenia.mylib;


import java.util.Locale;

public class StringFun {

    public static  String translit(String arg) {
        var result = new StringBuilder();
        for (int index = 0; index < arg.length(); index++) {
            var orginalLetter = arg.charAt(index);
            var letter = String.valueOf(orginalLetter);
            if(Character.isUpperCase(orginalLetter) == true) {
                var l1 = letter.toLowerCase(Locale.ROOT);
                result.append(l1);
            } else {
                var l2 = letter.toUpperCase(Locale.ROOT);
                result.append(l2);
            }
        }
        return result.toString();
    }
}
