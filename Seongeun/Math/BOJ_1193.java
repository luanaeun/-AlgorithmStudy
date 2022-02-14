// BOJ_1193 분수찾기

package Math;

import java.io.*;
import java.util.*;

public class BOJ_1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int total = 0;
		
		while(n > total) {
			count += 1;
			total += count;
		}
		
		int bun1 = total - n + 1;
		int bun2 = n - (total-count);
		
		if (count % 2 == 0) {
			bw.write(bun2 + "/" + bun1);
		} else {
			bw.write(bun1 + "/" + bun2);
		}
		
		bw.flush();
		bw.close();
	}

}
