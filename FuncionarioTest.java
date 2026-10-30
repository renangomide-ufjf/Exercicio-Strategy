package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveAdicionarBonusSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.adicionarBonus(2000.0f, 500.0f);
        assertEquals(2500.0f, funcionario.getSalario());
    }

    @Test
    void deveAplicarDescontoSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.aplicarDesconto(2500.0f, 300.0f);
        assertEquals(2200.0f, funcionario.getSalario());
    }

    @Test
    void deveReajustarSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.reajustarSalario(2000.0f, 1.1f);
        assertEquals(2200.0f, funcionario.getSalario(), 0.01f);
    }

    @Test
    void deveCalcularValorHoraFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.calcularValorHora(3200.0f, 160.0f);
        assertEquals(20.0f, funcionario.getSalario());
    }

    @Test
    void naoDeveCalcularValorHoraFuncionarioDivisaoPorZero() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.calcularValorHora(3200.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaSalarialFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.calcularMediaSalarial(3000.0f, 4000.0f);
        assertEquals(3500.0f, funcionario.getSalario());
    }
}
