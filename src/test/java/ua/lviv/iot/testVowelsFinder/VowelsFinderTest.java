package ua.lviv.iot.testVowelsFinder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.vowelsFinder.VowelsFinder;

@SuppressWarnings("unused")
public class VowelsFinderTest {
    @Test
    public void testFindVowelsInText() {

        String text = "abcdefghijklmnopqrstuvwxyz";
        InputStream inputStream = new ByteArrayInputStream(text.getBytes());
        System.setIn(inputStream);

        Scanner scanner = new Scanner(System.in);
        String textToCheck = scanner.nextLine();
        System.out.println("text to check: " + textToCheck);
        System.out.println(VowelsFinder.checkTextForVowels("[^aeiouyAEIOUY]", text));

        scanner.close();

    }

}
