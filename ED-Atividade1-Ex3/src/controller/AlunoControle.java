package controller;

public class AlunoControle {

	public AlunoGS inicio;
	public AlunoGS fim;
	int contador;

	public AlunoControle (){
		this.contador = 0;
		this.inicio = null;
		this.fim = null;
	}


	public void addInicio(int ra, String nome, String turma, String semestre) {
		if(this.contador == 0){ // Se a lista estiver vazia
			AlunoGS aluno = new AlunoGS();
			aluno.setRa(ra);
			aluno.setNome(nome);
			aluno.setTurma(turma);
			aluno.setSemestre(semestre);
			aluno.setApontador(inicio);
			this.inicio = aluno;
			this.contador++;	 
						
		} else { // Caso ja exista algum elemento na primeira posicao
			AlunoGS aluno = new AlunoGS();
			aluno.setRa(ra);
			aluno.setNome(nome);
			aluno.setTurma(turma);
			aluno.setSemestre(semestre);
			aluno.setApontador(inicio);
			inicio = aluno;
			this.contador++;	
		}		
	}

	
/* TESTE DE MESA PARA A FUNCAO DE ADICIONAR NO INICIO
 * =====================================================
 *  
 * Inicio com a lista zerada
 * Massa de dados: 1, Jose, Noite, 3o 
 * 
 * Saida 
 * Aluno: Jose, 		RA: 1, 		Turma: Noite; 		Semestre: 3o
 * 
 * _____________________________________________________
 * 	
 * Com items ja incluidos na lista
 * Massa de dados: 2, Antonio, Noite, 4o  
 * 
 * Saída:
 * Aluno: Antonio,		RA: 2,		Turma: Noite, 		Semestre: 4o
 * Aluno: Jose, 		RA: 1, 		Turma: Noite; 		Semestre: 3o
 *
 * =====================================================
 */
		
	
	public void addFinal(int ra, String nome, String turma, String semestre) {
		AlunoGS aluno = new AlunoGS();
		aluno.setRa(ra);
		aluno.setNome(nome);
		aluno.setTurma(turma);
		aluno.setSemestre(semestre);
		aluno.setApontador(inicio);

		if(this.contador == 0) {
			aluno.setApontador(fim);
			this.inicio = aluno;
			this.fim = aluno;
		} else {
			fim.setApontador(aluno); // talvez dando merda aqui
			fim = inicio;
		}
		this.contador++;
	}

	
/* TESTE DE MESA PARA A FUNCAO DE ADICIONAR NO FINAL
 * =====================================================
 *  
 * Final com a lista zerada 
 * Massa de dados: 1, Jose, Noite, 3o
 * 
 * Saida na tela
 * Aluno: Jose, 		RA: 1, 		Turma: Noite; 		Semestre: 3o
 * 
 * _____________________________________________________
 * 	
 * Com items ja incluidos na lista
 * Massa de dados: 2, Antonio, Noite, 4o  
 * 
 * Saída na tela
 * Aluno: Jose, 		RA: 1,		 Turma: Noite;		Semestre: 3o
 * Aluno: Antonio, 		RA: 2,		 Turma: Noite, 		Semestre: 4o
 *
 * =====================================================
 */
	
	
	public void addMeio(int posicao, int ra, String nome, String turma, String semestre) {
		AlunoGS aluno = new AlunoGS();
		aluno.setRa(ra);
		aluno.setNome(nome);
		aluno.setTurma(turma);
		aluno.setSemestre(semestre);
		AlunoGS busca = this.inicio;

			if (posicao < 0 || posicao >= contador) { 
				System.out.println("Posicao indicada nao eh no meio");
			}else {
				for (int i = 0; i<posicao-1; i++) {
					busca = busca.getApontador();
				}
				aluno.setApontador(busca);
				busca.setApontador(aluno);
				busca = aluno;
				this.contador++;
			}		
	}

/* TESTE DE MESA PARA A FUNCAO DE ADICIONAR NO MEIO (POSICAO INDICADA)
* =====================================================
*  
* Meio com a lista zerada 
* Posicao: 3
* Massa de dados: 1, Jose, Noite, 3o
* 
* Saida na tela
* "Posicao indicada nao eh no meio"
* 
* _____________________________________________________
* 	
* Com items ja incluidos na lista
* Massa de dados: 2, Antonio, Noite, 4o  
* Massa de Dados: 1, Antonio, Noie, 3o
* Massa de Dados: 3, Luiz, Manha, 2o
* posicao 2
* Massa de Dados: 4, Andre, Manha, 3o
* 
* 
* Saída na tela
* Aluno: Jose, 		RA: 1, 		Turma: Noite, 		Semestre: 3o
* Aluno: Andre, 	RA: 4, 		Turma: Manha, 		Semestre: 3o
* Aluno: Antonio, 	RA: 2, 		Turma: Noite, 		Semestre: 4o
* Aluno: Luiz, 		RA: 3, 		Turma: Manhã,		Semestre: 2o
*
* =====================================================
*/
		
	
	public void removeInicio() {
		if (this.contador == 0) {
			System.out.println("Nao ha elementos para serem removidos");
		} else {
			AlunoGS lista = inicio;
			inicio = inicio.getApontador();
			lista.setApontador(null);
			this.contador--;
		}
	}

	

/* TESTE DE MESA PARA A FUNCAO DE REMOVER NO INICIO
* =====================================================
*  
* Meio com a lista zerada 
* 
* Saida na tela
* "Posicao indicada nao eh no meio"
* 
* _____________________________________________________
* 	
* Com items ja incluidos na lista
* Massa de dados: 2, Antonio, Noite, 4o  
* Massa de Dados: 1, Antonio, Noie, 3o
* Massa de Dados: 3, Luiz, Manha, 2o
* Massa de Dados: 4, Andre, Manha, 3o
* 
* 
* Saída na tela
* 
* Aluno: Andre, 	RA: 4, 		Turma: Manha, 		Semestre: 3o
* Aluno: Antonio, 	RA: 2, 		Turma: Noite, 		Semestre: 4o
* Aluno: Luiz, 		RA: 3, 		Turma: Manhã,		Semestre: 2o
*
* =====================================================
*/
	
	
	public void removeFinal() {
		if(this.contador ==0) {
			System.out.println("nao ha alunos");
		} else {
			AlunoGS lista = inicio;
			while (lista.getApontador() != null) {
				lista = lista.getApontador();
			}
			lista.setApontador(null);
			this.contador--;
		}
	}

/* TESTE DE MESA PARA A FUNCAO DE REMOVER NO FINAL
* =====================================================
*  
* Meio com a lista zerada 
* 
* Saida na tela
* "Posicao indicada nao eh no meio"
* 
* _____________________________________________________
* 	
* Com items ja incluidos na lista
* Massa de dados: 2, Antonio, Noite, 4o  
* Massa de Dados: 1, Antonio, Noie, 3o
* Massa de Dados: 3, Luiz, Manha, 2o
* Massa de Dados: 4, Andre, Manha, 3o
* 
* 
* Saída na tela
* Aluno: Jose, 		RA: 1, 		Turma: Noite, 		Semestre: 3o
* Aluno: Andre, 	RA: 4, 		Turma: Manha, 		Semestre: 3o
* Aluno: Antonio, 	RA: 2, 		Turma: Noite, 		Semestre: 4o
* Aluno: Luiz, 		RA: 3, 		Turma: Manhã,		Semestre: 2o
*
* =====================================================
*/
	
	
	
	public void removeMeio(int posicao) {
		if (this.contador == 0){
			System.out.println("nao ha alunos");
		} else {
			AlunoGS aluno = inicio;
			for (int i =0; i<posicao; i++){
				aluno = aluno.getApontador();
				aluno.setApontador(null);
				this.contador--;
			}
		}
	}
	
		
	
	
	
/* TESTE DE MESA PARA A FUNCAO DE REMOVER MEIO (POSICAO INDICADA)
* =====================================================
*  
* Meio com a lista zerada 
* 
* Saida na tela
* "nao ha alunos"
* 
* _____________________________________________________
* 	
* Com items ja incluidos na lista
* posicao: 3
* Massa de dados: 2, Antonio, Noite, 4o  
* Massa de Dados: 1, Antonio, Noie, 3o
* Massa de Dados: 3, Luiz, Manha, 2o
* Massa de Dados: 4, Andre, Manha, 3o
* 
* 
* Saída na tela
* Aluno: Jose, 		RA: 1, 		Turma: Noite, 		Semestre: 3o
* Aluno: Andre, 	RA: 4, 		Turma: Manha, 		Semestre: 3o
* 
* Aluno: Luiz, 		RA: 3, 		Turma: Manhã,		Semestre: 2o
*
* =====================================================
*/
			

	public void listar() {
		if(this.contador == 0) {
			System.out.println("Não há elementos na lista");
		} else {
			AlunoGS lista = this.inicio;
			for (int i=0; i<=this.contador-1; i++) {
				System.out.println("Aluno: " +lista.getNome() + ", RA: " + lista.getRa()+ 
						" , Turma: "+ lista.getTurma() + " , Semestre: "+lista.getSemestre());
				lista = lista.getApontador();
			}
		}
	}
}

/* TESTE DE MESA PARA A FUNCAO LISTAR
* =====================================================
*  
* Meio com a lista zerada 
* 
* Saida na tela
* Não há elementos na lista
* 
* _____________________________________________________
* 	
* Com items ja incluidos na lista
* 
* Saída na tela
* Aluno: Jose, 		RA: 1, 		Turma: Noite, 		Semestre: 3o
* Aluno: Andre, 	RA: 4, 		Turma: Manha, 		Semestre: 3o
* Aluno: Antonio, 	RA: 2, 		Turma: Noite, 		Semestre: 4o
* Aluno: Luiz, 		RA: 3, 		Turma: Manhã,		Semestre: 2o
*
* =====================================================
*/
	