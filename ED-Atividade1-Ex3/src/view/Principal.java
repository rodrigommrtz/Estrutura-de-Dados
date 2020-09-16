package view;
import javax.swing.JOptionPane;

import controller.AlunoControle;

public class Principal {

	public static void main(String[] args) {

		AlunoControle aluno = new AlunoControle();
		int posicao; //para inclusao ou exclusao do meio
		int ra; 
		String nome;
		String turma;
		String semestre;
		int opc=0;


		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("                           MENU\n\n"
					+ "1 - Adicionar no Final \n2 - Adicionar no Inicio"
					+"\n3 - Adicionar no Meio \n4 - Remover no Final \n5 - Remover no Inicio \n6 - Remover no Meio"
					+"\n7 - Listar Aluna(os) \n\n9 - Sair\n\n"));
			
			switch (opc) {
			
			case 1:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA da(o) Aluna(o)"));
				nome = JOptionPane.showInputDialog("Digite o Nome da(o) Aluna(o)");
				turma = JOptionPane.showInputDialog("Digite a Turma da(o) Aluna(o)");
				semestre = JOptionPane.showInputDialog("Digite o Semestre da(o) Aluna(o)");
				aluno.addFinal(ra, nome, turma, semestre);
				System.out.println("Dado inserido no final da lista");
				break;

			case 2:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA da(o) Aluna(o)"));
				nome = JOptionPane.showInputDialog("Digite o Nome da(o) Aluna(o)");
				turma = JOptionPane.showInputDialog("Digite a Turma da(o) Aluna(o)");
				semestre = JOptionPane.showInputDialog("Digite o Semestre da(o) Aluna(o)");
				aluno.addInicio(ra, nome, turma, semestre);
				System.out.println("Dado inserido no inicio da lista");
				break;

			case 3:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a POSICAO"));
				ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA da(o) Aluna(o)"));
				nome = JOptionPane.showInputDialog("Digite o Nome da(o) Aluna(o)");
				turma = JOptionPane.showInputDialog("Digite a Turma da(o) Aluna(o)");
				semestre = JOptionPane.showInputDialog("Digite o Semestre da(o) Aluna(o)");
				aluno.addMeio(posicao, ra, nome, turma, semestre);
				System.out.println("Dado inserido na posicao "+ posicao +" da lista");
				break;

			case 4:
				aluno.removeFinal();
				System.out.println("comando executado");
				break;

			case 5:
				aluno.removeInicio();
				System.out.println("comando executado");
				break;

			case 6:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao"));
				aluno.removeMeio(posicao);
				break;
				
			case 7:
				aluno.listar();
				break;

			case 9:
				System.out.println("Encerrado o programa");
				break;
				
			default:
				System.out.println("Opcao incorreta");
				
			}
		}
	}
}










