public class ArrayAlgorithms{
    /* ITERATIVE ALGORITHMS */
    /* Sum of All Elements*/
    public static int addAll(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) { 
                sum += arr[i];
            }
            return sum;
    }

    /* Product of All Elements */
    public static int productAll(int[] arr) { 
        int product = 1;
        for (int i = 0; i < arr.length; i++) { 
            product *= arr[i];
        }
        return product; 
    }

    /* isElement */
    /* Returns true if input value is an element of the array */
    public static boolean isElement(int[] arr, int value) { 
        for (int i = 0; i < arr.length; i++) { 
            if(arr[i] == value)
                return true; 
        }
        return false; 
    }

    /* Find Minimum */
    public static int findMin(int[] arr) { 
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) { 
            if(min > arr[i]) { 
                min = arr[i]; 
            }
        }
        return min;
    }

    /* Find Maximum */
    public static int findMax(int[] arr) { 
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) { 
            if(max < arr[i]) { 
                max = arr[i]; 
            }
        }
        return max;
    }

    /* Reverse an Array */
    /* Modifies an array to reverse the order of its elements */
    public static void reverse(int[] arr) { 
        for (int i = 0; i < arr.length/2; i++) { 
            Helpers.swap(arr, i, arr.length - (i + 1));
        }
    }

    /* RECURSIVE FUNCTIONS */ 
    /* addAllRec */
    public static int addAllRec(int[] arr, int n) {
        if (n == 1){ 
            return arr[0]; 
        }
        return addAllRec(arr, n-1) + arr[n-1]; 
    }
    /* Wrapper for addAllRec */
    public static int callAddAllRec(int[] arr) { 
        int n = arr.length; 
        return addAllRec(arr, n); 
    }
    
    /* productAllRec */
    public static int productAllRec(int[] arr, int n) { 
        if (n == 1){
            return arr[0]; 
        }
        return productAllRec(arr, n-1)* arr[n-1]; 
    }
    
    /* Wrapper for productAllRec */
    public static int callProductAllRec(int[] arr){
        int n = arr.length; 
        return productAllRec(arr, n); 
    }
     
    /* isElementRec */
    public static boolean isElementRec(int[] arr, int i, int value){
        if (i == arr.length) { 
            return false; 
        }

        if (arr[i] == value) {
            return true; 
        } else { 
            return isElementRec(arr, i + 1, value); 
        }
    }

    /* Wrapper for isElementRec */
    public static boolean callIsElementRec(int[] arr, int value){ 
        int i = 0; 
        return isElementRec(arr, i, value); 
    }

    /* findMinRec */
    public static int findMinRec(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMinRec(arr, n-1);
        int currentInt = arr[n-1];
        if (currentInt < min) {
            return currentInt;
        } else {
            return min;
        }
    }

    /* Wrapper for findMinRec */
    public static int callfindMinRec(int[] arr){ 
        int n = arr.length;  
        return findMinRec(arr, n); 
    }
    
    /* findMaxRec */
    public static int findMaxRec(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int max = findMaxRec(arr, n-1);
        int currentInt = arr[n-1];
        if (currentInt > max) {
            return currentInt;
        } else {
            return max;
        }
    }

    /* Wrapper for findMaxRec */
    public static int callfindMaxRec(int[] arr){ 
        int n = arr.length;
        return findMaxRec(arr, n); 
    }
    
    /* reverseRec */
    public static int[] reverseRec(int[] arr, int i, int n) {
        if (i > n) {
            return arr; 
        }
        Helpers.swap(arr, i, n-1);
        return reverseRec(arr, i + 1, n - 1); 
    }

    /* Wrapper for reverseRec */
    public static int[] callReverseRec(int[] arr){ 
        int i = 0; 
        int n = arr.length; 
        return reverseRec(arr, i, n); 
    }    
}