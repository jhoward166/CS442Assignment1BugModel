package bugModel.bug;

import bugModel.util.Debug;
import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.results.FileLog;
import bugModel.results.StoreMovements;

/**
* Bug models the movement of the Bug object as it is given a defined
* set of commands from the user
**/
public class Bug implements AllDirectionsBug {
    
    public Results bugResults;
    
    /**
    * constructor for the bug object
    * @param resultsIn a Results object that is to be used to keep
    * track of movement in the instance of Bug
    **/
    public Bug(Results resultsIn){
        bugResults = resultsIn;
        Debug.printToStdout(4,"An instance of class Bug has been created.\n");
    }
    // methods to move right, left, up, down
    /**
    * moveRight simulates the movement of the Bug object, one spot
    * to the right and calls addCommand on results to record the 
    * movement
    **/
    public void moveRight(){
        Debug.printToStdout(3,"The moveRight method has been called from AllDriectionsBug.\n");
        Movement thisMoveRight = new Movement(1);
        bugResults.addCommand((thisMoveRight.toString()));
    }
    /**
    * moveLeft simulates the movement of the Bug object, one spot
    * to the left and calls addCommand on results to record the 
    * movement
    **/
    public void moveLeft(){
        Debug.printToStdout(3,"The moveLeft method has been called from AllDirectionsBug.\n");
        Movement thisMoveLeft = new Movement(2);
        bugResults.addCommand((thisMoveLeft.toString()));
    }
    /**
    * moveUp simulates the movement of the Bug object, one spot
    * up and calls addCommand on results to record the movement
    **/
    public void moveUp(){
        Debug.printToStdout(3,"The moveUp method has been called from AllDirectionsBug.\n");
        Movement thisMoveUp = new Movement(3);
        bugResults.addCommand((thisMoveUp.toString()));
    }
    /**
    * moveDown simulates the movement of the Bug object, one spot
    * down and calls addCommand on results to record the movement
    **/
    public void moveDown(){
        Debug.printToStdout(3,"The moveDown method has been called from AllDirectionsBug.\n");
        Movement thisMoveDown = new Movement(4);
        bugResults.addCommand((thisMoveDown.toString()));
    }
    /**
    * undoPrev sets a undo value in the movement object that signals
    * for the removal of the last valid command when it is received by
    * the addCommand method of StoreMovements
    **/
    public void undoPrev(){
        Debug.printToStdout(3,"The undoPrev method has been called from AllDirectionsBug.\n");
        Movement undoLastMove = new Movement(0);
        bugResults.addCommand((undoLastMove.toString()));
    } 
    /**
    * responsible for returning the string representation of the Bug
    * object
    * @return the string representation of the bug object
    **/
    public String toString() {
        Debug.printToStdout(3,"The toString method has been called from Bug.\n");
	    String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
	    return retValue;
    }

}
