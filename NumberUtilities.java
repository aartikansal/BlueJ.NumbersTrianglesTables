


public class NumberUtilities {

    public static String getRange(int stop) {
        String aarti = "";
        for( int i = 0 ; i < stop ; i++ ){
            aarti = aarti + i;
        }
        return aarti;
    }

    public static String getRange(int start, int stop) {
        String aarti = "";
        for( int i = start ; i < stop ; i++ ){
            aarti = aarti + i;
        }
        return aarti;
    }


    public static String getRange(int start, int stop, int step) {
        String aarti = "";
        for( int i = start ; i < stop ; i=i+step  ){
            aarti = aarti + i;
        }
        return aarti;
    }

    public static String getEvenNumbers(int start, int stop) {
        String aarti = "";
        for( int i = start ; i < stop ; i++ ){
           if (i % 2 == 0 )aarti = aarti + i;
        }
        return aarti;
    }


    public static String getOddNumbers(int start, int stop) {
       String aarti = "";
        for( int i = start ; i < stop ; i++ ){
           if (i % 2 != 0 )aarti = aarti + i;
        }
        return aarti;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String aarti = "";
        for( int i = start ; i <= stop ; i++ ){
           aarti = aarti + (int)Math.pow  (i , exponent);
        }
        return aarti;
    }
}
