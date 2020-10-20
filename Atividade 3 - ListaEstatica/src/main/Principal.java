package main;

import javax.swing.JOptionPane;

import controller.AlunosControle;


public class Principal {

	public static void main(String[] args) {
		
		AlunosControle aluno = new AlunosControle();
		
		int id;
		int semestre;
		String curso;
		String nome;
		String area;
		String periodo;
		
		int opc = 0;				
	
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("                           MENU\n\n"
					+ "1 - Adicionar \n2 - Excluir"
					+"\n3 - Lista Vazia? \n4 - Lista Cheia?"
					+"\n5 - Listar"
					+"\n\n9 - Sair\n\n"));
			
			switch (opc) {


			case 1:
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA da(o) Aluna(o)"));
				curso = JOptionPane.showInputDialog("Digite o nome do Curso");
				area = JOptionPane.showInputDialog("Digite a área do Curso");
				semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres"));
				nome = JOptionPane.showInputDialog("Digite o Nome da(o) Aluna(o)");
				periodo = JOptionPane.showInputDialog("Digite o perído da(o) Aluna(o)");
				aluno.adicionar();				
				System.out.println("Dados inseridos no Início");
				break;
				

			case 2:
				aluno.excluir();
				System.out.println("Removido no Inicio");
				break;
				
				
			case 3:
				aluno.vazio();
				break;
				
			case 4:
				aluno.cheio();
				break;
				
			case 5:
				aluno.listar();
				break;
				
			case 9:
				System.out.println("Encerrando o programa");
				break;
				
			default:
				System.out.println("Opção incorreta");
				
			}
		}
	}
	
		
			
		
}



