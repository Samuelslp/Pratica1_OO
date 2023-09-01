public class Main {
    public static void main(String[] args) {
        EmpregadoDaFaculdade professor = new EmpregadoDaFaculdade();
        professor.nome = "João";
        professor.salario = 3000;
        professor.horasAula = 20;

        double gastos = professor.getGastos();
        System.out.println("Gastos: R$" + gastos);

        String info = professor.getInfo();
        System.out.println(info);
    }
}
