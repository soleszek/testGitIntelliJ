public class Przyklady {
    public static void main(String[] args) {
        int liczba1 = 10;
        int liczba2 = 99;
        int wynik = liczba1 + liczba2;
        System.out.println(wynik);

        wynik+=10;
        wynik++;
        wynik--;
        System.out.println(wynik);

        if(liczba1>liczba2) {
            System.out.println("liczba1 jest większa!");
        } else {
            System.out.println("liczba2 jest większa!");

        }
    }
}
