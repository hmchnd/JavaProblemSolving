package UserInput;

import java.io.*;
import java.util.*;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] s = br.readLine().split(" ");
		//int s= Integer.parseInt(br.readLine());
		
		//System.out.println(s);
		
		for(int i=0;i<s.length;i++)
{
			System.out.println(s[i]);
}

	
	

	}

	
	
}
