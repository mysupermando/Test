import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunCommand {
public static void main(String[] args) {
try {
String command = String.join(" ", args);

        Process process = Runtime.getRuntime().exec(command);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        int exitCode = process.waitFor();
        System.out.println("Exited with code: " + exitCode);

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
