public class Main {

    public static void main(String[] args) {

    }

    public static int sumValues(int x, int y) {
        return x + y;
    }

    public static int subtractValues(int x, int y) {
        return x - y;
    }
    
    public static int multiplicateValues(int x, int y) {
        return x * y;
    }

    public static  int divisionValues (int x, int y) {
        if (y == 0) {
            System.out.print("ERRORE. Impossibile dividere per ");
            return y;
        } else {
            System.out.println("Resto: " + (x % y));
            return x / y;
        }
    }

    public static int expoValues (int x, int y) {
        int exp = 1;
        for (int i = 0; i < y; i++) {
            exp = exp * x;
        }
        return exp;
    }

    public static boolean checkValue (int x) {
        return (x % 2 == 0) && (x != 0);
    }
}