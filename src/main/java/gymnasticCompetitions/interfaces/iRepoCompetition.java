package gymnasticCompetitions.interfaces;

public interface iRepoCompetition {
	boolean addCompetition();
	boolean modifyCompetition();
	boolean deleteCompetition();
	Competition showCompetition(String name);
	
}
