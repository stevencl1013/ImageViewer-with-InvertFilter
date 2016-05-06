import java.awt.*;
/**
 * Filter that inverts colors of image.
 * 
 * @author Steven Lee
 * @version 5.6.2016
 */
public class InvertFilter extends Filter
{
    public InvertFilter(String name)
    {
        super(name);
    }
    
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        Color c;
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                c = image.getPixel(x,y);
                image.setPixel(x,y, new Color(255-c.getRed(), 255-c.getGreen(), 255-c.getBlue()));
            }
        }
    }
}
