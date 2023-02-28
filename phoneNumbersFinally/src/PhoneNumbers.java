import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneNumbers {

    public void readFile() {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("src\\test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c );
            }
        } catch (IOException e) {
            System.out.println("What a fuck");
        }
      someMethod(sb);

    }


    private void someMethod (StringBuilder sb) {
        String [] array = sb.toString().split("\n");
        for (String a : array) {
           if (a.matches("\\d+-\\d+-\\d+||\\d+-\\d+-\\d+\\r||\\(\\d+\\) \\d+-\\d+\\r||\\(\\d+\\) \\d+-\\d+")) System.out.println(a);
        }
    }

}
