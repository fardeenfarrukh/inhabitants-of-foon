package inhabitants-of-foon;

/**
 * The Orc class extends the Monster class. The Orc class is also a super class
 * for Infantry and Warlord classes.
 * 
 * @author Syed Fardeen
 */
public class Orc extends Monster {

	/**
	 * Super constructor from Monster class
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 */
	public Orc(String clanAffiliation, int ferocity, int defense, int magic) {
		super(clanAffiliation, ferocity, defense, magic);
	}

	/**
	 * This constructor only sets the clanAffliation
	 * 
	 * @param clanAffiliation
	 */
	public Orc(String clanAffiliation) {
		super(clanAffiliation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * toString method for Orc class
	 */
	@Override
	public String toString() {
		return "Orc [clanAffiliation=" + this.clanAffiliation + ", ferocity=" + this.ferocity + ", defense="
				+ this.defense + ", magic=" + this.magic + ", treasure=" + this.treasure + ", health=" + this.health
				+ "]";
	}

}
