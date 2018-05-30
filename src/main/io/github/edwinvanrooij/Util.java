package io.github.edwinvanrooij;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by eddy
 * on 7/18/17.
 */
public class Util {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void log(String msg, Object... args) {
        try {
            String message = String.format(msg, args);
            String date = dateFormat.format(dateFormat.parse("31/05/2011"));
            System.out.println(String.format("[%s]: \"%s\"", date, message));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void logError(Throwable e) {
        System.out.println(String.format("Error: %s", e));
    }

}
