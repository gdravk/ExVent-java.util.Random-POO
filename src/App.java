public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***************\n");
        Ventilador ventilador1 = new Ventilador();
        ventilador1.marca = "Mondial";
        ventilador1.cor = "Preto";
        ventilador1.ligado = false;
        ventilador1.velocidades = 3;
        ventilador1.voltagem = 220; 
        ventilador1.estaCalor = false;

        ventilador1.estaCalorHoje();
        ventilador1.exibir();
        ventilador1.ligarAutomatico();

    }
}
