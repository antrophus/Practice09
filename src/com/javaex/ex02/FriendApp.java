package com.javaex.ex02;
/*
 java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에
 저장하세요.
 친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요. 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해 주세요");
		for (int i = 0; i < 3; i++) {
			String fr = sc.nextLine();
			String[] fArray = fr.split(" ");
			fList.add(new Friend(fArray[0], fArray[1], fArray[2]));

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(fList.get(i).toString());
		}

		sc.close();

	}

}
