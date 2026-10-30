package padroescomportamentais.strategy;

public class Funcionario {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void adicionarBonus(float salarioBase, float bonus) {
        Calculadora calculadora = new Calculadora(salarioBase, bonus);
        this.salario = calculadora.calcular(new OperacaoSomar());
    }

    public void aplicarDesconto(float salarioBase, float desconto) {
        Calculadora calculadora = new Calculadora(salarioBase, desconto);
        this.salario = calculadora.calcular(new OperacaoSubtrair());
    }

    public void reajustarSalario(float salarioBase, float taxaReajuste) {
        Calculadora calculadora = new Calculadora(salarioBase, taxaReajuste);
        this.salario = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularValorHora(float salarioBase, float cargaHoraria) {
        Calculadora calculadora = new Calculadora(salarioBase, cargaHoraria);
        this.salario = calculadora.calcular(new OperacaoDividir());
    }

    public void calcularMediaSalarial(float salario1, float salario2) {
        Calculadora calculadora = new Calculadora(salario1, salario2);
        this.salario = calculadora.calcular(new OperacaoMedia());
    }
}
