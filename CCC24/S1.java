import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[] hats = new int[n/2];

        for(int i = 0; i < n/2; i++){
            hats[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n/2; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == hats[i]){
                count++;
            }
        }

        System.out.print(count*2);

    }
}
