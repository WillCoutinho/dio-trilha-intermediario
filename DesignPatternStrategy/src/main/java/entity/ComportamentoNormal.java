package entity;

public class ComportamentoNormal implements StrategyComportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
