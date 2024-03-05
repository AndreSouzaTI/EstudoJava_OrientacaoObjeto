package OO;

public class ServidorPublico {
	/**** Construtores ****/
	public ServidorPublico(){
		
	}
	
	
	
	public ServidorPublico(int matricula, String nome, String cargo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		
	}
	
	



	public ServidorPublico(String nome, String foto, String orgao, String vinculo, String cargo, String lotacao,
			String exercicio, String email, String telefone, String celular, String cpf, String naturalidade,
			int matricula, int idade, int tempoContribuicao, double salario) {
		super();
		this.nome = nome;
		this.foto = foto;
		this.orgao = orgao;
		this.vinculo = vinculo;
		this.cargo = cargo;
		this.lotacao = lotacao;
		this.exercicio = exercicio;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.cpf = cpf;
		this.naturalidade = naturalidade;
		this.matricula = matricula;
		this.idade = idade;
		this.tempoContribuicao = tempoContribuicao;
		this.salario = salario;
	}





	/**** Atributos *****/
	
	private final int VALOR_HORA_EXTRA = 40;
	private static int totalServidores;
	private Avaliacao avaliacao;
	
	private String nome;
	private String foto;
	private String orgao;
	private String vinculo;
	private String cargo;
	private String lotacao;
	private String exercicio;
	private String email;
	private String telefone;
	private String celular;
	private String cpf;
	private String naturalidade;
	private int matricula;
	private int idade;
	private int tempoContribuicao;
	private double salario;
	
	
	/**** Métodos Get/Set *****/
	
	public static int getTotalServidores() {
		return totalServidores;
	}
	
	
	
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}



	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLotacao() {
		return lotacao;
	}

	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTempoContribuicao() {
		return tempoContribuicao;
	}

	public void setTempoContribuicao(int tempoContribuicao) {
		this.tempoContribuicao = tempoContribuicao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public final double calcularSalarioHorasExtras(int... horasTrabalhadas) {
		double salarioMensal = 0;
		
		for (int horasExtras : horasTrabalhadas) 
			salarioMensal = salarioMensal + horasExtras*VALOR_HORA_EXTRA;
			return (salario+salarioMensal);		
	}
	
	public void mostrarTamanhoNome() {
		System.out.println(this.nome.length());
	}
	
	public void mostrarPrimeiroNome() {
		System.out.println(this.nome.substring(0, nome.indexOf(" ")));
	}
	
	public void mostrarSobreNome() {
		System.out.println(this.nome.substring(nome.indexOf(" ")+1));
	}


	public static void main(String[] args) {

		ServidorPublico andre = new ServidorPublico(1, "André Souza", "Auditor TI");
		totalServidores++;
		andre.setSalario(15000);
		System.out.println(andre.calcularSalarioHorasExtras(8,10,0,15));
		
		ServidorPublico luana = new ServidorPublico(2, "Luana Souza", "Coordenadora");
		totalServidores++;
		luana.setSalario(7500);
		
		ServidorPublico henry = new ServidorPublico(3, "Henry Souza", "Analista");
		totalServidores++;
		henry.setSalario(4500);
		
		ServidorPublico victoria = new ServidorPublico(4, "Victoria Souza", "Analista");
		totalServidores++;
		victoria.setSalario(4500);
		System.out.println(totalServidores);
		
		andre.mostrarTamanhoNome();
		andre.mostrarPrimeiroNome();
		andre.mostrarSobreNome();
		andre.setAvaliacao(Avaliacao.EXCELENTE);
		
	}

}
