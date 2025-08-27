package PackageDrone;

import javax.swing.*;
import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args){
        Integer opcao;
        System.out.println("Teste");

        Drone d1 = new Drone(1232431234L, "Shopee", 0, 0, false);
        System.out.println(d1);
        do{
                opcao = JOptionPane.showOptionDialog(
                null, //Componete (null para centralizar)
                "Painel de comando", // Mensagem
                "Drone Virtual", // Título
                JOptionPane.YES_NO_CANCEL_OPTION, //Tipo de opção
                JOptionPane.QUESTION_MESSAGE, //Tipo de ícone
                null, //Icone personalizado (null para padrão
                new String[] {"Decolar", "Frente", "Tras", "Esquerda", "Direita", "Pousar"}, //Opções
                "Decolar" //Texto do botão
        );

            switch (opcao) {
                case 0:
                    new Movimento(TipoMovimento.DECOLAR, LocalDateTime.now(), d1);
                    break;
                case 1:
                    new Movimento(TipoMovimento.FRENTE, LocalDateTime.now(), d1);
                    break;
                case 2:
                    new Movimento(TipoMovimento.TRAZ, LocalDateTime.now(), d1);
                    break;
                case 3:
                    new Movimento(TipoMovimento.ESQUERDA, LocalDateTime.now(), d1);
                    break;
                case 4:
                    new Movimento(TipoMovimento.DIREITA, LocalDateTime.now(), d1);
                    break;
                case 5:
                    new Movimento(TipoMovimento.POUSAR, LocalDateTime.now(), d1);
                    break;

            }
        }while(opcao >= 0);
        System.out.println(d1);
    }
}
