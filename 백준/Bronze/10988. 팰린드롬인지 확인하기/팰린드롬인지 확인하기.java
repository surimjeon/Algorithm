import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String txt = br.readLine();
	String text = "";
	for (int i=txt.length()-1; i>=0; i--) {
		text +=txt.charAt(i);
	}
	if (text.equals(txt)) {
		System.out.println(1);
	}
	else {
		System.out.println(0);
	}
	}
}
		