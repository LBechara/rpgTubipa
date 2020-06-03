package rpgTubipa;

public class Boneco {
	
	private int level = 0;
	private int vida = 100;
	private int mana = 50;
	private String apelido;
	private int pontosDeXp = 0; 
	private static int totalBonecos;
	
	public int getLevel() {
		return this.level;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int vida) {
		this.vida += vida;
	}
	
	public int getMana() {
		return this.mana;
	}
	
	public void setMana(int mana) {
		this.mana = mana;
	}
		
	public String getApelido() {
		return this.apelido;
	}
	
	public long getExp() {
		return this.pontosDeXp;
	}
	
	public void setExp(long exp) {
		this.pontosDeXp += exp;
	}
	
	public static int getTotalBonecos() {
		return Boneco.totalBonecos;
	}
	
	public Boneco(String apelido) {
		this.apelido = apelido;
		
		System.out.println("Agora " + this.getApelido() + " é seu boneco");
		Boneco.totalBonecos++;
	}
		
	public int calculaExp() {
		
		if(this.pontosDeXp > 100 && this.pontosDeXp < 500) {
			this.level = 1;
		}
		else if(this.pontosDeXp >= 500 && this.pontosDeXp < 1499) {
			this.level = 2;
		}
		else if(this.pontosDeXp >= 1500) {
			this.level = 3;
		}
		return this.level;
	}
	
	public void imprimeLevel() {
		
		System.out.println("Parabéns, você acaba de subir para o level " + this.getLevel());
	}
	
	public void acresceVidaEMana(int vida, int mana) {
		this.vida += vida;
		this.mana += mana;
	}
	
	public void atacarBoneco() {
		
	}
	
	public void ganhaExp(int exp, int vida, int mana) {
		int levelAnterior = this.getLevel();
		
		this.setExp(exp);
		System.out.println(this.getApelido() + " ganhou " + exp + " pontos de experiência");
		this.calculaExp();
		if(this.getLevel() > levelAnterior) {
			int multiplicador = this.getLevel() - levelAnterior;
			this.imprimeLevel();
			this.acresceVidaEMana((multiplicador * vida), (multiplicador * mana));
		}
	}
}