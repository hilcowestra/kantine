
/**
 * Write a description of class Dienblad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Dienblad {
 public ArrayList<Artikel> artikelen;
 /**
 * Constructor
 */
 public Dienblad() {
     this.artikelen = new ArrayList<Artikel>();
 }
 
 /**
 * Methode om artikel aan dienblad toe te voegen
Thema 1.2 I/TI Leertaak 1 Pagina 5 van 27 * @param artikel
 */
 public void voegToe(Artikel artikel) {
     this.artikelen.add(artikel);
 }
 
 /**
 * Methode om aantal artikelen op dienblad te tellen
 * @return Het aantal artikelen
 */
 public int getAantalArtikelen() {
      return artikelen.size();
 }
 
 /**
 * Methode om de totaalprijs van de artikelen
 * op dienblad uit te rekenen
 * @return De totaalprijs
 */
 public double getTotaalPrijs() {
     double prijs = 0;
        
        for(int i = 0; i < this.artikelen.size();i++)
        {
            prijs += this.artikelen.get(i).getPrijs();
        }
        
        
        return prijs;
    }
 }
