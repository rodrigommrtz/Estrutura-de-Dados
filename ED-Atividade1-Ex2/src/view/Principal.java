package view;
import javax.swing.JOptionPane;

import controller.Temperatura;

public class Principal {

	public static void main(String[] args) {

		Temperatura temp = new Temperatura();
		int posicao; 
		double temperatura; 
		int opc=0;


		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n1 - Lista vazia?\n2 - Adicionar_INICIO\n3 - Adicionar_FINAL"
			+ "\n4 - Adicionar_POSICAO \n5 - Remover_INICIO \n6 - Remover_FINAL \n7 - Remover_POSICAO"
			+ "\n8 - Listar \n\n9 - SAIR\n"));

			switch (opc) {

			case 1: // LISTA VAZIA?
				temp.vazia();
				break;

			case 2: // ADICIONA NO INICIO
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite Temperatura"));
				temp.addInicio(temperatura);
				System.out.println("temperatura inserida no inicio da lista");
				break;

			case 3: // ADICIONA NO FINAL
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura"));
				temp.addFinal(temperatura);
				System.out.println("Temperatura inserida no final da lista");
				break;

			case 4: // INSERIR NA POSICAO XX
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a POSICAO"));
				temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite Temperatura"));
				temp.addMeio(temperatura, posicao);
				System.out.println("Temperatura inserida na posicao "+ posicao +" da lista");
				break;

			case 5: // REMOVE NO INICIO
				temp.removeInicio();
				System.out.println("comando executado");
				break;				

			case 6: // REMOVE O FINAL
				temp.removeFinal();
				System.out.println("Temperatura removida da ultima posicao");
				break;

			case 7: //REMOVE NA OPOSICAO INDICADA
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
				temp.removeMeio(posicao);
				break;

			case 8: // LISTAR AS TEMPERATURAS
				temp.listar();
				break;
			
			case 9: //SAIR
				System.out.println("Encerrado o programa");
				break;
				
			default:
				System.out.println("Opcao incorreta");
				
			}
		}
	}
}

