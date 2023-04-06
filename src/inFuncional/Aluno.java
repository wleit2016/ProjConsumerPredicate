package inFuncional;

public class Aluno {
	
	String nome;
	double notas;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, double notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}
	
	public String toString() {
		return "O aluno: " + nome + " tem nota: " + notas;
	}
}