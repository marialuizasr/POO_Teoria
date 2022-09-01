import java.util.Date;

public class Robo {

    private static long serialNumberGenerator;
    private long serialNumber;
    private Date dataCriacao;
    Corpo corpo;
    public Processador processador;

    public Robo(boolean temProcessador){
        this.dataCriacao = dataCriacao;
        serialNumberGenerator++;
        this.serialNumber = serialNumberGenerator;
        this.corpo = new Corpo();
        this.processador = new Processador();
    }

    public void mostraConfigRobo(){
        System.out.println("Numero serial: "+this.serialNumber);
        System.out.println("Data de criacao: "+this.dataCriacao);
    }
}
