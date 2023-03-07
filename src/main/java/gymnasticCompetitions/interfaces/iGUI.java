package gymnasticCompetitions.interfaces;

public interface iGUI {
	void Welcome();
	
	/**
	 * descargar las competiciones guardadas o no
	 */
	void loadFile();
	
	/*
	 * gestiona la propia competicion, gimnastas, grupos y prueba
	 */
	void mainPrincipalCompetitions();
	
	/*
	 * crear, modificar, mostrar y eliminar competicion
	 */
	void mainCompetition();
	
	/**
	 * que atributo modificar de competicion
	 */
	void changeCompetition();
	
	/*
	 * crear, modificar, mostrar y eliminar gimnasta
	 */
	void mainGymnast();
	
	/**
	 * que atributo modificar de gimnasta
	 */
	void changeGymnast();
	
	/*
	 * crear, modificar, mostrar y eliminar grupo
	 */
	void mainGroup();
	
	/**
	 * que atributo modificar de grupo
	 */
	void changeGroup();

	/*
	 * crear, modificar, mostrar, eliminar prueba y ver ganadores de cada prueba
	 */
	void mainTrial();
	
	/**
	 * que atributo modificar de prueba
	 */
	void changeTrial();
	
	/**
	 * guardar todo lo que tenemos
	 */
	void save();
	
	void goodbye();
}
