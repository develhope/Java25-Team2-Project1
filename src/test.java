public class test {
    public static void main(String[] args) {

        double[] arrValues = {4, 6, 2, 5, 7};
        int x = 5;
        char operator = '+';
        System.out.println(("Il Numero inserito è: " + x));
        System.out.println("Il numero è pari: " + checkNumber(x));

        switch (operator) {
            case '+':
                System.out.println("Operazione di Somma");
                System.out.println(summa(arrValues));
                break;
            case '-':
                System.out.println("Operazione di Sottrazione");
                System.out.println(sottrazione(arrValues));
                break;
            case '*':
                System.out.println("Operazione di Moltiplicazione");
                System.out.println(moltiplicazione(arrValues));
                break;
            case '/':
                System.out.println("Operazione di Divisione");
                System.out.println(division(arrValues));
                break;
                default:
                System.out.println("ERRORE.");
        }
    }

    public static double summa(double[] x) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result = result + x[i];
        }
        return result;
    }
     public static int sottrazione(int[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            result = result - x[i];
        }
        return result;
    }
    public static int moltiplicazione(int[] x) {
        int result = 1;
        for (int i = 1; i < x.length; i++) {
            result = result * x[i];
        }
        return result;
    }

    public static double division(double[] x) {

        double result = x[0];

        for (int i = 1; i < x.length; i++) {
            if (x[i] == 0) {
                System.out.print("ERROR: impossible to divide by: ");
                result = 0;
                break;
            }
            result /= x[i];
        }
        return result;
    }
    public static boolean checkNumber(int number) {
        return (number % 2 == 0) && (number != 0);

    }

}
