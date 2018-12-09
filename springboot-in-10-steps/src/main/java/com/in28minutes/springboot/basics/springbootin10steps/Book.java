package com.in28minutes.springboot.basics.springbootin10steps;

public class Book {
	long id;
	String nome;
	String autor;
	
	public Book(long id, String nome, String autor) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", nome=" + nome + ", autor=" + autor + "]";
	}
	
}
