package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 [문제] com.javaex.ex03 패키지
java.util.Scanner 클래스를 이용하여 상품을 입력받아 Goods 객체를 생성하고 
이들을 ArrayList 에 저장하세요.
상품입력은 상품명,가격,개수 형태로 콤마(,)로 구분하여 입력합니다.
“q”가 입력되면 입력이 종료되며 등록된 상품 리스트 모두가 출력됩니다.
 */
public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Goods> goods = new ArrayList<Goods>();

		System.out.println("상품을 입력해 주세요(종료 q)");
		while (true) {

			String inPut = sc.nextLine();
			if (inPut.equals("q")) {
				System.out.println("[입력완료]");
				break;

			}

			String[] gArray = inPut.split(",");
			Goods gm = new Goods(gArray[0], Integer.parseInt(gArray[1]), Integer.parseInt(gArray[2]));
			goods.add(gm);

		} // while 종료
		System.out.println(goods.toString());

		sc.close();

	}// 메인 종료

}
