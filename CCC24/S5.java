import java.io.IOException;
import java.util.Scanner;

public class S5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws IOException{

        int n = sc.nextInt();
        int[][] bar = new int[2][2];

        for(int i = 0; i < n; i++){
            bar[i][0] = sc.nextInt();
            bar[i][1] = sc.nextInt();
        }

        System.out.println(findParts(bar));

    }

    public static double avg3(int a, int b, int c){
        if((a+b+c)%3 != 0){
            return (double)(a+b+c)/3;
        }else{
            return (double)(a+b+c)/3;
        }
    }

    public static double avg2(int a, int b){
        if((a+b)%2 != 0){
            return (double)(a+b)/2;
        }else{
            return (double)(a+b)/2;
        }
    }

    public static int findParts(int[][] arr){
        if(arr[0][0] == arr[0][1] && arr[1][0] == arr[1][1] && arr[0][0] == arr[1][1]){
            return 4;
        }else if(arr[0][0] == arr[0][1] && arr[0][0] == avg2(arr[1][0], arr[1][1])){
            return 3;
        }else if(arr[0][0] == arr[1][0] && arr[0][0] == avg2(arr[0][1], arr[1][1])){
            return 3;
        }else if(arr[1][1] == arr[1][0] && arr[1][0] == avg2(arr[0][0], arr[0][1])){
            return 3;
        }else if(arr[0][1] == arr[1][1] && arr[0][1] == avg2(arr[1][0], arr[0][0])){
            return 3;
        }else if(arr[0][0] == avg3(arr[0][1], arr[1][0], arr[1][1]) || arr[0][1] == avg3(arr[0][0], arr[1][0], arr[1][1]) || arr[1][0] == avg3(arr[0][1], arr[0][0], arr[1][1]) || arr[1][1] == avg3(arr[0][1], arr[1][0], arr[0][0])){
            return 2;
        }else if(avg2(arr[0][0], arr[1][0]) == avg2(arr[1][1], arr[0][1])){
            return 2;
        }else if(avg2(arr[0][0], arr[0][1]) == avg2(arr[1][1], arr[1][0])){
            return 2;
        }else{
            return 1;
        }
    }
}
