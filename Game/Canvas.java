import ea.edu.*;
import ea.*;

public class Canvas extends TextE
{
    
    public Canvas(int x, int y, String text)
    {
        super(text);
        super.mittelpunktSetzen(x, y);
    }
    
    public void setzeMittelpunkt(int x, int y)
    {
        super.mittelpunktSetzen(x, y);
    }
}