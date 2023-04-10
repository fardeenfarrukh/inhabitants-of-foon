package Assignment6_000906029;

/**
 * The Monster class is an abstract class with the fields and methods generic to
 * Monster type that can be inherited by other Monster type classes
 * 
 * @author Syed Fardeen
 *
 */
public abstract class Monster {

	/**
	 * clanAffiliation is a String field
	 */
	protected String clanAffiliation;

	/**
	 * numerical value of a monster's ferocity
	 */
	protected int ferocity;

	/**
	 * numerical value of a monster's defense
	 */
	protected int defense;

	/**
	 * numerical value of a monster's magic
	 */
	protected int magic;

	/**
	 * numerical value of a monster's treasure count
	 */
	protected int treasure;

	/**
	 * numerical value of a monster's health
	 */
	protected int health;

	/**
	 * Super Constructor with all fields Health and Treasure are initialized as 100
	 * and 0 respectively
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 */
	public Monster(String clanAffiliation, int ferocity, int defense, int magic) {
		this.clanAffiliation = clanAffiliation;
		this.ferocity = ferocity;
		this.defense = defense;
		this.magic = magic;
		this.treasure = 0;
		this.health = 100;
	}

	/**
	 * This constructor only sets the clanAffliation
	 * 
	 * @param clanAffiliation
	 */
	public Monster(String clanAffiliation) {
		this.clanAffiliation = clanAffiliation;
		this.treasure = 0;
		this.health = 100;
	}

	/**
	 * Retrieves clanAffiliation
	 * 
	 * @return
	 */
	public String getClanAffiliation() {
		return this.clanAffiliation;
	}

	/**
	 * Sets clanAffiliation
	 * 
	 * @param clanAffiliation
	 */
	public void setClanAffiliation(String clanAffiliation) {
		this.clanAffiliation = clanAffiliation;
	}

	/**
	 * Retrieves ferocity
	 * 
	 * @return
	 */
	public int getFerocity() {
		return this.ferocity;
	}

	/**
	 * Sets ferocity
	 * 
	 * @param ferocity
	 */
	public void setFerocity(int ferocity) {
		this.ferocity = ferocity;
	}

	/**
	 * Retrieves defense
	 * 
	 * @return
	 */
	public int getDefense() {
		return this.defense;
	}

	/**
	 * Sets defense
	 * 
	 * @param defense
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * Retrieves magic
	 * 
	 * @return
	 */
	public int getMagic() {
		return this.magic;
	}

	/**
	 * Sets magic
	 * 
	 * @param magic
	 */
	public void setMagic(int magic) {
		this.magic = magic;
	}

	/**
	 * Retrieves treasure
	 * 
	 * @return
	 */
	public int getTreasure() {
		return this.treasure;
	}

	/**
	 * Sets treasure
	 * 
	 * @param treasure
	 */
	public void setTreasure(int treasure) {
		this.treasure = treasure;
	}

	/**
	 * Retrieves health
	 * 
	 * @return
	 */
	public int getHealth() {
		return this.health;
	}

	/**
	 * Sets health
	 * 
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * This method adds treasure for monster if monster is alive
	 * 
	 * @param treasure
	 */
	public void addTreasure(double treasure) {
		if (health > 0) {
			this.treasure += treasure;
		}
	}

	/**
	 * This method subtracts treasure for monster if monster is alive
	 * 
	 * @param treasure
	 */
	public void subtractTreasure(double treasure) {
		if (health > 0) {
			this.treasure -= treasure;
			if (this.treasure < 0) {
				this.treasure = 0;
			}
		}
	}

	/**
	 * This method adds health for monster if monster is alive
	 * 
	 * @param amount
	 */
	public void addHealth(double amount) {
		if (health > 0) {
			health += amount;
		}
	}

	/**
	 * This method subtracts health for monster if monster is alive
	 * 
	 * @param score
	 */
	public void subtractHealth(double score) {
		if (health > 0) {
			health -= score;
			if (health < 0) {
				health = 0;
			}
		}
	}

	/**
	 * This method returns the battle score for monster if monster is alive. If
	 * monster is dead, it returns 0 The battleScore is the average of ferocity,
	 * defense, and magic values of monster
	 * 
	 * @return battleScore
	 */
	public double getBattleScore() {
		if (health <= 0) {
			return 0;
		}
		return (ferocity + defense + magic) / 3.0;
	}

	/**
	 * The attack method first checks the health of the attacking Orc, then it
	 * calculates the battle score. It then checks if the opponents battle score is
	 * greater than the attacking Orc's and subtracts the heath of the one with
	 * lesser score.
	 * 
	 * This attack method is used in other extended classes. It may be modified
	 * according to requirement
	 * 
	 * @param opponent
	 */
	public void attack(Monster opponent) {
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

}
