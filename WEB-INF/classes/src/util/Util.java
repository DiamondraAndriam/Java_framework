package util;

public class Util {
    public static String getBaseURL(String uri) {
        String[] baseURI = uri.split("/", 3);
        return baseURI[2];
    }
}
