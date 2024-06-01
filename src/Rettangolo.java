//! esercizio, esercizio base;
// Creare la classe rettangolo con i metodi calcola area e perimetro

public class Rettangolo {

    int base;
    int altezza;

    public void area(){
        int area = base * altezza;
        System.out.println("l'area del rettangolo è: " + area);
    }

    public void perimetro(){
        int perimetro = 2 * base + 2 * altezza;
        System.out.println("il perimetro è: " + perimetro);
    }



    public static void main(String[] args) {
        Rettangolo r = new Rettangolo();

        r.base = 10;
        r.altezza = 2;

        r.area();
        r.perimetro();
    }

}

