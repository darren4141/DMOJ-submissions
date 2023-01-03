import java.io.*;
import java.util.ArrayList;
public class CCC00S2 {

	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		ArrayList<Integer> stream = new ArrayList <Integer>();
		
		for(int i = 0; i < size; i++) stream.add(Integer.parseInt(br.readLine()));
		
		while(true) {
			int cmd = Integer.parseInt(br.readLine());
			
			if(cmd == 77) {
				break;
			}else if(cmd == 88) {
				int loc = Integer.parseInt(br.readLine());
				loc--;
				stream.set(loc, stream.get(loc) + stream.get(loc+1));
				stream.remove(loc+1);
				
			}else if(cmd == 99) {
				int loc = Integer.parseInt(br.readLine());
				loc--;
				int per = Integer.parseInt(br.readLine());
				
				stream.add(stream.get(stream.size()-1));
				
				for(int i = stream.size()-1; i > loc; i--) {
					stream.set(i, stream.get(i-1));
				}
				
				stream.set(loc+1, (int)Math.round((double)(stream.get(loc)*(100-per))/100));
				stream.set(loc, (int)Math.round((double)(stream.get(loc)*per)/100));

			}
			
		}
		
		for(int i = 0; i < stream.size(); i++) {
			System.out.print(stream.get(i) + " ");
		}
		
	}
	
}
