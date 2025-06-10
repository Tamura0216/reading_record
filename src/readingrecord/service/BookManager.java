package readingrecord.service;

import java.util.ArrayList;
import java.util.List;

import readingrecord.model.Book;

public class BookManager {
	private List<Book> bookList = new ArrayList<>();
	
	public void registerBook(String bookTitle, String author, int page) {
		Book book = new Book(bookTitle, author, page);
		bookList.add(book);
	}
	
	public void viewBooks(){
		int i = 0;
		for(Book book : bookList) {
			System.out.println("--登録されている本の一覧--");
			System.out.println(i);
			System.out.println("タイトル：" + book.getBookTitle());
			System.out.println("著者：" + book.getAuthor());
			System.out.println("ページ数：" + book.getPage());
			i++;
		}
	}
	
	public void totalPage() {
		int total = 0;
		for(Book book : bookList) {
			total += book.getPage();
		}
		System.out.println("登録されている本の合計ページ数は" + total + "です");
	}
}
