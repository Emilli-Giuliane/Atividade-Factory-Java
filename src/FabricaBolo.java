public abstract class FabricaBolo {
    public abstract void criarBolo();
    public void fazerBolo(Bolo bolo){
        bolo.preparar();
    }
    public Bolo criarBolo(String tipo){
        if (tipo.equals("BoloMorango")){
            return new BoloMorango();
        } else if (tipo.equals("BoloChocolate")){
            return new BoloChocolate();
        } else if (tipo.equals("BoloCenoura")){
            return new BoloCenoura();
        } else if (tipo.equals("BoloAbacaxi")){
            return new BoloAbacaxi();
        }
        return null;
    }
}
