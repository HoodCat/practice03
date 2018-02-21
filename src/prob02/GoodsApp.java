package prob02;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		for(int i=0; i<COUNT_GOODS; i++) {
			String[] goodsInfo = scanner.nextLine().split(" ");
			goods[i] = new Goods(goodsInfo[0], goodsInfo[1], goodsInfo[2]);
		}
		
		for(int i=0; i<COUNT_GOODS; i++) {
			goods[i].showInfo();
		}

		scanner.close();
	}
}
