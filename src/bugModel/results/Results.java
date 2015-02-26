
package bugModel.results;

import bugModel.util.Debug;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
* Results is the file responsible for recording and printing out log
* objects to file and screen
**/
public class Results implements Display, FileLog, StoreMovements {
    private ArrayList<String> commandList = new ArrayList<String>();
    /**
    * Constructor method for the Rsults class. Serves only to print a
    * debug statement here 
    **/
    public Results(){
        Debug.printToStdout(4,"An instance of class Results has been created.\n");
    }
    
    /**
    * addCommand handles the adding of movement data to the data
    * structure in the Results object
    * @param command the string representation of the movement data
    * to be added to the data structure
    **/
    public void addCommand(String command){
        Debug.printToStdout(3,"The addCommand method has been called from StoreMovements.\n");
        if(command.equals("0")){
            if(commandList.size() == 0){
                Debug.printToStdout(2,"An entry has been added to the Results data member.\n");
                Debug.printToStdout(1, this.toString());
                commandList.add("0");
            }else if((commandList.size() > 1) && !(commandList.get(commandList.size()-1).equals("0"))){
                Debug.printToStdout(1, this.toString()); 
                commandList.remove(commandList.size()-1);
            }
        }else{
            Debug.printToStdout(2,"An entry has been added to the Results data member.\n");
            Debug.printToStdout(1, this.toString());
            commandList.add(command);
        }
    }
    
    /**
    * writeToScreen is responsible for printing the data in the data
    * structure to the screen.
    **/
    public void writeToScreen(){
        Debug.printToStdout(3,"The writeToScreen method has been called from Display.\n");
        for(int i=0; i<commandList.size(); i++){
            System.out.print(commandList.get(i));
        }
        System.out.print("\n");
    }
    
    /**
    * writeToFile is responsible for printing the data in the data
    * structure to a file.
    * @param fileIn the name of the file that the data should be
    * printed to 
    **/
    public void writeToFile(String fileIn){
        Debug.printToStdout(3,"The writeToFile method has been called from FileLog.\n");
        String filename = fileIn;
        try{
            PrintWriter fileHandle = new PrintWriter(filename);
            for(int i =0; i<commandList.size(); i++){
                fileHandle.write(commandList.get(i));
            }
            fileHandle.write("\n");
            fileHandle.close();
        }catch(FileNotFoundException noFile){
            System.out.print("File could not be written to.\n");
        }
    }
    
    /**
    * toString is responsible for returning the String representation
    * of the object
    * @return the string representation of the data stored in the data
    * structure
    **/
    public String toString(){
        Debug.printToStdout(3,"The toString method has been called from Bug.\n");
        String output = "";
        for(int i =0; i<commandList.size(); i++){
            output+= commandList.get(i);
        }
        if(output.length() == 0){
            output = "Data structure is currently empty.";
        }
        return output;
    }
    
} // end public class Results


