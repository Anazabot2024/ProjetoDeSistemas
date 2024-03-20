package jogotabuleirocorreto;

import javax.swing.JOptionPane;

public class JogoTabuleiroCorreto {

    public static void main(String[] args) {
        int opcao, nCasas, nJogadores;
        Jogo jogoAtual = null;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                              "1 - Iniciar nova partida\n"
                                            + "2 - Executar jogada\n"
                                            + "3 - Informa posições\n"
                                            + "0 - Sair", 0));
            switch (opcao) {
                case 1:
                    //Iniciar nova partida
                    nCasas = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe o número de casas:"));
                    nJogadores = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe o número de jogadores:"));
                    jogoAtual = new Jogo(nJogadores , nCasas);
                    break;
                case 2:
                    //Executar jogada
                    if (jogoAtual != null) {
                        jogoAtual.proximaJogada();
                    } else {
                        JOptionPane.showMessageDialog(null, "Você deve "
                                + "iniciar uma partida!");
                    }
                    break;
                case 3:
                    //Informar as posições
                    if (jogoAtual != null) {
                        JOptionPane.showMessageDialog(null, jogoAtual.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há jogo em execução!");
                    }
                    break;
                case 0:
                    //Sair
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
    
}
