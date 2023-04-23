
import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String txt = br.readLine();
		
		int count = 0;
		
		for (int i=0; i<txt.length(); i++) {
			int value = (int)(txt.charAt(i));
			if(value < 68) count += 3;
			else if(value < 71) count += 4;
			else if(value < 74) count += 5;
			else if(value < 77) count += 6;
			else if(value < 80) count += 7;
			else if(value < 84) count += 8;
			else if(value < 87) count += 9;
			else count += 10;
			}

		System.out.println(count);	
		}
		}
			