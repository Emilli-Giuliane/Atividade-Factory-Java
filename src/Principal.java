public class Principal {
    public static void main(String[] args) {
        FabricaBolo fabrica = new FabricaBoloMorango();
        Bolo boloMorango = fabrica.criarBolo("BoloMorango");
        fabrica.fazerBolo(boloMorango);
        Bolo boloChoco = fabrica.criarBolo("BoloChocolate");
        fabrica.fazerBolo(boloChoco);
        Bolo boloCen = fabrica.criarBolo("BoloCenoura");
        fabrica.fazerBolo(boloCen);
        Bolo boloAb = fabrica.criarBolo("BoloAbacaxi");
        fabrica.fazerBolo(boloAb);
    }
}