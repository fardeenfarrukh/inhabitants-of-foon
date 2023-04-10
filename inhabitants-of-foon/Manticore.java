package Assignment6_000906029;

/**
 * The Manticore class extends the Monster class and contains a modified attack
 * method.
 * 
 * @author Syed Fardeen
 */
public class Manticore extends Monster {

	/**
	 * Super constructor from Monster class
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 */
	public Manticore(String clanAffiliation, int ferocity, int defense, int magic) {
		super(clanAffiliation, ferocity, defense, magic);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This constructor only sets the clanAffliation
	 * 
	 * @param clanAffiliation
	 */
	public Manticore(String clanAffiliation) {
		super(clanAffiliation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * The attack method is overridden for Manticore class. It first checks the
	 * health of the attacking Manticore, then it calculates the battle score. It
	 * then checks if the opponents battle score is greater than the attacking
	 * Manticore's and subtracts the heath of the one with lesser score.
	 * 
	 * If the Manticore is dead, it cannot attack.
	 * 
	 * The Manticore attack is 1.5 times stronger than other the regular attacks.
	 */
	@Override
	public void attack(Monster opponent) {
		// TODO Auto-generated method stub
		if (getHealth() > 0) {
			double score = getBattleScore() * 1.5;
			if (opponent.getBattleScore() > score) {
				subtractHealth(score);
			} else {
				opponent.subtractHealth(score);
			}
		} else {
			System.out.println("dead cannot attack");
		}
	}

	/**
	 * toString method for Manticore class
	 */
	@Override
	public String toString() {
		return "Manticore [clanAffiliation=" + clanAffiliation + ", ferocity=" + ferocity + ", defense=" + defense
				+ ", magic=" + magic + ", treasure=" + treasure + ", health=" + health + "]";
	}

}
