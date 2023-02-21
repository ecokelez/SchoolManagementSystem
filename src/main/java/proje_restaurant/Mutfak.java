package proje_restaurant;

public class Mutfak {

public String yemekler="adanakebap,urfaciger,kusbası,kuslama";

public String araSıcak="yaylacorba,mercimek,duguncorba,corba";

public String tatlılar="baklava,sutlac,gullac,kazandıbı,kunefe";

public String icecekler="ayran,salgam,kola";

    public Mutfak(String adanakebap, String mercimek, String gullac, String salgam) {
        this.yemekler=adanakebap;
        this.araSıcak=mercimek;
        this. tatlılar=gullac;
        this.icecekler=salgam;
    }



    public Mutfak() {
    }


    @Override
    public String toString() {
        return   "Mutfak"+
                "\nyemekler=" + yemekler +
                "\naraSıcak=" + araSıcak +
                "\ntatlılar=" + tatlılar +
                "\nicecekler=" + icecekler ;

    }
}
