public class Main {

    public static void main(String[] args) {

        //Inserire primo valore su x.
        int x = 10;
        //Inserire operatore.
        char operator = '+';
        //Inserire secondo valore su y.
        int y = 5;

        System.out.println( x + " è pari? " + checkValue(x));

        switch (operator) {
            case '+':
                System.out.println("Operazione di Somma");
                System.out.println("Il risultato è: " + sumValues(x, y));
                break;
            case '-':
                System.out.println("Operazione di Sottrazione");
                System.out.println("Il risultato è: " + subtractValues(x, y));
                break;
            case '*':
                System.out.println("Operazione di Moltiplicazione");
                System.out.println("Il risultato è: " + multiplicateValues(x, y));
                break;
            case '/':
                System.out.println("Operazione di Divisione");
                System.out.println("Il risultato è: " + divisionValues(x, y));
                break;
            case '^':
                System.out.println("Potenza");
                System.out.println("Il risultato è: " + expoValues(x, y));
                break;
            default:
                System.out.println("ERRORE. Operatore non riconosciuto.");
        }


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