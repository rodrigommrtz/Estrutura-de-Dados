package main;
import javax.swing.JOptionPane;
import controller.AlunoControle;


public class Principal {	

	public static void main(String[] args) {

		AlunoControle aluno = new AlunoControle();
		int posicao; 
		
		int id;
		int semestre;
		String curso;
		String nome;
		String area;
		String periodo;
		int opc=0;


		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("                           MENU\n\n"
					+ "1 - Adicionar no Início \n2 - Adicionar no Final"
					+"\n3 - Adicionar na Posição (X) \n4 - Remover no Início \n5 - Remover no Final \n6 - Remover na Posição (X)"
					+"\n7 - Listar Aluna(os) \n\n9 - Sair\n\n"));
			
			switch (opc) {


			case 1:
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA da(o) Aluna(o)"));
				curso = JOptionPane.showInputDialog("Digite o nome do Curso");
				area = JOptionPane.showInputDialog("Digite a área do Curso");
				semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres"));
				nome = JOptionPane.showInputDialog("Digite o Nome da(o) Aluna(o)");
				periodo = JOptionPane.showInputDialog("Digite o perído da(o) Aluna(o)");
				aluno.addInicio(id, curso, area, semestre, nome, periodo);
				System.out.println("Dados inseridos no Início");
				break;

			
			case 2:
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA da(o) Aluna(o)"));
				curso = JOptionPane.showInputDialog("Digite o nome do Curso");
				area = JOptionPane.showInputDialog("Digite a área do Curso");
				semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres"));				nome = JOptionPane.showInputDialog("Digite o Nome da(o) Aluna(o)");
				periodo = JOptionPane.showInputDialog("Digite o perído da(o) Aluna(o)");				
				aluno.addFinal(id, curso, area, semestre, nome, periodo);
				System.out.println("Dados inseridos no Final");
				break;
				
				
			case 3:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA da(o) Aluna(o)"));
				curso = JOptionPane.showInputDialog("Digite o nome do Curso");
				area = JOptionPane.showInputDialog("Digite a área do Curso");
				semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres"));				nome = JOptionPane.showInputDialog("Digite o Nome da(o) Aluna(o)");
				periodo = JOptionPane.showInputDialog("Digite o perído da(o) Aluna(o)");
				aluno.addMeio(posicao, id, curso, area, semestre, nome, periodo);
				break;

			case 4:
				aluno.removeInicio();
				System.out.println("Removido no Inicio");
				break;

			case 5:
				aluno.removeFinal();
				System.out.println("Removido no Final");
				break;
				
			case 6:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				aluno.removeMeio(posicao);
				break;
				
			case 7:
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

