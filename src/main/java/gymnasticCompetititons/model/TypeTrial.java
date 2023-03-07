package gymnasticCompetititons.model;

public enum TypeTrial {
	INDIVIDUAL,
    COOP;
	
	/**
     * Este metodo comprobara que el nombre introducido por el usuario sea igual que alguno de los Enumeradores ya
     * predefinidos
     * @param name nombre del tipo introducido por el usuario
     * @return devuelve el Enum si lo ha encontrado. si no devuelvo Null
     */
    public TypeTrial fromName(String name){
        for (TypeTrial e: TypeTrial.values()){
            if(e.name().equalsIgnoreCase(name)){
                return e;
            }
        }
        return null;
    }
}
