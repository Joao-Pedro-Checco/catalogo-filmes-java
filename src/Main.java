import programas.*;

public class Main {
    public static Filme filme1;
    public static Filme filme2;
    public static Serie serie1;

    public static void main(String[] args) {
        filme1 = new Filme("O Poderoso Chefão", 1970, "Francis Ford Coppola", 180);
        filme2 = new Filme("Drive", 2011, "Nicolas Winding Refn", 100);
        serie1 = new Serie("Friends", new int[]{1994, 2004}, 10, false);
        System.out.println("Screen Match");

        filme1.avalia(10);
        filme1.avalia(8.9);
        filme2.avalia(9.7);
        filme2.avalia(8.1);
        filme1.avalia(8.7);
        filme2.avalia(10);
        filme2.avalia(10);

        serie1.avalia(10);
        serie1.avalia(8.9);
        serie1.avalia(9.7);
        serie1.avalia(8.1);
        serie1.avalia(8.7);
        serie1.avalia(10);
        serie1.avalia(10);

        filme1.exibeFichaTecnica();
        System.out.println("-----------------------------------------------------");
        filme2.exibeFichaTecnica();
        System.out.println("-----------------------------------------------------");
        serie1.exibeFichaTecnica();
    }
}
