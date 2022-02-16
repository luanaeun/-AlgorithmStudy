// BOJ_1011 Fly me to the Alpha Centauri

package Math;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1011 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			int count = 0;
			int idong = 0;
			int result = start;
			
			while(count < end-result) {
				count += 1;
				
				// 이동거리가 유지되는 조건
				if(idong + 1 + result <= start + end/2) {
					idong += 1;
				} 
				
				result += idong;
			}
			
			if (count < end-result) {
				bw.write((count + (idong-1)) + "\n");

			} else {	//count = end-result
				bw.write((count + idong) + "\n");
			}

		}
		bw.flush();
		bw.close();
		
	}

}
