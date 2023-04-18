package com.backEnd_w4_project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class infoPage {

	private String title;
	private String info1;
	private String info2;
	private String info3;
	
	
	
	public  infoPage(String lang) {

        if(lang.contains("it")) {
            this.title ="Benvenuto!";
            this.info1="Segui queste regole per prenotare:";
            this.info2="Puoi avere piu prenotazioni ma non puoi prenotare piu di una prenotazione al giorno!";
            this.info3="inserisci una data valida!";
        
        }else if(lang.contains("en")){
            this.title ="Welcome!";
            this.info1="Follow those rules for booking:";
            this.info2="You can have multiple booking but you can only book one a day!";
            this.info3="insert a valid booking date!";
          
        }else {
        	this.title ="ERRORE:";
        	this.info1="Lingua selezionata non valida";
        	this.info2="Prego inserire un'altra lingua";
        	this.info3="Grazie e arrivederci";
        }
		
	}
}
