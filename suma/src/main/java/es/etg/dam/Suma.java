package es.etg.dam;

public class Suma {
    public static void main(String[] args) {
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            int min = Math.min(n1, n2);
            int max = Math.max(n1, n2);

            int suma = 0;

            for (int i = min; i <= max; i++) {
                suma += i;
            }

            System.out.println(suma);

        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
}