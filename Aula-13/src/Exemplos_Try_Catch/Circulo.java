package Exemplos_Try_Catch;


import javax.swing.JOptionPane;
public class Circulo {
	  private double raio=0;
	  private String erro = ""; 
	  public double solicitaRaioDoCirculo(){
	    try{
	      raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do círculo: "));
	    }
	    catch(NumberFormatException e){
	      JOptionPane.showMessageDialog(null,"Somente números reais são válidos!");
	      erro = e.getMessage();
	      System.out.println("Erro: " + erro);
	    }
	    finally{
	      if(erro != "")
	        raio = 0.0;
	    }
	    return raio;
	  }
	  public double calculaPerimetroDoCirculo(){
	    double perimetro;
	    perimetro = 2*Math.PI*raio;
	    System.out.println("Perímetro: "+String.valueOf(perimetro));
	    return perimetro;
	  }

	  public double calculaAreaDoCirculo(){
	    double area;
	    area = Math.PI*raio*raio;
	    JOptionPane.showMessageDialog(null,"Área: " + area);
	    return area;
	  }
}
