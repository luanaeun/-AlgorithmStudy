// BOJ_1712 손익분기점

package Math;

import java.io.*;
import java.util.*;

public class BOJ_1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String arr[] = s.split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		
		if (c-b <= 0) {
			bw.write(String.valueOf(-1));
		} else {
			int result = (a / (c - b)) + 1;
			bw.write(String.valueOf(result));
		}
		
		bw.flush();
		bw.close();
		
	}

}
