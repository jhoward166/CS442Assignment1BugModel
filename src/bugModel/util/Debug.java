package bugModel.util;

public final class Debug{
    public static int DEBUG_VALUE = 0;
    public static void  printToStdout(int level, String debugMessage){
        if(level == DEBUG_VALUE){
            System.out.print(debugMessage);
        }
    }
}
