package AppDespesas;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		DespesaPessoal despJoao =  new DespesaPessoal("12345098-09");
		
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Mercado",10.89));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Farmarcia",22.77));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Feira",15.50));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,1,2),"Gas",30.55));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,1,4),"Luz",80.33));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,1,5),"Internet",74.12));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Mercado",100.22));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Farmarcia",42.21));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Feira",30.15));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,2,2),"Gas",20.17));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,2,4),"Luz",67.31));
		despJoao.despesas.add(new Despesa(LocalDate.of(2020,2,5),"Internet",55.43));
		despJoao.imprime();
	}
}
