package inFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TesteClasse {
	
	public static void main(String[] args) {
		
		Predicate<Aluno> isAprovado = alu -> {
			return alu.notas >= 7.0;
		};
		
		Consumer<Aluno> exibirAluno = alu -> {
			String resultado = "Reprovado";
			
			if(isAprovado.test(alu)) {
				resultado = "Aprovado";
			}
			
			System.out.println(alu.nome + " esta " + resultado + "!");
		};
		
		Aluno a1 = new Aluno("Aluno Ficticio 1", 6.9);
		Aluno a2 = new Aluno("Aluno Ficticio 2", 8.8);
		Aluno a3 = new Aluno("Aluno Ficticio 3", 5.0);
		Aluno a4 = new Aluno("Aluno Ficticio 4", 3.1);
		Aluno a5 = new Aluno("Aluno Ficticio 5", 9.3);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		alunos.forEach(exibirAluno);
	}
}