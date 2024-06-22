package i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        double money = 123456666.789;

        Locale vi = new Locale("vi");
        Locale ja = new Locale("ja");

        String s1 = formatNumberByLocate(money,vi);
        System.out.println("s1 = " + s1);
        String s2= formatNumberByLocate(money,ja);
        System.out.println("s2 = " + s2);
    }

    public static String formatNumberByLocate(double number, Locale locale) {
        NumberFormat formatter = NumberFormat.getInstance(locale);
        return formatter.format(number);
    }
}
