package testpoo;

import java.util.Scanner;

public class TestPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double div = (double) a / b;
			if (b != 0) {	
				System.out.println(div);
			} else {
				System.out.println("divisao imposivel");
			} 
		}
		
    }
    
}
