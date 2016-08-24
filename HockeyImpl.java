
public class HockeyImpl implements Hockey{
	int homeScore = 0;
	int visitscore = 0;
	String hometeamname;
	String visitteamname;
	public void homeGoalScored(){
		homeScore++;
	}
	public void visitGoalScored(){
		visitscore++;
	}
	public void setHomeTeam(String name){
		hometeamname = name;
	}

	public void setVisitingTeam(String name){
		visitteamname = name;
	}

	public void printScores(){
		System.out.println(hometeamname + " " + homeScore);
		System.out.println(visitteamname+" "+ visitscore);
	}
	public static void main(String args[]){
		Hockey hcy = new HockeyImpl();
		hcy.setHomeTeam("hyderabad");
		hcy.setVisitingTeam("San jose");
		hcy.visitGoalScored();
		hcy.homeGoalScored();
		hcy.homeGoalScored();
		hcy.printScores();
				
	}
}
