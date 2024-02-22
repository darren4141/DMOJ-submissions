import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        String inputA = br.readLine();
        String inputB = br.readLine();

        String[] sa = inputA.split(" ");
        String[] sb = inputB.split(" ");

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sa[i]);
            b[i] = Integer.parseInt(sb[i]);
        }

        if(a[0] == b[0] && a[0] == b[1]){
            System.out.println("YES");
            System.out.println("1");
            System.out.println("R 0 1");
        }else if(a[1] == b[0] && a[1] == b[1]){
            System.out.println("YES");
            System.out.println("1");
            System.out.println("L 0 1");
        }else if(a[1] == b[1] && a[0] == b[0]){
            System.out.println("YES");
            System.out.println("0");
        }else{
            System.out.print("NO");
        }


    }
}
