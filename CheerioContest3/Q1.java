import java.io.*;
import java.util.StringTokenizer;

public class Q1 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args)throws IOException{
        int n = readInt();
        int m = readInt();

        int[][]floor = new int[n+2][m+2];

        for(int i = 1; i <= n; i++){
            String lineT = br.readLine();
            for(int j = 1; j <= m; j++){
                floor[i][j] = lineT.charAt(j-1);
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(floor[i][j] == 'W'){
                    System.out.print("W");
                }else if(floor[i-1][j] == 'W' || floor[i+1][j] == 'W' || floor[i][j-1] == 'W' || floor[i][j+1] == 'W'){
                    System.out.print("C");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{return Integer.parseInt(next());}
}
