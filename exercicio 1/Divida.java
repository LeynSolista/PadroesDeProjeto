public class Divida{

    private double valorTotal;
    private double valorPago;
    private String nomeCredor;
    private String cnpjCredor;

    private void Divida(double _valorTotal, double _valorPago, String _nomeCredor, String _cnpjCredor ){
        valorTotal = _valorTotal;
        valorPago = _valorPago;
        nomeCredor = _nomeCredor;
        cnpjCredor = _cnpjCredor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getNomeCredor() {
        return nomeCredor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setNomeCredor(String nomeCredor) {
        this.nomeCredor = nomeCredor;
    }

    public void setCnpjCredor(String cpfCredor) {
        this.cnpjCredor = cpfCredor;
    }

}