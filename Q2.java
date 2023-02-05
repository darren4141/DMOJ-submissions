import java.io.*;
import java.util.StringTokenizer;

public class Q2 {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args)throws IOException{
        int n = readInt();
        char[]act = new char[n];

        String game = br.readLine();

        for(int i = 0; i < n; i++){
            act[i] = game.charAt(i);
        }

        int pa = 0, oa = 0;
        int score = 0;

        for(int i = 0; i < n; i++){
            if(act[i] == 'R'){
                oa++;
                if(pa > 0){
                    score++;
                    pa--;
                }else{
                    pa++;
                }
            }else if(act[i] == 'F'){
                if(oa == 0){
                    if(pa > 0){
                        pa--;
                        score++;
                    }else{
                        pa++;
                    }
                }else{
                    oa--;
                }
            }else if(act[i] == 'B'){
                pa++;
            }
        }

        System.out.println(score);

    }

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException{return Integer.parseInt(next());}
}
