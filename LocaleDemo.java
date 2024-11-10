import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.*;
public class LocaleDemo {

    static void formatTotal(Locale locale) {
        // NumberFormat nf = NumberFormat.getNumberInstance(locale);
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(2600));
    }

    static void showDate(Locale locale) {
        // Date date = new Date(0);
        Date date = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(dtf.format(date));
    }

    public static void main(String[] args) {
        int tot = 2600; // 2,600.00
        // Locale locale = new Locale();
        Locale locale = new Locale("hi", "");
        // Locale locale = Locale.GERMANY;

        formatTotal(locale);
        showDate(locale);
    }
}








