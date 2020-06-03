package rpgTubipa;

public class Monge extends Boneco {

	private static int totalMonges;
	private final int bonificacaoVida = 20;
	private final int bonificacaoMana = 25;
	
	public static int getTotalMonges() {
		return Monge.totalMonges;
	}
	
	public Monge(String apelido) {
		super(apelido);
		totalMonges++;
	}
	
	public void ganhaExp(int exp) {
		super.ganhaExp(exp, 
				this.bonificacaoVida, 
				this.bonificacaoMana);
	}
	
//	public void ganhaExp(long exp) {
//		int levelAnterior = this.getLevel();
//		
//		super.setExp(exp);
//		System.out.println(this.getApelido() + " ganhou " + exp + " pontos de experiência");
//		this.calculaExp();
//		if(this.getLevel() > levelAnterior) {
//			int multiplicador = this.getLevel() - levelAnterior; 
//			this.imprimeLevel();
//			this.acresceVidaEMana((multiplicador * this.bonificacaoVida), (multiplicador * this.bonificacaoMana));
//		}
//	}
}