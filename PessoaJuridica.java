public class PessoaJuridica extends Cliente{
	
	private String cnpj;
	private int funcionarios;
	private int nvisitas;
	private float valImovel;
	
	
	public float getValImovel() {
		return valImovel;
	}
	public void setValImovel(float valImovel) {
		this.valImovel = valImovel;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getNvisitas() {
		return nvisitas;
	}
	public void setNvisitas(int nvisitas) {
		this.nvisitas = nvisitas;
	}
	

}
