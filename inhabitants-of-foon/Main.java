package inhabitants-of-foon;

/**
 * Runner Class
 * 
 * @author Syed Fardeen
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Goblin goblin = new Goblin("Golden", 5, 2, 1);
		Goblin goblin2 = new Goblin("Gray", 3, 2, 1);

		Warlord warlord = new Warlord("Purple", 9, 5, 6);
		Warlord warlord2 = new Warlord("Pink", 9, 5, 6);

		Infantry infantry = new Infantry("Purple", 4, 1, 1, warlord);
		Infantry infantry2 = new Infantry("Purple", 4, 1, 1, warlord);
		Infantry infantry3 = new Infantry("Purple", 4, 1, 1, warlord);

		Infantry infantry01 = new Infantry("Pink", 4, 1, 1, warlord);
		Infantry infantry02 = new Infantry("Pink", 4, 1, 1, warlord);
		Infantry infantry03 = new Infantry("Pink", 4, 1, 1, warlord);

		Manticore manticore = new Manticore("Black", 9, 7, 2);
		Manticore manticore2 = new Manticore("Silver", 10, 7, 2);

		System.out.println("\nBefore Battle Stats:");
		System.out.println(goblin);
		System.out.println(goblin2);
		System.out.println(infantry);
		System.out.println(infantry2);
		System.out.println(warlord);
		System.out.println(warlord2);
		System.out.println(manticore);
		System.out.println(manticore2);
		System.out.println(infantry01);
		System.out.println(infantry02);
		System.out.println(infantry03);
		System.out.println(warlord + "\n");
		
		//set sworn enemy for goblins
		goblin.setSwornEnemy(goblin2);
		goblin2.setSwornEnemy(goblin);
		
		//add infantry for warlords
		warlord.addInfantry(infantry);
		warlord.addInfantry(infantry2);
		warlord.addInfantry(infantry3);
		warlord2.addInfantry(infantry01);
		warlord2.addInfantry(infantry02);

		//battles starts
		goblin.attack(goblin2);
		warlord.attack(goblin);
		goblin2.attack(goblin);
		warlord.attack(manticore);
		manticore.attack(infantry2);
		manticore2.attack(manticore);
		manticore2.attack(infantry2);
		manticore2.attack(infantry2);
		manticore2.attack(infantry2);
		manticore2.attack(infantry2);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry);
		manticore2.attack(infantry2);
		manticore2.attack(warlord2);
		
		System.out.println("\nMid-Battle Stats:");
		System.out.println("Goblin1 Clan: " + goblin.getClanAffiliation() + " Battle Score: " + goblin.getBattleScore() + " Health: " + goblin.getHealth());
		System.out.println("Goblin2 Clan: " + goblin2.getClanAffiliation() + " Battle Score: " + goblin2.getBattleScore() + " Health: " + goblin2.getHealth());
		System.out.println("Infantry1 Clan: " + infantry.getClanAffiliation() + " Battle Score: " + infantry.getBattleScore() + " Health: " + infantry.getHealth() + " Commander: " + infantry.getCommanderWarlord());
		System.out.println("Infantry2 Clan: " + infantry2.getClanAffiliation() + " Battle Score: " + infantry2.getBattleScore() + " Health: " + infantry2.getHealth() + " Commander: " + infantry2.getCommanderWarlord());
		System.out.println("Infantry01 Clan: " + infantry01.getClanAffiliation() + " Battle Score: " + infantry01.getBattleScore() + " Health: " + infantry01.getHealth() + " Commander: " + infantry01.getCommanderWarlord());
		System.out.println("Infantry02 Clan: " + infantry02.getClanAffiliation() + " Battle Score: " + infantry02.getBattleScore() + " Health: " + infantry02.getHealth() + " Commander: " + infantry02.getCommanderWarlord());
		System.out.println("Warlord1 Clan: " + warlord.getClanAffiliation() + " Battle Score: " + warlord.getBattleScore() + " Health: " + warlord.getHealth() + " Leadership Rating: " + warlord.getLeadershipRating());
		System.out.println("Warlord2 Clan: " + warlord2.getClanAffiliation() + " Battle Score: " + warlord2.getBattleScore() + " Health: " + warlord2.getHealth() + " Leadership Rating: " + warlord2.getLeadershipRating());
		System.out.println("Manticore1 Clan: " + manticore.getClanAffiliation() + " Battle Score: " + manticore.getBattleScore() + " Health: " + manticore.getHealth());
		System.out.println("Manticore2 Clan: " + manticore2.getClanAffiliation() + " Battle Score: " + manticore2.getBattleScore() + " Health: " + manticore2.getHealth());
		
		//warlord sounds battle cry
		warlord.soundBattleCry();
				
		System.out.println("\nGoblin1 Clan: " + goblin.getClanAffiliation() + " Battle Score: " + goblin.getBattleScore() + " Health: " + goblin.getHealth());
		System.out.println("Goblin2 Clan: " + goblin2.getClanAffiliation() + " Battle Score: " + goblin2.getBattleScore() + " Health: " + goblin2.getHealth());
		System.out.println("Infantry1 Clan: " + infantry.getClanAffiliation() + " Battle Score: " + infantry.getBattleScore() + " Health: " + infantry.getHealth() + " Commander: " + infantry.getCommanderWarlord());
		System.out.println("Infantry2 Clan: " + infantry2.getClanAffiliation() + " Battle Score: " + infantry2.getBattleScore() + " Health: " + infantry2.getHealth() + " Commander: " + infantry2.getCommanderWarlord());
		System.out.println("Infantry01 Clan: " + infantry01.getClanAffiliation() + " Battle Score: " + infantry01.getBattleScore() + " Health: " + infantry01.getHealth() + " Commander: " + infantry01.getCommanderWarlord());
		System.out.println("Infantry02 Clan: " + infantry02.getClanAffiliation() + " Battle Score: " + infantry02.getBattleScore() + " Health: " + infantry02.getHealth() + " Commander: " + infantry02.getCommanderWarlord());
		System.out.println("Warlord1 Clan: " + warlord.getClanAffiliation() + " Battle Score: " + warlord.getBattleScore() + " Health: " + warlord.getHealth() + " Leadership Rating: " + warlord.getLeadershipRating());
		System.out.println("Warlord Clan: " + warlord2.getClanAffiliation() + " Battle Score: " + warlord2.getBattleScore() + " Health: " + warlord2.getHealth() + " Leadership Rating: " + warlord2.getLeadershipRating());
		System.out.println("Manticore1 Clan: " + manticore.getClanAffiliation() + " Battle Score: " + manticore.getBattleScore() + " Health: " + manticore.getHealth());
		System.out.println("Manticore2 Clan: " + manticore2.getClanAffiliation() + " Battle Score: " + manticore2.getBattleScore() + " Health: " + manticore2.getHealth() + "\n");
		
		Infantry infantry04 = new Infantry("Pink", 4, 1, 1, warlord);
		Infantry infantry05 = new Infantry("Pink", 4, 1, 1, warlord);
		Infantry infantry06 = new Infantry("Pink", 4, 1, 1, warlord);
		
		//warlord tries to add a dead soldier and more than 5 soldiers to his infantry
		warlord2.addInfantry(infantry);
		warlord2.addInfantry(infantry03);
		warlord2.addInfantry(infantry04);
		warlord2.addInfantry(infantry05);
		warlord2.addInfantry(infantry06);
		
		System.out.println("Warlord Clan: " + warlord2.getClanAffiliation() + " Battle Score: " + warlord2.getBattleScore() + " Health: " + warlord2.getHealth() + " Leadership Rating: " + warlord2.getLeadershipRating());

	}

}
