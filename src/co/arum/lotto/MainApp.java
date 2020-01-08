package co.arum.lotto;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("금액 입력 : ");
			int money = sc.nextInt();
			
			Lotto game = new Lotto();
			game.randomSelect(money);
		}
	}

}
