package entities;

import java.math.BigDecimal;

public class ItemContrato {

	private int idItem;
    private int idContrato;
    private String descricaoItem;
    private int quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;
	public ItemContrato(int idItem, int idContrato, String descricaoItem, int quantidade, BigDecimal valorUnitario,
			BigDecimal valorTotal) {
		this.idItem = idItem;
		this.idContrato = idContrato;
		this.descricaoItem = descricaoItem;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
	}
	public ItemContrato() {
		// TODO Auto-generated constructor stub
	}
	public int getIdItem() {
		return idItem;
	}
	public int getIdContrato() {
		return idContrato;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

    
	
}
