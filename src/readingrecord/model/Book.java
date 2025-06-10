package readingrecord.model;

public class Book {
	private String bookTitle;
	private String author;
	private int page;
	
	public Book(String bookTitle, String author, int page) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.page = page;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
}
