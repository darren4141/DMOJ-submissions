import java.io.*;
import java.util.StringTokenizer;

public class Q1 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[]args) throws IOException{
        int n = readInt();
        boolean good = false;

        for(int i = 0; i < n; i++){
            String a = next();
            int s1 = readInt();
            int s2 = readInt();

            if(s2 > s1){
                if(s1 >= 2400){
                    good = true;
                }
            }

        }

        System.out.println((good)? "YES" : "NO");

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
