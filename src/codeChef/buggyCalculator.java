package codeChef;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

class buggyCalculator {
	public static void main (String args []){
		int a = 2500 ;
		int b = 5000;
		int length_b = (int)(Math.log10(b)+1);
		int length_a = (int)(Math.log10(a)+1);
		int length = length_b ;

		if (length_a > length_b){
			length = length_a ;
		}
		int ans [] = new int [length];
		int shiftedA = a ;
		int shiftedB = b ;

		byte arr [] = toBytes(shiftedB , length_b) ;
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

	}

	static byte[] toBytes(int val, int bufferSize)
	{
		byte[] result = new byte[bufferSize];
		for(int i = bufferSize - 1; i >= 0; i--) {
			result[i] = (byte) (val /*>> 0*/);
			val = (val >> 8);
		}
		return result;
	}

	public byte[] intToBytes( int i ) {
		ByteBuffer bb = ByteBuffer.allocate(8); 
		bb.putInt(i); 
		return bb.array();
	}

	public static int module (int a){
		int c = 0 ;
		c = a % 10 ;
		return c ;
	}

	//	public static void display(int a){
	//		int numLen = a.length();
	//		for (int i = 0 ; i < numLen ; i++){
	//			int op = (int) (a[i]);
	//			System.out.println(op);
	//		}
	//	}

	public static int getSum(int p, int q)
	{
		int result = p ^ q; // + without carry 0+0=0, 0+1=1+0=1, 1+1=0
		int carry = (p & q) << 1; // 1+1=2
		if (carry != 0) {
			return getSum(result, carry);
		}
		return result;
	}

	public static byte[] bigIntToByteArray( final int i ) {
		BigInteger bigInt = BigInteger.valueOf(i);      
		return bigInt.toByteArray();
	}

	public static byte[] toBytes(int i)
	{
		byte[] result = new byte[4];
		result[0] = (byte) (i >> 24);
		result[1] = (byte) (i >> 16);
		result[2] = (byte) (i >> 8);
		result[3] = (byte) (i /*>> 0*/);

		return result;
	}

}
