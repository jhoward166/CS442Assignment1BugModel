CS442 Design Patterns
Spring 2015
PROJECT 1 README FILE

Due Date: Wednesday, February 18, 2015
Submission Date: Tuesday, February 17, 2015
Grace Period Used This Project: 0 Days
Grace Period Remaining: ??? Days
Author: Joseph Howard
e-mail: jhoward$@binghamton.edu


PURPOSE:

This project simulates the movement of a VW Bettle and records the movement of it
into a Results object that can be used to print the movement record to the
screen or to a specified file

PERCENT COMPLETE:

I believe this project is 100% complete. The only thing that I am currently unsure
about is the placement of the function calls that print debug statements for debug
value 1. The action that triggers this print statement was not specified in the
assignment

PARTS THAT ARE NOT COMPLETE:

I believe all parts to be complete.

BUGS:

I did not find any bugs while testing my code.

FILES:
    
    Included with this project are 10 files:

    build.xml,              the build file for this project
    Results.java,           which defines all of the methods, classes and data
                             members that are responsible for storing, manipulating
                             or printing the record of the bug movement.
    Display.java,           which contains all of the method headers for printing
                             Results data to the screen
    FileLog.java,           which contains all of the method headers for writing
                             Results data to a file
    StoreMovements.java,    which contains the method headers for functions 
                             responsible for manipulating the data structure
    Debug.java,             contains a static class with a static function that
                             will print out debug statements when the debug value
                             is set in the driver
    Driver.java,            holds the main method that will run the rest of the
                             code
    Bug.java,               holds the classes, methods and data members responsible
                             for simulating the bug and its motion
    AllDirectionsBug.java,  contains the method headers for all of the methods that
                             simulate movement on the bug object
    README.txt,             the file you are currently reading that describes the project
                            
    

SAMPLE OUTPUT:

    [java] 
    [java]  I am a 2015 Volkswagen Bettle Convertible 
    [java] 
    [java] 234114231

TO COMPILE:

    Run the command "ant -buildfile src/build.xml all" in the Joseph-Howard/bug-model directory

TO RUN:

    Run the command "ant -buildfile src/build.xml run" in the Joseph-Howard/bug-model

EXTRA CREDIT:

None

BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
Joseph Howard

    ArrayList syntax and method definitions
    * http://www.tutorialspoint.com/java/java_arraylist_class.htm
    
    Java PrintWriter syntax and methods
    * http://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html


ACKNOWLEDGEMENT:

    During the coding process one or more of the following people may have been
    consulted. Their help is greatly appreciated. They helped with by providing 
    moral support, and consulting on design questions and syntax clarification.

    David Morris
    Scott Aliosio

