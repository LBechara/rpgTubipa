package rpgTubipa;

public class TestJogo {

	public static void main(String[] args) {
		
		Monge banana = new Monge("banana");
		Espadachim tremax = new Espadachim("tremax");
		System.out.println("------------BANANA------------");
		System.out.println("level: " + banana.getLevel());
		System.out.println("experiênca: " + banana.getExp());
		System.out.println("vida: " + banana.getVida());
		System.out.println("mana: " + banana.getMana());
		System.out.println("------------TREMAX------------");
		System.out.println("level: " + tremax.getLevel());
		System.out.println("experiênca: " + tremax.getExp());
		System.out.println("vida: " + tremax.getVida());
		System.out.println("mana: " + tremax.getMana());
		
		System.out.println();
		
		banana.ganhaExp(499);
		tremax.ganhaExp(501);
		
		System.out.println();
		
		System.out.println("------------BANANA------------");
		System.out.println("level: " + banana.getLevel());
		System.out.println("experiênca: " + banana.getExp());
		System.out.println("vida: " + banana.getVida());
		System.out.println("mana: " + banana.getMana());
		System.out.println("------------TREMAX------------");
		System.out.println("level: " + tremax.getLevel());
		System.out.println("experiênca: " + tremax.getExp());
		System.out.println("vida: " + tremax.getVida());
		System.out.println("mana: " + tremax.getMana());
		System.out.println("total jogadores: " + Boneco.getTotalBonecos());
		System.out.println("total magos: " + Monge.getTotalMonges());
	}
}
