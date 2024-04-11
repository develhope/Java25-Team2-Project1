public class test {
    public static void main(String[] args) {

        double[] arrValues = {4, 6, 2, 5, 7};
        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println("Operazione di Somma");
                System.out.println(summa(arrValues));
                break;
            case '-':
                System.out.println("Operazione di Sottrazione");
                System.out.println();
                break;
            case '*':
                System.out.println("Operazione di Moltiplicazione");
                System.out.println();
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