import ea.edu.*;
import ea.*;

public class Sprite extends BildE
{
    
    public Sprite(int x, int y, String verzeichnis)
    {
        super(x, y, verzeichnis);
        this.setzeMittelpunkt(x, y);
    }
    
    // Status setzen:
    
    public void setzeMittelpunkt(int x, int y)
    {
        super.mittelpunktSetzen(x, y);
    }
    
    public void setzeSichtbar(boolean nSichtbar)
    {
        super.sichtbarSetzen(nSichtbar);
    }
    
    // Statusabfrage:
    
    public boolean beruehrt(Raum object)
    {
        return super.schneidet(object);
    }
    
    public boolean nenneSichtbar()
    {
        return super.sichtbar();
    }
    
    public int nenneX()
    {
        return super.zentrum().x();
    }
    
    public int nenneY()
    {
        return super.zentrum().y();
    }
    
    // Bewegungen:
    
    public void move(Vektor bewegung)
    {
        super.bewegen(bewegung.x, bewegung.y);
    }
    
    public void move(float x, float y)
    {
        super.bewegen(x, y);
    }
    
    public void drehenUm(float winkelAenderung)
    {
        this.drehenRelativ(-winkelAenderung);
    }
    
}