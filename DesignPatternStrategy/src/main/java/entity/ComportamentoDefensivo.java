package entity;

public class ComportamentoDefensivo implements StrategyComportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
