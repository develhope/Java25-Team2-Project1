public class test {
    public static void main(String[] args) {

        int[] arrValues = {4, 6, 2, 5, 7};
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
                System.out.println(sottrazione(arrValues);
                break;
            case '*':
                System.out.println("Operazione di Moltiplicazione");
                System.out.println(moltiplicazione(arrValues));
                break;
            case '/':
                System.out.println("Operazione di Divisione");
                System.out.println();
                default:
                System.out.println("ERRORE.");
        }

    }

    public static int summa(int[] x) {
        int result = 0;
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
    
}
