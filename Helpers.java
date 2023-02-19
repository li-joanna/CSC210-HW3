public class Helpers { 
    /* Array to String */
    public static String arrayToString(int[] arr) { 
        String stringArray = ""; 
        for(int i = 0, i < arr.length; i++){ 
            stringArray += " " + arr[i];
        }
        return stringArray; 
    }

    /* Char Array to String */
    public static String charArrayToString(char[] arr) { 
        String stringArray = "[";
        if (arr.length > 0) { 
            stringArray += arr[0]; 
            for(int i = 1; i < arr.length; i++) { 
                stringArray += ", " + arr[i]; 
            }
            return stringArray += "]";
        } 
        return "Char array is empty" //Not sure if needed, bc the methods will check for empty arrays, will not call this if its empty 
        
        /* Char Array to String from index 0 to n */
        public static String charArrayNToString(char[] arr, int n) { 
            String stringArray = "[";
            if (arr.length > 0) { 
                stringArray += arr[0]; 
                for(int i = 1; i < n; i++) { 
                    stringArray += ", " + arr[i]; 
                }
                return stringArray += "]";
            } 
            return "Char array is empty" //Not sure if needed, bc the methods will check for empty arrays, will not call this if its empty 

    }

}