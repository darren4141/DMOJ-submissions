import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{

        String input = br.readLine();

        String[] inputs = input.split(" ");

        int n = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);

        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = br.readLine();
        }

        for(int i = 0; i < n; i++){
            int[] appeared = new int[26];
            boolean[] isHeavy = new boolean[t];

            for(int j = 0; j < t; j++){
                isHeavy[j] = false;
            }

            for(int j = 0; j < t; j++){
                appeared[words[i].charAt(j)-97]++;
            }

            for(int j = 0; j < t; j++){
                if(appeared[words[i].charAt(j)-97] > 1){
                    isHeavy[j] = true;
                }
            }

            boolean status = isHeavy[0];
            for(int j = 1; j < t; j++){
                if(isHeavy[j] == status){
                    System.out.println("F");
                    break;
                }else if(j == t-1){
                    System.out.println("T");
                }
                status = isHeavy[j];
            }

        }

    }
}
