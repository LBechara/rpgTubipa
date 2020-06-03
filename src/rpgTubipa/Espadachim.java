package rpgTubipa;

public class Espadachim extends Boneco {
	
	private static int totalEspadachins;
	private final int bonificacaoVida = 30;
	private final int bonificacaoMana = 15;
	
	public static int getTotalEspadachins() {
		return Espadachim.totalEspadachins;
	}
	
	public Espadachim(String apelido) {
		super(apelido);
		totalEspadachins++;
	}
	
	public void ganhaExp(int exp) {
		super.ganhaExp(exp, 
				this.bonificacaoVida, 
				this.bonificacaoMana);
	}
}