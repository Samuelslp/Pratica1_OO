import java.util.Date;

public class Transacao {
    private Carro carro;
    private Cliente cliente;
    private Date data;
    private double valor;

    public Transacao(Carro carro, Cliente cliente, Date data, double valor) {
        this.carro = carro;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
    }


}

