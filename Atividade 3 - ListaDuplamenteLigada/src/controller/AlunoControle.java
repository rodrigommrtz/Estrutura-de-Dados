package controller;

public class AlunoControle {

	public Alunos inicio;
	public Alunos fim;
	int contador;

	public AlunoControle (){
		this.contador = 0;
		this.inicio = null;
		this.fim = null;
	}


	public void addInicio(int id, String curso, String area, int semestre, String nome, String periodo) {
		if(this.contador == 0){
			Alunos aluno = new Alunos();

			aluno.setId(id);
			aluno.setCurso(curso);
			aluno.setArea(area);
			aluno.setSemestre(semestre);
			aluno.setNome(nome);
			aluno.setPeriodo(periodo);
			aluno.setApontador(inicio);
			this.inicio = aluno;
			this.contador++;	 

		} else { 
			Alunos aluno = new Alunos();

			aluno.setId(id);
			aluno.setCurso(curso);
			aluno.setArea(area);
			aluno.setSemestre(semestre);
			aluno.setNome(nome);
			aluno.setPeriodo(periodo);
			aluno.setApontador(inicio);
			inicio = aluno;
			this.contador++;	
		}		
	}


	public void addFinal(int id, String curso, String area, int semestre, String nome, String periodo) {
		Alunos aluno = new Alunos();
		aluno.setId(id);
		aluno.setCurso(curso);
		aluno.setArea(area);
		aluno.setSemestre(semestre);
		aluno.setNome(nome);
		aluno.setPeriodo(periodo);		
		aluno.setApontador(inicio);

		if(this.contador == 0) {
			aluno.setApontador(fim);
			this.inicio = aluno;
			this.fim = aluno;
		} else {
			fim.setApontador(aluno);
			inicio = aluno;
		}
		this.contador++;
	}


	public void addMeio(int posicao, int id, String curso, String area, int semestre, String nome, String periodo) {
		Alunos aluno = new Alunos();
		aluno.setId(id);
		aluno.setCurso(curso);
		aluno.setArea(area);
		aluno.setSemestre(semestre);
		aluno.setNome(nome);
		aluno.setPeriodo(periodo);	
		Alunos busca = this.inicio;

		if (posicao < 0 || posicao >= contador) { 
			System.out.println("Posi��o n�o dispon�vel - DADOS N�O INSERIDOS");
		}else {
			for (int i = 0; i<posicao-1; i++) {
				busca = busca.getApontador();
			}
			aluno.setApontador(busca);
			busca.setApontador(aluno);
			busca = aluno;
			System.out.println("Dado inserido na posicao "+ posicao +" da lista");
			this.contador++;
		}		
	}


	public void removeInicio() {
		if (this.contador == 0) {
			System.out.println("Nao ha elementos para serem removidos");
		} else {
			Alunos lista = inicio;
			inicio = inicio.getApontador();
			lista.setApontador(null);
			this.contador--;

		}
	}


	public void removeFinal() {
		if(this.contador ==0) {
			System.out.println("nao ha alunos");
		} else {
			Alunos lista = inicio;
			while (lista.getApontador() != null) {
				lista = lista.getApontador();
			}
			lista.setApontador(null);
			this.contador--;
		}
	}



	public void removeMeio(int posicao) {
		if (this.contador == 0){
			System.out.println("N�o h� alunos para serem exclu�dos");
		} else {
			Alunos aluno = inicio;
			for (int i =0; i<posicao; i++){
				try {
					aluno = aluno.getApontador();
					aluno.setApontador(null);
					System.out.println("Dado retirado da posicao "+ posicao +" da lista");
					this.contador--;	
				} catch (Exception erro) {
					System.out.println("posi��o n�o dispon�vel");
					{

					}
				}
			}
		}
	}		

	public void listar() {
		if(this.contador == 0) {
			System.out.println("N�o h� elementos na lista");
		} else {
			Alunos lista = this.inicio;
			for (int i=0; i<=this.contador-1; i++) {
				System.out.println("Aluno: " +lista.getNome() + " Id: " +lista.getId() + " Curso: " +lista.getCurso()
				+ " �rea: " +lista.getArea() + " Semestre: " +lista.getSemestre() + " Per�odo: " +lista.getPeriodo());
				lista = lista.getApontador();
			}
		}
	}
}
