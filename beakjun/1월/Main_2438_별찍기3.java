package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main_2438_º°Âï±â3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int j = 0;

		for (int i = 0; i < N; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
