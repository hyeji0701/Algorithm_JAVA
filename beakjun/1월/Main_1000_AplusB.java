
package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1000_AplusB {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
	
		double result = A/B;
		System.out.println(result);
	}
}
