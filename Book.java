package com.book;

import com.publisher.Publisher;

public class Book {
	private String title;
	private String author;
	private double price;
	private Publisher publisher;
	private Book (String title,String author, double price, Publisher publisher ) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
	}
	public String getBookTitle() {
		return title;
	}
	public void setBookTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price>=50 && price <1000 ) {
			this.price=price;
		}
		else 
		this.price = 0;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		if (publisher==null) {
			this.publisher=null;
		}
		else 
		this.publisher = publisher;
	}
	
				@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", book=" + publisher + "]";
	}
				public static Book getBookObject(String title, String author,double price, Publisher publisher) {
					if (title==null || author == null||price==0) {
						return null;
					}
					else 
		return new Book(title, author, price,publisher);
	}

}
