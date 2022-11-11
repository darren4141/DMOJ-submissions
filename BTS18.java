import java.io.*;
import java.util.StringTokenizer;

public class BTS18{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[]args) throws IOException{
        String mess = readLine();
        mess = mess.replace(" ", "");
        
        String [] charpsa = new String[mess.length()];
        charpsa[0] = String.valueOf(mess.charAt(0));

        for(int i = 1; i < mess.length(); i++){
            charpsa[i] = charpsa[i-1] + mess.charAt(i);
        }

        int queries = readInt();

        for(int i = 0; i < queries; i++){
            int min = readInt();
            int max = readInt();
            String target = readLine();

            String bound = charpsa[i].substring(min-1);
            String clipped = bound.replace(target, "");

            System.out.println(clipped.length()-bound.length());

        }

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
 
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
 
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
 
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
 
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
 
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}