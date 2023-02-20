import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q3 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args)throws IOException{
        int n = readInt();
        int m = readInt();
        ArrayList<Integer>nums = new ArrayList<Integer>();
        Set<Integer>finalNums = new HashSet<Integer>();

        int temp = 0;
        int fib1 = 1;
        int fib2 = 2;
        nums.add(fib1);
        nums.add(fib2);

        while(temp < n){
            nums.add(fib1 + fib2);
            int oldfib1 = fib1;
            fib1 = fib2;
            fib2 = oldfib1 + fib2;
            temp = fib1 + fib2;
        }

        fib1 = 1;
        fib2 = 2;
        while(fib1 + fib2 < n){
            nums.add(n-(fib1 + fib2));
            int oldfib1 = fib1;
            fib1 = fib2;
            fib2 = oldfib1 + fib2;
        }

        finalNums.addAll(nums);

        System.out.println((finalNums.size() > m) ? m : finalNums.size());

        if(finalNums.size() > m){
            int count = 0;
            for(int v : finalNums){
                System.out.print(v + " ");
                count++;
                if(count == m){
                    break;
                }
            }
        }else{
            for(int v : finalNums){
                System.out.print(v + " ");
            }
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
