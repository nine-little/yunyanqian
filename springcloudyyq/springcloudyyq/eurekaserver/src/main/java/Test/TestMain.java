package Test;

/**
 * Created by liuyang on 2020/2/4.
 */
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Vector;


public class TestMain {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //
        System.out.println("***MAC地址***");
        MacUtils.getMac();
        //
        String sn = DiskUtils.getSerialNumber("C");
        System.out.println("***硬盘编号***");
        System.out.println(sn);

    }

}
