import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lukasz on 2017-09-24.
 */
public class Main {
    public static void main(String[] args) {


    }

    public static String solution(String s) {

        s = s.replaceAll("\\D", "");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 3 == 0) {
                if (i % 3 == 0 && i != 0) {
                    builder.append("-");
                }
            } else {
                if (i % 3 == 0 && i != 0 && s.length() - i >= 4) {  //nie jesteśmy na końcu Stringa
                    builder.append("-");
                } else {
                    if (s.length() - i == 2) {
                        builder.append("-");
                    }

                }
            }

            builder.append(s.charAt(i));
        }
        return builder.toString();

    }

}

