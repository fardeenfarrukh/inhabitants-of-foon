package inhabitants-of-foon;

/**
 * The Goblin class extends the Monster class method and contains a swornEnemy
 * field. A goblin's swornEnemy can only be another goblin.
 * 
 * @author Syed Fardeen
 *
 */
public class Goblin extends Monster {

	/**
	 * swornEnemy for a Goblin can only be another goblin
	 */
	private Goblin swornEnemy;

	/**
	 * Field constructor
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 * @param swornEnemy
	 */
	public Goblin(String clanAffiliation, int ferocity, int defense, int magic, Goblin swornEnemy) {
		super(clanAffiliation, ferocity, defense, magic);
		this.swornEnemy = swornEnemy;
	}

	/**
	 * Super constructor from Monster class
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 */
	public Goblin(String clanAffiliation, int ferocity, int defense, int magic) {
		super(clanAffiliation, ferocity, defense, magic);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This constructor only sets the clanAffliation
	 * 
	 * @param clanAffiliation
	 */
	public Goblin(String clanAffiliation) {
		super(clanAffiliation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method retrieves swornEnemy field
	 * 
	 * @return Goblin
	 */
	public Goblin getSwornEnemy() {
		return swornEnemy;
	}

	/**
	 * This method sets the swornEnemy field
	 * 
	 * @param swornEnemy
	 */
	public void setSwornEnemy(Goblin swornEnemy) {
		this.swornEnemy = swornEnemy;
	}

	/**
	 * The attack method is overloaded because the name is same as Monster class but
	 * it's modified for Goblin class. It first checks the health of the attacking
	 * Goblin, then it calculates the battle score. It then checks if the opponent
	 * Goblin's battle score is greater than the attacking Goblin's and subtracts
	 * the heath of the one with lesser score.
	 * 
	 * If the Goblin is dead, it cannot attack.
	 * 
	 * Unlike with the other monsters a Goblin can only attack it's sworn enemy.
	 * 
	 * @param opponent
	 */
	public void attack(Goblin opponent) {
		// TODO Auto-generated method stub
		if (getHealth() > 0) {
			double score = getBattleScore();
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
	 * toString method for Goblin class
	 */
	@Override
	public String toString() {
		return "Goblin [swornEnemy=" + this.swornEnemy + ", clanAffiliation=" + this.clanAffiliation + ", ferocity="
				+ this.ferocity + ", defense=" + this.defense + ", magic=" + this.magic + ", treasure=" + this.treasure
				+ ", health=" + this.health + "]";
	}
}
