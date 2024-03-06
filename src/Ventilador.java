import java.util.Random;

public class Ventilador {
        String marca;
        String cor;
        Boolean ligado;
        int velocidades;
        int voltagem;
        boolean estaCalor;

        public int estaCalorHoje(){
            Random calor = new Random();
            //começa sempre no 0 então foi colocado +1 pra começar em 1 e no nextint colocado 4 pra limitar de 1 a 4, onde 1 e nao esta calor e 4 e o calor maximo
            int calorAleatorio1a4 = 1 + calor.nextInt(4);
            System.out.println(" Nivel de calor : " + calorAleatorio1a4);
            
            //muda a variavel estaCalor
            if (calorAleatorio1a4 != 1){
                estaCalor = true;
            } else {
                estaCalor = false;
            }
            
            return calorAleatorio1a4;
        }

        public void exibir(){
            System.out.println("\n Marca do ventilador: " + marca + "\n Cor: " + cor + "\n O ventilador esta ligado ? " + ligado + "\n Quantas velocidades o ventilador tem ? " + velocidades + "\n Qual a voltagem do ventilador ? " + voltagem );

            if (estaCalor == true ) {
            System.out.println("\n \n Hoje esta calor ? Sim ");
            } else {
            System.out.println("\n \n Hoje esta calor ? Nao ");
            }

        }

        public void ligarAutomatico(){

            int calorDoLigarAutomatico = estaCalorHoje();
            switch (calorDoLigarAutomatico){
                case 2:
                System.out.println(" O ventilador foi ligado na velocidade " + calorDoLigarAutomatico);
                break;
                case 3:
                System.out.println(" O ventilador foi ligado na velocidade " + calorDoLigarAutomatico);
                break;
                case 4:
                System.out.println(" O ventilador foi ligado na velocidade " + calorDoLigarAutomatico);
                break;
                default:
                System.out.println(" O ventilador nao foi ligado, pois nao esta calor");
                break;
            }
        }
}
