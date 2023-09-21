package entity;

public class Robo {
    private StrategyComportamento comportamento;

    public void setComportamento(StrategyComportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
