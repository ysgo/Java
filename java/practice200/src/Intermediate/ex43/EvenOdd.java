package Intermediate.ex43;
//while을 이용하여 1이 될 때까지 나누고 곱하기
public class EvenOdd {
	public static void showOddnEvenw(int n) {
		int temp = n;
		while(temp != 1) {
			if(temp % 2 == 1) {
				temp = temp * 3 + 1;
			} else {
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n---------------------------------------");
	}
	
	public static void main(String[] args) {
		showOddnEvenw(122);
	}

}
