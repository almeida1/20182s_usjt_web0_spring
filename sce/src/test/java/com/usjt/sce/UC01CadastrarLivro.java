package com.usjt.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usjt.sce.model.Livro;

public class UC01CadastrarLivro {
/**
 * Objetivo - verificar o comportamento do sistema no cadastro de livro com dados validos
 */
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
/**
 * Objetivo - verificar o comportamento do sistema no cadastro de livro com isbn branco
 */
	@Test
	public void CT02CadastrarLivroComISBNBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	@Test
	public void CT03CadastrarLivroComISBNNulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	@Test
	public void CT04CadastrarLivroComDadosValidos() {
		
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("1111");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
			// verificacao
			assertEquals("1111",umLivro.getIsbn());
		
	}
	@Test
	public void CT05CadastrarLivroComDadosValidos() {
		
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
			// verificacao
			assertEquals("Engenharia de Software",umLivro.getTitulo());
		
	}
	@Test
	public void CT06CadastrarLivroComTituloBranco() {
		
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comTituloBranco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
		
	}
	@Test
	public void CT07CadastrarLivroComTituloNulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comTituloNulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
		
	}
	@Test
	public void CT08CadastrarLivroComTituloNulo() {
		// cenario
		Livro umLivro = new Livro();
		// acao
		umLivro = ObtemLivro.comDadosValidos();
		// verificacao
		assertEquals("Pressman",umLivro.getAutor());
		
	}
	@Test
	public void CT09CadastrarLivroComAutorBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comAutorBranco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
		
	}
	@Test
	public void CT10CadastrarLivroComAutorNulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comAutorNulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
		
	}
}
