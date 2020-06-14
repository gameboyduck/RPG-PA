package campodebatalha;

public abstract class Terreno {

	private String terreno;
	

	public Terreno(String terreno) {
		super();
		this.terreno = terreno;
	}
	public String getTerreno() {
		return terreno;
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public abstract String exibirInfo();


}
