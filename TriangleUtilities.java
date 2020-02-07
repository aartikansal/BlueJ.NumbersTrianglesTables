 

public class TriangleUtilities {
    


    public static String getRow(int numberOfStars) {
        String K = "";
        for ( int i= 1; i <= numberOfStars ; i++ ){
              K = K + "*" ;
        }
        return K ;
    }
    
    public static String getTriangle(int numberOfRows) {
        String K = "";
        
        for ( int x= 1; x <= numberOfRows ; x++ ){
            
        
        for (int i= 1; i <= x ; i++ ){
            
              K = K + "*";
            }
            K += "\n";
        }
    return K ;
}
    


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
