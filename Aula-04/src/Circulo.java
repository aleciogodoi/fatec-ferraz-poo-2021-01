public class Circulo {
	// Atributos
	float x;
	float y; 
	float raio;
	
	// Metodos
	public void move(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public void raio(float r) {
		this.raio = r;
	}
	public void imprime() {
		System.out.println("Círculo[ x: "+x+", y: "+y+
				", Raio: "+raio+", Área: "+calcularArea()+" ]");
	}
	public float calcularArea() {
		return (float)(Math.PI * Math.pow(raio, 2) );
	}
	
}
