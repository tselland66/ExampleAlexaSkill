package com.selland.model;
/**
 * This enum is as of yet unused but will be when and if the TimeOfDayMealAdvisorIntentHandler is implemented
 */
public enum PeriodOfDay {

	MORNING("morning", "morning"),
	AFTERNOON("afternoon", "afternoon"),
	EVENING("evening", "evening");
	
	private String id;
	private String name;
	
	private PeriodOfDay(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public static PeriodOfDay findById(String id) {
		
        if (id != null) {
            for (PeriodOfDay m : PeriodOfDay.values()) {
                if (id.equalsIgnoreCase(m.getId())) {
                    return m;
                }
            }
        }
        
        return null;
	}
	
	public static PeriodOfDay findByName(String nm) {
		
        if (nm != null) {
            for (PeriodOfDay m : PeriodOfDay.values()) {
                if (nm.equalsIgnoreCase(m.getName())) {
                    return m;
                }
            }
        }
        
        return null;
	}
}
