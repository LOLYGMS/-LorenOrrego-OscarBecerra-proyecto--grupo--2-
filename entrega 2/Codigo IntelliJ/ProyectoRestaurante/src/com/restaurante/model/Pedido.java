package com.restaurante.model;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String idPedido;
    private List<ElementoMenu> items;

    public Pedido(String idPedido) {
        this.idPedido = idPedido;
        this.items = new ArrayList<>();
    }

    public void agregarItem(ElementoMenu item) { items.add(item); }

    // Nuevo: Método para eliminar el último item agregado
    public void eliminarUltimoItem() {
        if (!items.isEmpty()) {
            items.remove(items.size() - 1);
        }
    }

    public List<ElementoMenu> getItems() { return items; }
    public String getIdPedido() { return idPedido; }

    public double calcularTotal() {
        double total = 0;
        for (ElementoMenu item : items) { total += item.getPrecio(); }
        return total;
    }

    // Nuevo: Para resetear el pedido tras pagar
    public void vaciarPedido() { items.clear(); }
}