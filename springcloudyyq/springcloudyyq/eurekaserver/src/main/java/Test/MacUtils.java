package Test;

/**
 * Created by liuyang on 2020/2/4.
 */
import java.io.InputStreamReader;
import java.io.LineNumberReader;


public class MacUtils {

    public static void  getMac(){
        try {

            Process process = Runtime.getRuntime().exec("ipconfig /all");

            InputStreamReader ir = new InputStreamReader(process.getInputStream());

            LineNumberReader input = new LineNumberReader(ir);

            String line;

            while ((line = input.readLine()) != null)


                if (line.indexOf("Physical Address") > 0) {

                    String MACAddr = line.substring(line.indexOf("-") - 2);

                    System.out.println("MAC address = [" + MACAddr + "]");

                }

        } catch (java.io.IOException e) {

            System.err.println("IOException " + e.getMessage());

        }
    }
}