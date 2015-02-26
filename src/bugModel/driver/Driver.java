
package bugModel.driver;
import bugModel.util.Debug;
import bugModel.results.FileLog;
import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.bug.AllDirectionsBug;
import bugModel.bug.Bug;

public class Driver{

	public static void main(String args[]) {

		if(args.length < 2) {
			System.err.println("Usage:  Please enter 2 arguments where the first is the debug code value, and the second should be the file name that the output is written to. (Unless I was supposed to leave this as FIXME in which case oops.)\n");
			System.exit(1);
		}
		
		//AllDirectionsBug b = new Bug();
        Debug.DEBUG_VALUE = Integer.parseInt(args[0]);
		Display res = new Results();
		AllDirectionsBug b = new Bug(((Results)res));
		System.out.println(b); 
		// All test cases
        b.undoPrev();
        b.moveLeft();
        b.moveUp();
        b.moveDown();
        b.moveRight();
        b.moveRight();
        b.moveDown();
        b.moveLeft();
        b.moveUp();
        b.moveRight();
        b.undoPrev();
        b.undoPrev();
        b.undoPrev();
        b.undoPrev();


        ((Display)res).writeToScreen();
        ((FileLog)res).writeToFile(args[1]);

	} // end main(...)

} // end public class Client

