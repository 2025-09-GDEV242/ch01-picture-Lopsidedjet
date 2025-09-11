/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square building;
    private Square window;
    private Square window2;
    private Square window3;
    private Square door;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Person man;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        building = new Square();
        window = new Square();
        window2 = new Square();
        window3 = new Square();
        roof = new Triangle();  
        sun = new Circle();
        moon = new Circle();
        man = new Person();
        door = new Square();
        drawn = false;
        
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            building.changeColor("grey");
            building.moveHorizontal(-140);
            building.moveVertical(20);
            building.changeSize(400);
            building.makeVisible();
            
            
            man.changeColor("grey");
            man.moveHorizontal(-140);
            man.moveVertical(50);
            man.makeVisible(); 
            
            door.changeColor("red");
            door.moveHorizontal(-110);
            door.moveVertical(110);
            door.changeSize(100);
            door.makeVisible();
            
            
            
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            window2.changeColor("black");
            window2.moveHorizontal(100);
            window2.moveVertical(40);
            window2.changeSize(40);
            window2.makeVisible();
            
            window3.changeColor("yellow");
            window3.moveHorizontal(5);
            window3.moveVertical(40);
            window3.changeSize(40);
            window3.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            moon.changeColor("blue");
            moon.moveHorizontal(100);
            moon.moveVertical(-100);
            moon.changeSize(100);
            moon.makeVisible();
            drawn = true;            
            
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        building.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        building.changeColor("grey");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
