package AppDespesas;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Controle {

	static int dia;
	static int mes;
	static int ano;
	static String itemDespesa;
	static double valor;
	
	public static void main(String[] args) {
		LocalDate dtAtual = LocalDate.now(); // Data Atual
		
		String cpf = JOptionPane.showInputDialog("CPF: ");
		DespesaPessoal despesaPessoal = new DespesaPessoal(cpf);
		carga(despesaPessoal);
		
		int opcao = 0;
		String menu = "1 - Lan�amento de despesa\n"
					+ "2 - Total geral de depesas\n"
					+ "3 - Total de despesas m�s/ano\n"
					+ "4 - Total de despesas dia/m�s/ano\n"
					+ "5 - Imprimir todas as despesas\n"
					+ "6 - Imprimir despesas de um m�s/ano\n"
					+ "7 - Imprimir despesas de m dia/m�s/ano\n"
					+ "8 - Sair";
		do {
			// Atualiza data
			dia = dtAtual.getDayOfMonth();
			mes = dtAtual.getMonthValue();
			ano = dtAtual.getYear();
			opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				entradaDespesa();
				despesaPessoal.despesas.add(
							new Despesa(
									LocalDate.of(ano, mes, dia),
									itemDespesa,
									valor
							)
				);
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Total Geral das despesas: "+despesaPessoal.getTotal());
				break;
			case 3: 
				entradaMes();
				entradaAno();
				JOptionPane.showMessageDialog(null,
						"Total Geral das despesas "+mes+"/"+ano+": "+despesaPessoal.getTotal(ano, mes));
				break;
			case 4:
				entradaDia();
				entradaMes();
				entradaAno();
				JOptionPane.showMessageDialog(null,
						"Total Geral das despesas "+dia+"/"+mes+"/"+ano+": "+
								despesaPessoal.getTotal(LocalDate.of(ano, mes, dia)));
				break;
			case 5:
				despesaPessoal.imprime();
				break;
			case 6:
				entradaMes();
				entradaAno();
				despesaPessoal.imprime(ano, mes);
				break;
			case 7:
				entradaDia();
				entradaMes();
				entradaAno();
				despesaPessoal.imprime(LocalDate.of(ano, mes, dia));
				break;
			}


		} while (opcao !=8);
		

	}
	
	public static void entradaDespesa(){
		itemDespesa = JOptionPane.showInputDialog("Despesa:");
		valor = Double.valueOf(JOptionPane.showInputDialog("Valor Despesa:"));
		entradaDia();
		entradaMes();
		entradaAno();
	}
	
	public static void entradaDia(){
		dia = Integer.valueOf(JOptionPane.showInputDialog("Dia:", dia));
	}
	
	public static void entradaMes(){
		mes = Integer.valueOf(JOptionPane.showInputDialog("M�s:", mes));
	}
	
	public static void entradaAno(){
		ano = Integer.valueOf(JOptionPane.showInputDialog("Ano:", ano));
	}
	
	public static void carga(DespesaPessoal dp) {
		dp.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Mercado",10.89));
		dp.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Farmarcia",22.77));
		dp.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Feira",15.50));
		dp.despesas.add(new Despesa(LocalDate.of(2020,1,2),"Gas",30.55));
		dp.despesas.add(new Despesa(LocalDate.of(2020,1,4),"Luz",80.33));
		dp.despesas.add(new Despesa(LocalDate.of(2020,1,5),"Internet",74.12));
		dp.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Mercado",100.22));
		dp.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Farmarcia",42.21));
		dp.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Feira",30.15));
		dp.despesas.add(new Despesa(LocalDate.of(2020,2,2),"Gas",20.17));
		dp.despesas.add(new Despesa(LocalDate.of(2020,2,4),"Luz",67.31));
		dp.despesas.add(new Despesa(LocalDate.of(2020,2,5),"Internet",55.43));

		dp.despesas.add(new Despesa(LocalDate.of(2021,1,1),"Mercado",10.89));
		dp.despesas.add(new Despesa(LocalDate.of(2021,1,1),"Farmarcia",22.77));
		dp.despesas.add(new Despesa(LocalDate.of(2021,1,1),"Feira",15.50));
		dp.despesas.add(new Despesa(LocalDate.of(2021,1,2),"Gas",30.55));
		dp.despesas.add(new Despesa(LocalDate.of(2021,1,4),"Luz",80.33));
		dp.despesas.add(new Despesa(LocalDate.of(2021,1,5),"Internet",74.12));
		dp.despesas.add(new Despesa(LocalDate.of(2021,2,1),"Mercado",100.22));
		dp.despesas.add(new Despesa(LocalDate.of(2021,2,1),"Farmarcia",42.21));
		dp.despesas.add(new Despesa(LocalDate.of(2021,2,1),"Feira",30.15));
		dp.despesas.add(new Despesa(LocalDate.of(2021,2,2),"Gas",20.17));
		dp.despesas.add(new Despesa(LocalDate.of(2021,2,4),"Luz",67.31));
		dp.despesas.add(new Despesa(LocalDate.of(2021,2,5),"Internet",55.43));
		
		dp.despesas.add(new Despesa(LocalDate.of(2021,3,1),"Mercado",100.89));
		dp.despesas.add(new Despesa(LocalDate.of(2021,3,1),"Farmarcia",32.77));
		dp.despesas.add(new Despesa(LocalDate.of(2021,3,1),"Feira",25.50));
		dp.despesas.add(new Despesa(LocalDate.of(2021,3,2),"Gas",70.55));
		dp.despesas.add(new Despesa(LocalDate.of(2021,4,4),"Luz",65.33));
		dp.despesas.add(new Despesa(LocalDate.of(2021,4,5),"Internet",80.12));
		dp.despesas.add(new Despesa(LocalDate.of(2021,4,1),"Mercado",125.22));
		dp.despesas.add(new Despesa(LocalDate.of(2021,4,1),"Farmarcia",52.21));
		dp.despesas.add(new Despesa(LocalDate.of(2021,5,1),"Feira",21.15));
		dp.despesas.add(new Despesa(LocalDate.of(2021,5,2),"Gas",75.17));
		dp.despesas.add(new Despesa(LocalDate.of(2021,5,4),"Luz",92.31));
		dp.despesas.add(new Despesa(LocalDate.of(2021,5,5),"Internet",45.43));
	}

}
