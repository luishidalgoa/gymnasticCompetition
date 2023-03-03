package gymnasticCompetitions.interfaces;

public interface iController {
 /**
  * control download, introduce el welcome
  */
	void download();
	
	/**
	 * redirige a las opciones de competicion
	 */
	void newCompetition();
	
	/**
	 * escribe el archivo
	 */
	void write();
	
	/**
	 * lee del archivo
	 */
	void read();
	
	/**
	 * gestion menu
	 */
	void optionsCompetition();
	
	/**
	 * gestion menu
	 */
	void mainCompetition();
	
	/**
	 * añadir competicion
	 */
	void addCompetition();
	
	/**
	 * ver competicion
	 */
	void showCompetition();
	
	/**
	 * eliminar competicion
	 */
	void deleteCompetition();
	
	/**
	 *gestion menu modificar competicion
	 */
	void modifyCompetition();
	
	
	/**
	 * gestion menu
	 */
	void mainGymnast();
	
	/**
	 * añadir gimnasta
	 */
	void addGymnast();
	
	/**
	 * ver gimnasta
	 */
	void showGymnast();
	
	/**
	 * eliminar gimnasta
	 */
	void deleteGymnast();
	
	/**
	 *gestion menu modificar gimnasta
	 */
	void modifyGymnast();
	
	/**
	 * gestion menu
	 */
	void mainGroup();
	
	/**
	 * añadir grupo
	 */
	void addGroup();
	
	/**
	 * ver grupo
	 */
	void showGroup();
	
	/**
	 * eliminar grupo
	 */
	void deleteGroup();
	
	/**
	 *gestion menu modificar grupo
	 */
	void modifyGroup();
	
	
	
	
	
	
	
	/**
	 * gestion menu
	 */
	void mainTrial();
	
	/**
	 * añadir prueba
	 */
	void addTrial();
	
	/**
	 * ver prueba
	 */
	void showTrial();
	
	/**
	 * eliminar prueba
	 */
	void deleteTrial();
	
	/**
	 *gestion menu modificar prueba
	 */
	void modifyTrial();
	
	/**
	 * gestion de guardado e introducción de la despedida
	 */
	void save();
	
}
