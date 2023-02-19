public class ArrayAlgorithmsTester { 
    
    /* UNIT TESTS */
    /* ITERATIVE FUNCTIONS */
    /* Tester for addAll */
    static void test_addAll(int[] arr) {
        System.out.println("\n>> Testing addAll");
        System.out.println("Input array: " + Helpers.arrayToString(arr));
        System.out.println("Sum: " + ArrayAlgorithms.addAll(arr));
    }

    /* Tester for productAll */
    static void test_productAll(int[] arr) { 
        System.out.println("\n>> Testing productAll ");
        System.out.println("Input: " + Helpers.arrayToString(arr));
        int product = ArrayAlgorithms.productAll(arr); 
        System.out.println("Product: " + product);
    }

    /* Tester for isElement */
    static void test_isElement(int [] arr) { 
        int value = arr[arr.length -1]; //Selects element from array
        System.out.println("\n>> Testing isElement\nValue: " + value);
        System.out.println("Input:" + Helpers.arrayToString(arr));
        System.out.println("Result: " + ArrayAlgorithms.isElement(arr, value)); //Expected to return true  
        
        value = 999; 
        System.out.println("\n>> Testing isElement\nValue: " + value);
        System.out.println("Input:" + Helpers.arrayToString(arr));
        System.out.println("Result: " + ArrayAlgorithms.isElement(arr, value)); //Expected to return false
    }

    /* Tester for findMin */
    static void test_findMin(int[] arr) { 
        System.out.println("\n>> Testing findMin ");
        System.out.println("Input: " + Helpers.arrayToString(arr));
        System.out.println("Result: " + ArrayAlgorithms.findMin(arr));
    }

    /* Tester for findMax */
    static void test_findMax(int[] arr) { 
        System.out.println("\n>> Testing findMax ");
        System.out.println("Input: " + Helpers.arrayToString(arr));
        System.out.println("Result: " + ArrayAlgorithms.findMax(arr));
    }

    /* Tester for reverse */
    static void test_reverse(int[] arr) { 
        System.out.println("\n>> Testing reverse");
        System.out.println("Input: " + Helpers.arrayToString(arr));
        ArrayAlgorithms.reverse(arr); 
        System.out.println("Result: " + Helpers.arrayToString(arr));
    }

    /* RECURSIVE FUNCTIONS */
    /* Tester for addAllRec */
    static void test_addAllRec(int[] arr) { 
        System.out.println("\n>>  Testing addAllRec");
        System.out.println("Input: " + Helpers.arrayToString(arr));
        System.out.println("Result: " + ArrayAlgorithms.callAddAllRec(arr));
    }

    /* Tester for productAllRec */
    static void test_productAllRec(int[] arr) { 
        System.out.println("\n>>  Testing productAllRec"); 
        System.out.println("Input: " + Helpers.arrayToString(arr)); 
        System.out.println("Result: " + ArrayAlgorithms.callProductAllRec(arr)); 
    }
    
    /* Tester for isElementRec */
    static void test_isElementRec(int[] arr) { 
        int value = arr[arr.length -1]; //Selects element from array
        System.out.println("\n>> Testing isElementRec\nValue: " + value);
        System.out.println("Input:" + Helpers.arrayToString(arr));
        System.out.println("Result: " + ArrayAlgorithms.callIsElementRec(arr, value)); 

        value = 999; 
        System.out.println("\n>> Testing isElementRec\nValue: " + value);
        System.out.println("Input:" + Helpers.arrayToString(arr));
        System.out.println("Result: " + ArrayAlgorithms.callIsElementRec(arr, value)); 
    }

    /* Tester for findMinRec */
    static void test_findMinRec(int[] arr) { 
        System.out.println("\n>>  Testing findMinRec"); 
        System.out.println("Input: " + Helpers.arrayToString(arr)); 
        System.out.println("Result: " + ArrayAlgorithms.callfindMinRec(arr)); 
    }
    
    /* Tester for findMaxRec */
    static void test_findMaxRec(int[] arr) { 
        System.out.println("\n>>  Testing findMaxRec"); 
        System.out.println("Input: " + Helpers.arrayToString(arr)); 
        System.out.println("Result: " + ArrayAlgorithms.callfindMaxRec(arr)); 
    }
    /* Tester for reverseRec */
    static void test_reverseRec(int[] arr) { 
        System.out.println("\n>>  Testing reverseRec"); 
        System.out.println("Input: " + Helpers.arrayToString(arr)); 
        System.out.println("Result: " + Helpers.arrayToString(ArrayAlgorithms.callReverseRec(arr))); 
    }

    public static void main(String[] args){
        //Run the unit tests
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        int[] arr3 = {4, 3, 4, 1};

        System.out.println("========== ITERATIVE FUNCTS =========="); 
        test_addAll(arr); //10
        test_productAll(arr); //24
        test_isElement(arr); //true, false
        test_findMin(arr3); //1
        test_findMax(arr3); //4
        test_reverse(arr); //4 3 2 1 
        
        System.out.println("\n========== RECURSIVE FUNCTS =========="); 
        test_addAllRec(arr); //10
        test_productAllRec(arr); //24
        test_isElementRec(arr); //true, false
        test_findMinRec(arr3);  //1
        test_findMaxRec(arr3); //4
        test_reverseRec(arr2); //1 2 3 4
    }

}