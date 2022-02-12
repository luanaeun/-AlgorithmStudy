// BOJ_1978 소수찾기

package Math;

import java.io.*;
import java.util.*;

public class BOJ_1978 {
	
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        
//		int n = Integer.parseInt(br.readLine());
//		StringTokenizer arr = new StringTokenizer(br.readLine(), " ");
//		int count = 0;
//		
//		while(arr.hasMoreTokens()) {
//			int i = Integer.parseInt(arr.nextToken());
//			System.out.print(" " + i);
//			if (i == 1) {
//				continue;
//			} else if (i==2 || i==3){
//				System.out.print(" 카운트");
//				count += 1;
//			} else if (i%2 != 0 && i%3 != 0) {
//				System.out.print(" 카운트");
//				count += 1;
//			}
//		}
//		System.out.println();
//		bw.write(String.valueOf(count));   
//		bw.flush();
//		bw.close();
//	}
//}	
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
		int n = Integer.parseInt(br.readLine());
		StringTokenizer arr = new StringTokenizer(br.readLine(), " ");
		int count = 0;
	
		while(arr.hasMoreTokens()) {
			int i = Integer.parseInt(arr.nextToken());
			
			boolean isPrime = true;
			
			if(i == 1) {
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
		
	


