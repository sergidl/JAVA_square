public class quadrat {
    //check if the input is a natural number
    public static boolean isNatural(int input) {
        if (input > 0) {
            return true;
        } else {
            return false;
        }
            
        
    }

    public static int area(int input) {
        return input * input;
    }

    public static int volume(int input) {
        return input * input * input;
    }
}
