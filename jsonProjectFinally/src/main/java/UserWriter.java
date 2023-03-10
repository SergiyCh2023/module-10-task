import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class UserWriter {
    StringBuilder sb = new StringBuilder();
    public User[] someMethod ( ) {

        try (FileReader reader = new FileReader("src\\main\\resources\\file.txt")) {

            int c;
            while ((c=reader.read()) !=-1) {
                sb.append((char) c );
            }


        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex2) {
            System.out.println("file not found");
        }
        return methodWriter();
    }



    private User [] methodWriter( ) {

        User [] users = new User[2];

        String [] arrrayString = sb.toString().split("\\s");


        String b1 = ""; String b2 = "";
        int counter =0;
        for (String a : arrrayString) {

            if (!a.equals("name") && !a.equals("age")) {
                if (a.matches("\\D+")) b1 = a;
                else if (a.matches("\\d+")) b2 = a;
            }
            if (!b1.equals("") && !b2.equals(""))  {
                users [counter++] = new User(b1, Integer.parseInt(b2));
                b1 = ""; b2 = "";
            }
        }
        return users;
    }
}
