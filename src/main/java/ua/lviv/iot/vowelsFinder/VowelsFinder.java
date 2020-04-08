package ua.lviv.iot.vowelsFinder;

public class VowelsFinder {

    public static String checkTextForVowels(String pattern, String text) {
        return "number of vowels: " + text.replaceAll(pattern, "").length();
    }      
}
