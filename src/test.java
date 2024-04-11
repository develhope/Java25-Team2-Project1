public class test {
    public static void main(String[] args) {

        int[] arrValues = {4, 6, 2, 5, 7};
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
}