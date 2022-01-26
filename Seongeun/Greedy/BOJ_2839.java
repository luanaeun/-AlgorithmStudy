// BOJ_2839 설탕배달

import java.io.*;

public class BOJ_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        
        while(true) {
        	if(n==0) {
        		break;
        	} else if(n % 5 == 0) {
        		count += n/5;
        		n %= 5;
        		break;
        	} else if (n>=3) {
        		n -= 3;
        	} else {
        		count = -1;
        		break;
        	}
        	count += 1;
        	
        }
        System.out.println(count);
                
        bw.flush();
        bw.close();
	}

}