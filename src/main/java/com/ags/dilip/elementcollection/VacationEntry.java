package com.ags.dilip.elementcollection;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VacationEntry {
    
    private String startDate;
    
    @Column(name="DAYS")
    private int daysTaken;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDaysTaken() {
        return daysTaken;
    }

    public void setDaysTaken(int daysTaken) {
        this.daysTaken = daysTaken;
    }

    @Override
    public String toString() {
	return "VacationEntry [startDate=" + startDate + ", daysTaken="
		+ daysTaken + "]";
    }
    
    
    
}
