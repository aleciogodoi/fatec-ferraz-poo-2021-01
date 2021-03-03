import javax.swing.JOptionPane;

public class Circulo {
	// Atributos
	float x;
	float y; 
	float raio;
	// Construtores
	Circulo(){
		x = 10;
		y = 20;
		raio = 10;
	}
	Circulo(float x1, float y1, float r){
		this.x = x1;
		this.y = y1;
		this.raio = r;
	}
	Circulo(float x, float y, String m){
		this.x = x;
		this.y = y;
		JOptionPane.showMessageDialog(null, m);
	}
	// Metodos
	public void move(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public void raio(float r) {
		this.raio = r;
	}
	public void imprime() {
		System.out.println("Círculo ("+this+") [ x: "+x+", y: "+y+
				", Raio: "+raio+", Área: "+String.format("%.2f",calcularArea())+" ]");
	}
	public float calcularArea() {
		return (float)(Math.PI * Math.pow(raio, 2) );
	}
}
