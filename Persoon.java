/**
 *  Persoon .
 * 
 * @author Yannick van der Ark & Hilco Westra
 * @version 20-11-14
 */
public class Persoon
{
    private int BSN;
    private String voornaam;
    private String achternaam;
    private int geboortedatumdag;
    private int geboortedatummaand;
    private int geboortedatumjaar;
    private char geslacht;

public Persoon( int PersoonBSN, String PersoonVoornaam, String PersoonAchternaam, int PersoonGeboortedatumdag, int PersoonGeboortedatummaand, int PersoonGeboortedatumjaar, char PersoonGeslacht)
{
    BSN = PersoonBSN ;
    voornaam = PersoonVoornaam;
    achternaam = PersoonAchternaam;
    setGeboortedatum(PersoonGeboortedatumdag, PersoonGeboortedatummaand, PersoonGeboortedatumjaar);
    setGeslacht(PersoonGeslacht);
}
  
public Persoon ()
{
}

/**
 * Methode om dienblad te koppelen aan een persoon
 * @param dienblad
 */
public void pakDienblad(Dienblad dienblad) {
 //method body omitted
} 

/**
 * Setter voor BSN
 */
public void setBSN(int nieuwBSN)
{
    BSN = nieuwBSN;
}

/**
 * Setter voor voornaam
 */
public void setVoornaam(String voor)
{
    voornaam = voor;
}

/**
 * Setter voor achternaam
 */
public void setAchternaam(String achter)
{
    achternaam = achter;
}

/**
 * Setter voor geboortedatum
 */
public void setGeboortedatum(int nieuwgeboortedatumdag, int nieuwgeboortedatummaand, int nieuwgeboortedatumjaar)
    {
       boolean error = false; 
       int tmp = nieuwgeboortedatummaand % 2;
     
        if(nieuwgeboortedatumdag < 1 || nieuwgeboortedatumdag > 31 || (nieuwgeboortedatummaand < 1 || nieuwgeboortedatummaand > 12) || (nieuwgeboortedatumjaar < 1900 || nieuwgeboortedatumjaar > 2100)) {
            error = true; 
        }

            if(nieuwgeboortedatumdag == 31)  {
            switch(nieuwgeboortedatummaand) 
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                    error = false;
                    break;
                case 2: case 4 : case 6 : case 9: case 11: 
                    error = true;
                    break;
            }
        }
           
            if(nieuwgeboortedatummaand == 2 && nieuwgeboortedatumdag > 28) {
            if(schrikkeljaarCheck(nieuwgeboortedatumjaar) && nieuwgeboortedatumdag == 29) {
                error = false; 
            }
            else {
                error = true; 
            }
        }
        
        if(error) {
            geboortedatumdag = 0;
            geboortedatummaand = 0;
            geboortedatumjaar = 0;
        }
        else {

            geboortedatumdag = nieuwgeboortedatumdag;
            geboortedatummaand = nieuwgeboortedatummaand;
            geboortedatumjaar = nieuwgeboortedatumjaar;
        }
   
    }
   
/**
 * Geslacht setten
 */
public void setGeslacht(char geslacht)
    {
        if(geslacht == 'M' || geslacht == 'V') {
            geslacht = geslacht;
        }
        else {
            geslacht = 'O'; 
        }
    } 

    /**
 * Getter voor geslacht
 */
public String getGeslacht()
    {
        
        String geslacht = "Onbekend";
        if(this.geslacht == 'M') {
           geslacht = "Man";
        }
        else if(this.geslacht == 'V') {
           geslacht = "Vrouw";
        }
        

        return geslacht;
    }

      /**
 * Getter voor geboortedatum
 * @return Geboortedatum 
 */
public String getGeboorteDatum() {
     String temp;
 if (geboortedatumdag==0 && geboortedatummaand==0 && geboortedatumjaar==0) {
 temp="Onbekend";
 } else {
 temp=geboortedatumdag+"/"+geboortedatummaand+"/"+geboortedatumjaar;
 }
 return temp;
}

 /**
 * Getter voor voornaam
 * @return Geboortedatum 
 */
public String getVoornaam() {
 return voornaam;
}


 /**
 * Getter voor achternaam
 * @return Geboortedatum 
 */
public String getAchternaam() {
 return achternaam;
}

/**
 * Getter voor BSN
 * @return Geboortedatum 
 */
public int getBSN() {
 return BSN;
}

/**
 * Alle details printen
 */
public void printDetails()
    {
        System.out.println("Voornaam: " + voornaam);
        System.out.println("Achternaam: " + achternaam);
        System.out.println("BSN: " + BSN);
        System.out.println("Geboortedatum: " + geboortedatumdag+"/"+geboortedatummaand+"/"+geboortedatumjaar);
        System.out.println("Geslacht: " + geslacht);
    }
   
/**
 * De check om te kijken of het ingevulde jaar een schrikkeljaar is
 */    
private boolean schrikkeljaarCheck (int jaar)
    {
        int tmpJaar = jaar;
        int honderd = tmpJaar % 100;
        int vier = tmpJaar % 4;
        int vierhonderd = tmpJaar % 400;

        if((honderd == 0 && vierhonderd != 0) || (vier == 0 && honderd == 0) || (vier != 0 )) {
            return false; 
        }
        else {
            return true;
        }
    }
}