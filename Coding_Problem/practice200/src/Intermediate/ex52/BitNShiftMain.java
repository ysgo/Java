package Intermediate.ex52;
//문자열 자르기를 이용하여 2진수 문자열로 바꾸기
public class BitNShiftMain {
	public static int BITMASK = 1;
	
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for(int i=0; i<=31; i++) {
			s = (a & BITMASK) + s;
			a>>=1;
		}
		return s.substring(s.indexOf('1'));
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}

}
