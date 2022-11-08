package Utils;

public class StringUtils {

    public static String formatString(String text, Object... arguments) {
        return String.format(text, arguments);
    }

    public static String formatByLocator(String byLocator) {
        return byLocator.substring(byLocator.indexOf(" ") + 1);
    }
}