class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos() {
        return this.salario + (this.horasAula * 40);
    }

    String getInfo() {
        return "Nome: " + this.nome + ", com salário: R$" + (this.salario + (this.horasAula * 40));
    }


}
