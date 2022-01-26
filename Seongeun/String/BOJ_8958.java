// BOJ_8958 OX퀴즈

import java.util.*;
import java.io.*;

public class BOJ_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(bf.readLine());
        
        for(int j=0; j<n; j++) {
        	String b = bf.readLine();
            
            int arr[] = new int[b.length()];
            int count = 0;
            
            for(int i=0; i<b.length(); i++) {
            	if(b.charAt(i) == 'O') {
            		count += 1;
            		arr[i] = count;
            	} else {
            		arr[i] = 0;
            		count = 0;
            	}
            }
            
            int result = Arrays.stream(arr).sum();
            System.out.println(result);
        	
        }
        
        bw.flush();
        bw.close();
	}

}
