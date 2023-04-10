package inhabitants-of-foon;

/**
 * The Warlord class extends the Orc class and contains the same methods it
 * does. The warlord class also has two super constructors and one field
 * constructor.
 * 
 * @author Syed Fardeen
 *
 */
public class Warlord extends Orc {

	/**
	 * infantries is an array of maximum 5 infantry soldiers
	 */
	private Infantry[] infantries = new Infantry[5];

	/**
	 * leadershipRating is initially set to 0
	 */
	private int leadershipRating = 0;

	/**
	 * Field Constructor
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 * @param infantries
	 */
	public Warlord(String clanAffiliation, int ferocity, int defense, int magic, Infantry[] infantries) {
		super(clanAffiliation, ferocity, defense, magic);
		this.infantries = infantries;
	}

	/**
	 * Super constructor from Monster class
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 */
	public Warlord(String clanAffiliation, int ferocity, int defense, int magic) {
		super(clanAffiliation, ferocity, defense, magic);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This constructor only sets the clanAffliation
	 * 
	 * @param clanAffiliation
	 */
	public Warlord(String clanAffiliation) {
		super(clanAffiliation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * The method retrieves the leadershipRating after checking how many alive
	 * soldiers are present in the infantries any soldier with zero health is
	 * removed from the infantries array
	 *
	 * @return int
	 */
	public int getLeadershipRating() {
		for (Infantry soldier : infantries) {
			if (soldier != null) {
				if (soldier.getHealth() == 0) {
					removeInfantry(soldier);
				}
			}
		}
		return leadershipRating;
	}

	/**
	 * This method sets the leadershipRating
	 * 
	 * @param leadershipRating
	 */
	public void setLeadershipRating(int leadershipRating) {
		this.leadershipRating = leadershipRating;
	}

	/**
	 * This method retrieves infantries field
	 * 
	 * @return
	 */
	public Infantry[] getInfantries() {
		return infantries;
	}

	/**
	 * This method sets the infantries field
	 * 
	 * @param infantries
	 */
	public void setInfantries(Infantry[] infantries) {
		this.infantries = infantries;
	}

	/**
	 * This method initiates the battle cry. It called the healtBoost method in the
	 * Infantry class and increases the health of infantry soldier by the leadership
	 * score of the warlord * 5.
	 * 
	 * If infantry soldier is dead, this method returns cannot be revived message.
	 */
	public void soundBattleCry() {
		// TODO Auto-generated method stub
		if (getHealth() > 0) {
			int boost = leadershipRating * 5;
			System.out.println("\n" + getClanAffiliation()
					+ " sounds their battle cry, boosting the health of their Infantry by " + boost);
			for (Infantry soldier : infantries) {
				if (soldier != null) {
					soldier.healthBoost();
				}
			}
		} else {
			System.out.println(getClanAffiliation() + " cannot sound their battle cry - they are dead.");
		}

	}

	/**
	 * This method adds infantry soldier to the infantries field. It will not add a
	 * dead soldier and will not add past 5 soldiers. The method also increases
	 * leadershipRating by 1 with every soldier added to the infantries.
	 * 
	 * @param infantry
	 */
	public void addInfantry(Infantry infantry) {
		boolean added = false;
		boolean dead = false;
		for (int i = 0; i < infantries.length; i++) {
			if (infantries[i] == null) {
				if (infantry.getHealth() > 0) {
					infantries[i] = infantry;
					infantry.setCommanderWarlord(this);
					infantry.setClanAffiliation(this.clanAffiliation);
					added = true;
					break;
				} else {
					dead = true;
				}
			}
		}
		if (!dead && !added) {
			System.out.println("This Warlord already has 5 soldiers in their Infantry.");
		} else if (dead) {
			System.out.println("Dead soldiers cannot be added to Infantry.");
		} else {
			System.out.println("Warlord added solder to Infantry.");
			leadershipRating++;
		}
	}

	/**
	 * This method removes infantry soldiers from the infantries array. This method
	 * is also called in the getInfantries method to remove dead infantry soldiers.
	 * The method also decreases leadershipRating by 1 with every soldier removed
	 * from the infantries.
	 * 
	 * @param infantry
	 */
	public void removeInfantry(Infantry infantry) {
		for (int i = 0; i < infantries.length; i++) {
			if (infantries[i] == infantry) {
				infantries[i] = null;
				infantry.setCommanderWarlord(null);
				break;
			}
		}
		leadershipRating--;
		System.out.println("Warlord removed soldier from Infantry.");
	}

	/**
	 * The attack method is overridden for Warlord class. It first checks the health
	 * of the attacking Warlord, then it calculates the battle score. It then checks
	 * if the opponents battle score is greater than the attacking Warlord's and
	 * subtracts the heath of the one with lesser score.
	 * 
	 * If the Warlord is dead, it cannot attack.
	 * 
	 * The Warlord attack is 1.5 times stronger than other the regular attacks.
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
		return "Warlord [leadershipRating=" + this.leadershipRating + ", clanAffiliation=" + this.clanAffiliation
				+ ", ferocity=" + this.ferocity + ", defense=" + this.defense + ", magic=" + this.magic + ", treasure="
				+ this.treasure + ", health=" + this.health + "]";
	}

}
