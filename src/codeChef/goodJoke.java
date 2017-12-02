package codeChef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class goodJoke {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int j=0;j<T;j++){
			int N=sc.nextInt();
			for(int i=0;i<N;i++){
				int X=sc.nextInt();
				int Y=sc.nextInt();
			}
			int c=N;
			while(N>0){
				c=c^(N-1);
				N--;
			}
			System.out.println(c);
		}
	}
}
