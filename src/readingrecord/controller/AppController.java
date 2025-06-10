package readingrecord.controller;

import java.util.Scanner;

import readingrecord.service.BookManager;

public class AppController {
	public void runApp() {
		Scanner scanner = new Scanner(System.in);
		BookManager bookManager = new BookManager();

		System.out.println("■読書記録アプリ■");
		System.out.println("行いたい操作の数字を入力してください");
		System.out.println("1：本の登録");
		System.out.println("2：登録済みの本の情報を一覧表示");
		System.out.println("3：登録済みの本のページを表示");
		System.out.println("4：アプリの終了");

		int input_num = scanner.nextInt();

		switch (input_num) {
		case 1:
			System.out.println("登録したい本のタイトルを入力してください");
			String bookTitle = scanner.nextLine();
			System.out.println("登録したい本の著者を入力してください");
			String author = scanner.nextLine();
			System.out.println("登録したい本の著者を入力してください");
			int page = scanner.nextInt();
			bookManager.registerBook(bookTitle, author, page);
			System.out.println("登録完了しました");
			runApp();
			break;
		case 2:
			bookManager.viewBooks();
			runApp();
			break;
		case 3:
			bookManager.totalPage();
			runApp();
			break;
		case 4:
			System.out.println("アプリを終了します");
			break;
		}
	}
}
