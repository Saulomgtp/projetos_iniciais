package entities;

public class FuncionariosTerceirizados extends Funcionarios {

    private Double despesaAdicional;

    public FuncionariosTerceirizados() {

    }


    public FuncionariosTerceirizados(String nomeFuncionario, Integer horasTrabalhadas, Double valorHora, Double despesaAdicional) {
        super(nomeFuncionario, horasTrabalhadas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento () {
        return (horasTrabalhadas * valorHora) + despesaAdicional * 1.1;
    }
}