package gymnasticCompetitions.interfaces;

public interface iRepoTrial {
	boolean addTrial();
	boolean modifyTrial();
	boolean deleteTrial();
	Trial showTrial();
	Parcipation getWinner(String type, String category, String kit);
}
