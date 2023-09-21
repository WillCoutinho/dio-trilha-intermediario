package application;

import entity.*;

public class App {

    public static void main(String[] args) {
        StrategyComportamento normal = new ComportamentoNormal();
        StrategyComportamento defensivo = new ComportamentoDefensivo();
        StrategyComportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
    }
}
