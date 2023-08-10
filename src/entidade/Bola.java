package entidade;

public class Bola {
	private String cor;
	private Double circunferencia;
	private String material;
	
	
	public Bola( ) {

	}
	
	public Bola(String cor, Double circunferencia, String material) {
		this.cor = cor;
		this.circunferencia = circunferencia;
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(Double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	/* Para corrigir o método `trocaCor` para que ele realmente mude a cor da bola, 
	 * você deve atualizar o valor do atributo `cor` da classe `Bola` dentro desse 
	 * método. Atualmente, o método `trocaCor` apenas retorna a nova cor, mas não 
	 * faz nenhuma alteração nos atributos da instância da classe `Bola`.
     * Note que removi o tipo de retorno `String` do método, porque você não precisa 
     * retornar a nova cor. Você simplesmente quer atualizar o valor do atributo `cor` 
     * para a nova cor fornecida.
     * Com essa correção, o método `trocaCor` agora atualiza corretamente a cor da 
     * bola quando chamado. Certifique-se de usar a chamada correta ao método dentro 
     * do bloco condicional, conforme mencionado anteriormente:
     * Isso permitirá que a cor da bola seja alterada corretamente quando o usuário 
     * escolher essa opção.
     */
	public void trocaCor(String novaCor ) {
		 cor = novaCor;	
	}
	/*O erro que você está enfrentando ocorre porque o método `mostraCor` está tentando 
	 * retornar o resultado de um método (`trocaCor`) que possui tipo de retorno `void`. 
	 * O tipo `void` indica que o método não retorna nenhum valor.
	 * A função `mostraCor` atualmente não parece estar realizando uma operação significativa, 
	 * pois simplesmente chama o método `trocaCor` e retorna o resultado, que é `void`. 
	 * Parece que você deseja apenas mostrar a cor da bola, e para isso, você pode simplesmente 
	 * retornar o valor do atributo `cor` da classe `Bola`. Não há necessidade de chamar o 
	 * método `trocaCor` aqui.
	 * Agora, o método `mostraCor` retornará o valor da cor da bola. E ao chamá-lo na função 
	 * `toString`, você pode simplesmente usar `mostraCor()`:
	 */
	public String mostraCor( ) {
		return cor;
	}
	
	public Double area(Double circunferencia) {
		return Math.PI * circunferencia * circunferencia;
	}

	@Override
	public String toString() {
		return "Bola [cor: " + mostraCor() + ", circunferencia: " + String.format("%.2f", area(circunferencia)) + ", material: " + material + "]";
	}

}
