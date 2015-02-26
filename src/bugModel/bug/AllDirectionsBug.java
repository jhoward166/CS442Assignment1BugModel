package bugModel.bug;
import bugModel.util.Debug;

public interface AllDirectionsBug {
    /**
    * Movement is a class used to store the direction data that is
    * returned by the functions that simulate movement for the bug. The
    * idea was to be able to put any abstraction in, handle it in
    * Movement, then simply store the value that you wished to be sent
    * to the file/screen as its string representation. This way we can
    * have an abstraction ready to handle any representation of
    * movement.
    *
    **/
    public class Movement{
        private int direction;
        /**
        * Constructor method for Movement
        * @param directionIn the representation of movement that is
        * being parsed in movement
        **/
        public Movement(int directionIn){
            direction = directionIn;
            Debug.printToStdout(4, "An instance of class Movement has been created.\n");
        }
        /**
        * Setter method for the direction data member
        * @param directionIn new value directionIn is to be set to
        **/
        public void setDirection(int directionIn){
            Debug.printToStdout(3,"The setDirection setter method has been called from Movement.\n");
            direction = directionIn;
        }
        /**
        * Getter method for the direction data method
        * @return the direction data member as the type it is being 
        * stored as
        **/
        public int getDirection(){
            Debug.printToStdout(3,"The toString method has been called from Movement.\n");
            return direction;
        }
        /**
        * Gives the text representation of the Movement object. This is
        * what will be stored in the Results data member and printed to
        * the file and screen
        * @return the text representation of the direction data member
        **/
        public String toString(){
            Debug.printToStdout(3,"The toString method has been called from Movement.\n");
            return String.format("%d", direction);
        }
    }

    // methods to move right, left, up, down
    public void moveRight();
    public void moveLeft();
    public void moveUp();
    public void moveDown();
    public void undoPrev();
}
