// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class lunizile {


    public static void main(String[] args) {
        System.out.println (" Exercitiul 1 ");// inceput ex1

        String[] luni = {
                "ianuarie","februarie","martie","aprilie", "mai","iunie","iulie","august",
                "septembrie","octombrie","noiembrie","decembrie"
        };

        int[] ZileInLuna = {
                31,28,31,30,31,30,31,31,30,31,30,31
        };


        for (int i = 0; i < luni.length; i++) {
            System.out.println(luni[i] + " are " + ZileInLuna[i] + " zile.");
        }
        System.out.println (" Exercitiul 2 ");// inceput ex2
        System.out.println("Lunile cu 31 de zile:");
        for (int i =0; i < luni.length; i++){
            if (ZileInLuna[i] == 31){
                System.out.println(luni[i]);
            }
        }
        System.out.println (" Exercitiul 3 "); // inceput ex3
        System.out.println("Lunile cu mai puțin de 31 de zile:");
        for (int i = 0; i < luni.length; i++) {
            if (ZileInLuna[i] < 31) {
                System.out.println(luni[i] + " are " + ZileInLuna[i] + " zile.");
            }
        }
        System.out.println (" Exercitiul 4 ");// inceput ex4
        int totalzile = 0;
        for ( int i = 0; i < luni.length; i++ ){
            if (ZileInLuna[i] < 31 ) {
                totalzile += ZileInLuna[i];

            }
        }
        System.out.println("Numărul total de zile pentru lunile cu mai puțin de 31 de zile: " + totalzile);
        System.out.println (" Exercitiul 5 ");// Inceput ex5
        for (int i = 0; i < luni.length; i++) {
            String abbreviatedLuna = luni[i].substring(0, 3);
            System.out.println(abbreviatedLuna + " are " + ZileInLuna[i] + " zile.");
        }

    }
}
