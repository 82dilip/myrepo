package com.ags.dilip.elementcollection;

import java.util.Collection;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @ElementCollection
    @CollectionTable(name="VACATION", joinColumns=@JoinColumn(name="EMP_ID"))
    @AttributeOverride(name="daysTaken", column=@Column(name="DAYS_ABS"))
    private Collection<VacationEntry> vacationBookings;
    
    @ElementCollection
    @CollectionTable(name="EMP_NICKNAME", joinColumns=@JoinColumn(name="EMP_ID"))
    @Column(name="NICKNAME")
    private Set<String> name;

    public Collection<VacationEntry> getVacationBookings() {
        return vacationBookings;
    }

    public void setVacationBookings(Collection<VacationEntry> vacationBookings) {
        this.vacationBookings = vacationBookings;
    }

    public Set<String> getName() {
        return name;
    }

    public void setName(Set<String> name) {
        this.name = name;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", vacationBookings=" + vacationBookings
		+ ", name=" + name + "]";
    }
    
    
    
}
