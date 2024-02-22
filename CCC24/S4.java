import java.io.IOException;
import java.util.Scanner;

public class S4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws IOException{

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a-b == 1 || b-a == 1){
                if(Math.min(a, b) % 2 == 0){
                    System.out.print("R");
                }else{
                    System.out.print("B");
                }
            }else{
                System.out.print("G");
            }
        }

    }
}
