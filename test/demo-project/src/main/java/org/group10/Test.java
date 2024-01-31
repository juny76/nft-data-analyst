package org.group10;

import org.group10.model.post.Tweet;
import org.group10.utils.fileio.FileReadAndWrite;
import org.group10.utils.fileio.impl.CsvFileReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static final String DATE_REGEX = "^(201[89]|202[0-3])-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";

    public static boolean isValidDate(String inputDate) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(inputDate);

        return matcher.matches();
    }
    public static void printSt(Integer a, String... strings){
        System.out.println(a);
        System.out.println(strings[0]);
    }
    public static void main(String[] args){
        System.out.println(isValidDate("2022-02-222"));
    }
}
