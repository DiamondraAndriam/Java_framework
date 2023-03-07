package etu1748.framework.util;

public class Util {
    public static String getBaseURL(String url) {
        System.out.println(url + "\n");
        String[] baseURL = url.split("/", 5);
        return baseURL[4];
    }
}
