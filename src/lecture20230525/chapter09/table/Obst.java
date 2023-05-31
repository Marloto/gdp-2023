package lecture20230525.chapter09.table;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Obst {
	private String bezeichnung;
	private String farbe;
	private int gewichtInGramm;
	private int alter;
	
	public Obst(String bezeichnung, String farbe, int gewicht, int alter) {
		this.bezeichnung = bezeichnung;
		this.farbe = farbe;
		this.gewichtInGramm = gewicht;
		this.alter = alter; 		
	}

	public String getBezeichnung() {
		return bezeichnung;
	}
	public String getFarbe() {
		return farbe;
	}	
	public Integer getGewichtInGramm() {
		return gewichtInGramm;
	}
	public Integer getAlter() {
		return alter;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public void setGewichtInGramm(Integer gewichtInGramm) {
		this.gewichtInGramm = gewichtInGramm;
	}
	public void setAlter(Integer alter) {
		this.alter = alter;
	}
	public String toString() {
		return "bezeichnung=" + bezeichnung + 
				", farbe=" + farbe + 
				", gewicht=" +  gewichtInGramm + " gr." +
				", alter = " + alter;		
	}	
}