package com.pluralsight;

public class Format {

    public static void main(String[] args) {



        System.out.println(formatName("Anthony", "Nguyen"));

        String formatted = formatName ("Anthony", "Nguyen");
        System.out.println(formatted);

}

    public static String formatName(String first, String last) {
    return last + ", " + first;


}




}


