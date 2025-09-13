/**
 * This class represents a simple picture. It a wizard in a green hat, heading
 * to his home. A magical event where the moon covers the sun.
 * 
 * @author  Joseph Patti
 * @version 2016.02.29
 */
public class Picture
{
    private Square building;
    private Square window;
    private Square window2;
    private Square window3;
    private Square door;
    private Triangle hat;
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
        hat = new Triangle();  
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
    
            window2.changeColor("blue");
            window2.moveHorizontal(100);
            window2.moveVertical(40);
            window2.changeSize(40);
            window2.makeVisible();
            
            window3.changeColor("yellow");
            window3.moveHorizontal(5);
            window3.moveVertical(40);
            window3.changeSize(40);
            window3.makeVisible();
            
            hat.changeColor("green");
            hat.changeSize(60,20);
            hat.moveHorizontal(-70);
            hat.moveVertical(35);
            hat.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            moon.changeColor("grey");
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
        building.changeColor("grey");
        window.changeColor("white");
        hat.changeColor("black");
        sun.changeColor("black");
        moon.changeColor("white");
        hat.changeColor("black");
        window.changeColor("black");
        window2.changeColor("white");
        window3.changeColor("white");
        door.changeColor("white");
        man.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        building.changeColor("grey");
        window.changeColor("black");
        hat.changeColor("green");
        moon.changeColor("grey");
        sun.changeColor("yellow");
        hat.changeColor("green");
        window2.changeColor("blue");
        window3.changeColor("yellow");
        door.changeColor("red");
        man.changeColor("black");
    }
}
