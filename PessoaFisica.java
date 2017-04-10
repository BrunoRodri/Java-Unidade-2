public class PessoaFisica extends Cliente{

	private String cpf;
	private int valImovel;
	private String zona;
	private String tipo;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getValImovel() {
		return valImovel;
	}
	public void setValImovel(int valImovel) {
		this.valImovel = valImovel;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
