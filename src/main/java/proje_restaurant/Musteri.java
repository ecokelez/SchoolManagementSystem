package proje_restaurant;

public class Musteri {
    public static void main(String[] args) {

        System.out.println("***Hosgeldiniz***");
        Mutfak menu = new Mutfak();
        System.out.println("Menu:" + menu.toString());

        // menu objesını kullanrak toString metodunu cagırdık,tum menu cagırmak ıcın
        System.out.println();
        Mutfak siparis=new Mutfak("adanakebap","mercimek","gullac","salgam");
        // parametreli Const. ürettik ,
        System.out.println("Siparis = " + siparis);

        System.out.println();
        Mutfak siparis1=new Mutfak("urfaciger","yaylacorba","baklava","ayran");
        System.out.println(siparis1.toString());

    }
}
