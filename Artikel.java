
/**
 * Write a description of class Artikel here.
 * 
 * @author (Hilco Westra) 
 * @version (21-11-14)
 */
public class Artikel
{
    private String naam;    
    private int prijs;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(String artikelNaam, int artikelPrijs)
    {
        naam = artikelNaam;
        prijs = artikelPrijs;
    }

    /**
     * @return prijs
     */
    public int getPrijs()
    {
        return prijs;
    }
    
    /**
     * @return naam
     */
    public String getNaam()
    {
        return naam;
    }
    
    /**
     * @set prijs
     */
    public void setPrijs(int nieuwprijs)
    {
        prijs = nieuwprijs;
    }
    
     /**
     * @set naam
     */
    public void setNaam(String nieuwnaam)
    {
        naam = nieuwnaam;
    }
    
    public void printDetails()
    {
        System.out.println("Prijs: " + prijs);
        System.out.println("Naam: " + naam);
      
    }
}



