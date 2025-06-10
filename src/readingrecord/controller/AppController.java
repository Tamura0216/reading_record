package readingrecord.controller;

import java.util.Scanner;

import readingrecord.service.BookManager;

public class AppController {
	public void runApp() {
		BookManager bookManager = new BookManager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("■読書記録アプリ■");
			System.out.println("行いたい操作の数字を入力してください");
			System.out.println("1：本の登録");
			System.out.println("2：登録済みの本の情報を一覧表示");
			System.out.println("3：登録済みの本のページを表示");
			System.out.println("4：アプリの終了");

			int input_num = Integer.parseInt(scanner.nextLine());

			switch (input_num) {
			case 1:
				bookManager.registerBook();
				break;
			case 2:
				bookManager.viewBooks();
				break;
			case 3:
				bookManager.totalPage();
				break;
			case 4:
				System.out.println("アプリを終了します");
				return;
			default:
				System.out.println("不正な数字が入力されました");
				break;
			}
		}
	}
}
