package yokohama.unit.example;

public class StringUtils {
    public static String toSnakeCase(final String s) {
        if (s == null) throw new NullPointerException("null is not allowed");

        final StringBuffer sb = new StringBuffer();

        for (char ch : s.toCharArray()) {
            if (sb.length() == 0) {
                sb.append(Character.toLowerCase(ch));
                continue;
            }

            if (Character.isUpperCase(ch)) {
                sb.append('_');
            }
            sb.append(Character.toLowerCase(ch));
        }

        return sb.toString();
    }
}
