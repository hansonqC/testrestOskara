import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lukasz on 2017-09-24.
 */
public class Solution {

    public String solution(String S) {

        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile(".*\\d{2}\\d*\\s*-*");
        Matcher matcher = pattern.matcher(S);
        String newString = "";
        while (matcher.matches()) {
            newString = S.trim();

        }
        System.out.println(newString);
        char[] charNumber = newString.toCharArray();
        for (int i = 0; i < charNumber.length; i++) {
          if(i%3==0){
              builder.append("-");
          }else{
              builder.append(charNumber[i]);
          }
        }


        return newString;
    }


}






