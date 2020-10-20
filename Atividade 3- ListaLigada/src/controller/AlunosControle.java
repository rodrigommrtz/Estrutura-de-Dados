package controller;

public class AlunosControle {
	
	
	String[] aluno = new String[5];
	int id;
	String nome;
	String area;
	int semestre;
	String curso;
	String periodo;
	int tamanho = 0; // controle do tamanho do array aqui
	String elemento;

	public AlunosControle() {		
	}
		
		
	public AlunosControle(int tamanho, int id, String curso, String nome, String area, int semestre, String periodo) {
			super();
			this.tamanho = tamanho;
			this.id = id;
			this.nome = nome;
			this.area = area;
			this.semestre = semestre;
			this.curso = curso;
			this.periodo = periodo;
	}
			

	public void adicionar() {
		if(cheio()) {
			System.out.println("Lista cheia");
		} else {
			if(vazio()) {
				aluno[0] = aluno[0] ;
				tamanho++;
			} else {
				for(int i=tamanho; i>=1; i-- ) {
					aluno[i] = aluno[i-1];
				}
				aluno[0] = aluno[0];
				tamanho++;
			}
		}
	}
	
	
	public  String excluir() {
		if(vazio()) {
			System.out.println("Lista vazia");
		} else {
			elemento = aluno[0];
			for(int i=0; i<aluno.length; i++) {
				aluno[i]=aluno[i+1];
			}
			tamanho--;
		}
		return elemento;
	}
	
		
	public void listar() {
		if(tamanho == 0) {
			System.out.println("Lista vazia");
		} else {
			for(int i=0; i<tamanho; i++) {
				System.out.println(aluno[i]);;
			}
		}
		
	}
	
	
	public boolean vazio() {
		if (tamanho == 0) {
			System.out.println("Lista Vazia");
		} 
		return true;
	}
	
	
	public boolean cheio() {
		if (tamanho == 5) {
			System.out.println("Lista Cheia");
		}
		return false;
	}
		
	
	public void AdicionaFinal() {
		if(cheio()) {
			System.out.println("Lista cheia");
		} else {
			aluno[tamanho]=curso;
			tamanho++;
		}
	}

	public String ExcluiFinal() {
		if(vazio()) {
			System.out.println("Lista vazia");
		} else {
			elemento = aluno[tamanho-1];
			aluno[tamanho-1] = null;
		}
		return elemento;
	}
	
}





