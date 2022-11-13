import java.io.*;
import java.util.StringTokenizer;

//make a PSA of the letters in the phrase
//sum the number of the given char in the PSA at index max
//subtract the number of the given char in the PSA at index min

public class BTS18{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[]args) throws IOException{
        String mess = readLine();
        
        String [] charpsa = new String[mess.length()];
        charpsa[0] = String.valueOf(mess.charAt(0));

        for(int i = 1; i < mess.length(); i++){
            charpsa[i] = charpsa[i-1] + mess.charAt(i);
        }

        int queries = readInt();

        for(int i = 0; i < queries; i++){
        	int count = 0;
            int min = readInt();
            int max = readInt();
            char target = readCharacter();
            
            //System.out.println(charpsa[max-1]);
            //System.out.println(charpsa[min-2]);
            
            String clipped = charpsa[max-1];
            
            if(min != 1) {
            	clipped = clipped.replace(charpsa[min-2], "");
            }
        	
            String removed = clipped.replace(Character.toString(target), "");
            
            System.out.println(clipped.length() - removed.length());
            
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