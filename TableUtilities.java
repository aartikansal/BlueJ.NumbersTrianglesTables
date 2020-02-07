 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String A= "";
        for (int i= 1; i<= tableSize ; i++ ){
            
         for ( int y= 1; y<=tableSize ;y++){
             //A= A + (i * y);
       
             
            if  (i*y <10){

                A = A + "  "+ (i*y) +" |";
            } else if ((i*y)< 100) {
           A = A + " " + (i*y) +" |";
        }
        else {
            A = A + (i*y) + " |";
                
            }
               
        }   
        
        A += "\n";
    }
 
        return A ;
    }
}

