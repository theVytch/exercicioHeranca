package entidade;

public class FuncionarioTerceirizado extends Funcionario {

    private Double despesaAdicinal;

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicinal) {
        super(nome, horas, valorPorHora);
        this.despesaAdicinal = despesaAdicinal;
    }

    public Double getDespesaAdicinal() {
        return despesaAdicinal;
    }

    public void setDespesaAdicinal(Double despesaAdicinal) {
        this.despesaAdicinal = despesaAdicinal;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + despesaAdicinal * 1.1;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", horas=" + getHoras() +
                ", valorPorHora=" + getValorPorHora() +
                "despesaAdicinal=" + despesaAdicinal +
                '}';
    }
}
