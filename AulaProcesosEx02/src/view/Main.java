package view;

import javax.swing.JOptionPane;

import controller.TaskController;


public class Main {
	public static void main(String[] args) {
		TaskController TaController = new TaskController();
		
		String os = TaskController.os();
		
		int opc = 0;
		while (opc!=9){
			opc=Integer.parseInt(JOptionPane.showInputDialog("insira comando\n 1-task list\n 2-taskkill por id\n 3-taskkill por nome\n 9-finalizar\\n "));
			switch (opc) {
			
			case 1:
				String process = os;
				TaController.readProcess(process);
				break;
			case 2:
				int id =Integer.parseInt(JOptionPane.showInputDialog("insira id do processo a ser finalizado"));
				TaController.killProcessid(id);
				break;
			case 3:
				String Nome =(JOptionPane.showInputDialog("insira id do processo a ser finalizado"));
				TaController.killProcessNM(Nome);
				break;
			default: System.out.println("opc invalida");
				break;
			case 9:System.out.println("operação finalizada");
				break;
			}
	
		}
	}
}
