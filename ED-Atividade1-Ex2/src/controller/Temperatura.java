package controller;

public class Temperatura {


	public GS inicio;
	public GS fim;
	int contador;

	public Temperatura (){
		this.contador = 0;
		this.inicio = null;
		this.fim = null;
	}


	public boolean vazia() {
		if (contador == 0) {
			System.out.println("Lista esta vazia");
			return true;
		} else {
			System.out.println("Lista nao esta vazia");
			return false;
		}
	}

	
/* TESTE DE MESA PARA FILA VAZIA OU NAO
 * ======================================================
 * 
 * Massa de Dados:
 * 
 * saida:
 * "Lista esta Vazia"
 * 
 * _____________________________________________________
 * 
 * Massa de Dados: 40
 * 
 * saida:
 * "Lista nao esta vazia"
 * 
 * ======================================================
 */
	

	public void addInicio(double temperatura) {
		if(this.contador == 0){ 
			GS temp = new GS();
			temp.setTemperatura(temperatura);				
			this.inicio = temp;
			this.contador++;	 
		} else { 
			try {		
				GS temp = new GS();
				temp.setTemperatura(temperatura);
				temp.setApontador(inicio);
				this.inicio = temp;
				this.contador++;
			} catch (Exception erro){
				System.out.println("Nao foi possivel inserir no inicio");
			}
		}		
	}


	
/* TESTE DE MESA PARA ADICIONAR NO INICIO
 * ======================================================
 * 
 * Massa de Dados: 40
 * 
 * saida:
 * 40
 * 
 * _____________________________________________________
 * 
 * Massa de Dados: +10
 * 
 * saida:
 * 40, 10
 * 
 * ======================================================
 */

	
	
	
	public void addFinal(double temperatura) {
		GS temp = new GS();
		temp.setTemperatura(temperatura);
		temp.setApontador(inicio);

		if(this.contador == 0) {
			temp.setApontador(fim);
			this.inicio = temp;
			this.fim = temp;
		} else {
			try {
				fim.setApontador(temp);
				fim = inicio;
			} catch (Exception erro) {
			}
		}
		this.contador++;
	}

	
/* TESTE DE MESA PARA ADICIONAR NO FINAL
 * ======================================================
 * 
 * Massa de Dados: 40, 10
 * 
 * saida:
 * 40, 10
 * 
 * _____________________________________________________
 * 
 * Massa de Dados: 50
 * 
 * saida:
 * 40, 10, 50
 * 
 * ======================================================
 */
	
	

	public void addMeio(double temperatura, int posicao) {
		GS temp = new GS();
		temp.setTemperatura(temperatura);
		GS busca = this.inicio;

		if (posicao < 0 || posicao >= contador) { 
			System.out.println("Posicao indicada nao eh no meio");
		}else {
			for (int i = 0; i<posicao-1; i++) {
				busca = busca.getApontador();
			}
			temp.setApontador(busca);
			busca.setApontador(temp);
			busca = temp;
			this.contador++;
		}		
	}


/* TESTE DE MESA PARA ADICIONAR NA POSICAO X
 * ======================================================
 * 
 * Massa de Dados: 40, 10, 50, 100
 * 
 * saida:
 * 40, 10, 50, 100
 * 
 * _____________________________________________________
 * 
 * Massa de Dados: 35,8 posicao 2
 * 
 * saida:
 * 40, 35.8, 10, 50, 100 
 * 
 * ======================================================
 */
	
	public void removeInicio() {
		if (this.contador == 0) {
			System.out.println("Nao ha elementos para serem removidos");
		} else {
			GS temp = inicio;
			System.out.println("eliminada a posicao: " + temp.getTemperatura());
			inicio = inicio.getApontador();
			temp.setApontador(null);
			this.contador--;
		}
	}



/* TESTE DE MESA PARA REMOVER NO INICIO
 * ======================================================
 * 
 * Massa de Dados: 40, 10, 50, 100 (adicionado para o teste)
 * 
 * saida:
 * 40, 10, 50, 100
 * 
 * _____________________________________________________
 * 
 * Massa de Dados: 
 * 
 * saida:
 * 10, 50, 100 
 * 
 * ======================================================
 */	
	
	
	
	public void removeFinal() {
		if(this.contador ==0) {
			System.out.println("nao ha temps");
		} else {
			GS temp = inicio;
			System.out.println("eliminada a posicao: " + temp.getTemperatura());
			while (temp.getApontador() != null) {
				temp = temp.getApontador();
			}
			temp.setApontador(null);
			this.contador--;
		}
	}



/* TESTE DE MESA PARA REMOVER NO FINAL
 * ======================================================
 * 
 * Massa de Dados: 40, 10, 50, 100 (adicionado para o teste)
 * 
 * saida:
 * 40, 10, 50, 100
 * 
 * _____________________________________________________
 * 
 * Massa de Dados: 
 * 
 * saida:
 * 40, 10, 50 
 * 
 * ======================================================
 */	
	

	public void removeMeio(int posicao) {
		if (this.contador == 0){
			System.out.println("nao ha temps");
		} else {
			GS temp = inicio;
			System.out.println("eliminada a posicao: " + temp.getTemperatura());
			for (int i =0; i<posicao; i++){
				temp = temp.getApontador();
				temp.setApontador(null);
				this.contador--;
			}
		}
	}


/* TESTE DE MESA PARA REMOVER NO INICIO
 * ======================================================
 * 
 * Massa de Dados: 40, 10, 50, 100 (adicionado parra o teste)
 * 
 * saida:
 * 40, 10, 50, 100
 * 
 * _____________________________________________________
 * 
 * Massa de Dados: posicao 3
 * 
 * saida:
 * 40, 10, 100 
 * 
 * ======================================================
 */	
	
	
	public void listar() {
		if(this.contador == 0) {
			System.out.println("Não há elementos na lista");
		} else {
			GS temp = this.inicio;
			for (int i=0; i<=this.contador-1; i++) {
				try {
				System.out.println("Temperatura: " + temp.getTemperatura());
				temp = temp.getApontador();
				} catch (Exception erro) {
			}
			}
		}
	}
}
