public class Computador {
    public String marca;
    public float preco;
    public MemoriaUSB memoriaUSB;
    public HardwareBasico[] hardwareBasico;
    public SistemaOperacional sistemaOperacional;
    public Cliente cliente = new Cliente();

    public Computador(){
        this.sistemaOperacional = new SistemaOperacional();
        this.hardwareBasico = new HardwareBasico[3];
    }

    public Computador(String marca, float preco, MemoriaUSB memoriaUSB, HardwareBasico[] hardwareBasico, SistemaOperacional sistemaOperacional){
        this.marca = marca;
        this.preco = preco;
        this.memoriaUSB = memoriaUSB;
        this.hardwareBasico = hardwareBasico;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void mostraPCConfigs(){
        System.out.println("Configuracoes do Computador:");
        System.out.println("Marca: "+this.marca);
        System.out.println("Preco: "+this.preco);
        System.out.println("Memoria USB:");
        System.out.println("Nome: "+this.memoriaUSB.nome);
        System.out.println("Capacidade: "+this.memoriaUSB.capacidade);
        for (int i = 0; i < this.hardwareBasico.length; i++) {
            if (this.hardwareBasico[i] != null){
                System.out.println("Hardware Basico:");
                System.out.println("Nome: "+this.hardwareBasico[i].nome);
                System.out.println("Capacidade: "+this.hardwareBasico[i].capacidade);
            }
        }
        System.out.println("Sistema Operacional:");
        System.out.println("Nome: "+this.sistemaOperacional.nome);
        System.out.println("Tipo: "+this.sistemaOperacional.tipo);
        System.out.println();
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB){

    }
}
