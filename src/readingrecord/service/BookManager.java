package readingrecord.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import readingrecord.model.Book;

public class BookManager {
	private List<Book> bookList = new ArrayList<>();
	
	public void registerBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("登録したい本のタイトルを入力してください");
		String bookTitle = scanner.next();
		System.out.println("登録したい本の著者を入力してください");
		String author = scanner.next();
		System.out.println("登録したい本のページ数を入力してください");
		int page = Integer.parseInt(scanner.next());
		Book book = new Book(bookTitle, author, page);
		bookList.add(book);
		System.out.println("登録完了しました");
		System.out.println();
		System.out.println();
	}
	
	public void viewBooks(){
		int i = 1;
		System.out.println("--登録されている本の一覧--");
		for(Book book : bookList) {
			System.out.println(i);
			System.out.println("タイトル：" + book.getBookTitle());
			System.out.println("著者：" + book.getAuthor());
			System.out.println("ページ数：" + book.getPage());
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
	}
	
	public void totalPage() {
		int total = 0;
		for(Book book : bookList) {
			total += book.getPage();
		}
		System.out.println("登録されている本の合計ページ数は" + total + "です");
		System.out.println();
		System.out.println();
	}
}
