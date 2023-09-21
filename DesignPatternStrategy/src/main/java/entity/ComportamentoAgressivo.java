package entity;

public class ComportamentoAgressivo implements StrategyComportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
