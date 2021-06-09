
public class TipoDespesa {
	// Atributos
	private int idTipo;
	private String descrTipo;
	
	// Construtores
	public TipoDespesa() {
	}
	
	public TipoDespesa(String descrTipo) {
		this.descrTipo = descrTipo;
	}
	
	public TipoDespesa(int idTipo, String descrTipo) {
		this.idTipo = idTipo;
		this.descrTipo = descrTipo;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getDescrTipo() {
		return descrTipo;
	}

	public void setDescrTipo(String descrTipo) {
		this.descrTipo = descrTipo;
	}

	@Override
	public String toString() {
		return "TipoDespesa [idTipo=" + idTipo + ", descrTipo=" + descrTipo + "]";
	}
	
}
