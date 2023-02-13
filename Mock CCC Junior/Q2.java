import java.io.*;
import java.util.StringTokenizer;


public class Q2 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args) throws IOException{
        int s = readInt();
        int w = readInt();

        boolean healthy = true;

        if(!(s>=20 && s<=23)){
            healthy = false;
        }

        if(!(w>=6 && w<=9)){
            healthy = false;
        }

        int hours = (24 - s) + w;

        if(!(hours >= 8 && hours <= 10)){
            healthy = false;
        }

        System.out.println((healthy)? "Healthy" : "Unhealthy");
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }

        return st.nextToken();
    }

    static int readInt() throws IOException{
        return Integer.parseInt(next());
    }
}
