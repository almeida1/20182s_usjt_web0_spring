<<<<<<< HEAD
package com.usjt.sce;

import com.usjt.sce.model.Livro;

public class ObtemLivro {
	public static Livro comDadosValidos() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comISBNInvalido_branco() {
		Livro livro = new Livro();
		livro.setIsbn("");

		livro.setTitulo("Engenharia de Software");

		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comISBNInvalido_nulo() {
		Livro livro = new Livro();
		livro.setIsbn(null);

		livro.setTitulo("Engenharia de Software");

		livro.setAutor("Pressman");
		return livro;
	}
=======
package com.usjt.sce;

import com.usjt.sce.model.Livro;

public class ObtemLivro {
	public static Livro comDadosValidos() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comISBNInvalido_branco() {
		Livro livro = new Livro();
		livro.setIsbn("");

		livro.setTitulo("Engenharia de Software");

		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comISBNInvalido_nulo() {
		Livro livro = new Livro();
		livro.setIsbn(null);

		livro.setTitulo("Engenharia de Software");

		livro.setAutor("Pressman");
		return livro;
	}
	public static Livro comTituloBranco() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("");
		livro.setAutor("Pressman");
		return livro;
	}
	public static Livro comTituloNulo() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo(null);
		livro.setAutor("Pressman");
		return livro;
	}
	public static Livro comAutorBranco() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("");
		return livro;
	}
	public static Livro comAutorNulo() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor(null);
		return livro;
	}
>>>>>>> branch 'master' of https://github.com/almeida1/20182s_usjt_web0_spring
}