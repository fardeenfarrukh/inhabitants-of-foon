package Assignment6_000906029;

/**
 * The Infantry class extends the Orc class and contains the same methods it
 * does. The infantry class also has two super constructors and one field
 * constructor.
 * 
 * @author Syed Fardeen
 *
 */
public class Infantry extends Orc {

	/**
	 * commanderWarlord is the commander Orc that can have 5 Infantry soldiers under
	 * his as an array
	 */
	private Warlord commanderWarlord;

	/**
	 * Field Constructor
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 * @param commanderWarlord
	 */
	public Infantry(String clanAffiliation, int ferocity, int defense, int magic, Warlord commanderWarlord) {
		super(clanAffiliation, ferocity, defense, magic);
		this.commanderWarlord = commanderWarlord;
	}

	/**
	 * Super Constructor from Orc class
	 * 
	 * @param clanAffiliation
	 * @param ferocity
	 * @param defense
	 * @param magic
	 */
	public Infantry(String clanAffiliation, int ferocity, int defense, int magic) {
		super(clanAffiliation, ferocity, defense, magic);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This constructor only sets the clanAffliation
	 * 
	 * @param clanAffiliation
	 */
	public Infantry(String clanAffiliation) {
		super(clanAffiliation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method retrieves commanderWarlord field
	 * 
	 * @return Warlord
	 */
	public Warlord getCommanderWarlord() {
		return this.commanderWarlord;
	}

	/**
	 * This method sets commanderWarlord field
	 * 
	 * @param commanderWarlord
	 */
	public void setCommanderWarlord(Warlord commanderWarlord) {
		this.commanderWarlord = commanderWarlord;
	}

	/**
	 * This method is called when Warlord sounds battle cry It increases the health
	 * of infantry soldier by the leadership score of the warlord * 5.
	 * 
	 * If infantry soldier is dead, this method returns cannot be revived message.
	 */
	public void healthBoost() {
		// TODO Auto-generated method stub
		if (getHealth() > 0) {
			setHealth(health + commanderWarlord.getLeadershipRating() * 5);

		} else {
			System.out.println("Dead monsters cannot be revived");
		}
	}

	/**
	 * toString method for Infantry class
	 */
	@Override
	public String toString() {
		return "Infantry [commanderWarlord=" + this.commanderWarlord + ", clanAffiliation=" + this.clanAffiliation
				+ ", ferocity=" + this.ferocity + ", defense=" + this.defense + ", magic=" + this.magic + ", treasure="
				+ this.treasure + ", health=" + this.health + "]";
	}

}
