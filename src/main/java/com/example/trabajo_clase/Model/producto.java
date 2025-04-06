package com.example.trabajo_clase.Model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;

    @ManyToMany(mappedBy = "productos")
    private Set<pedido> pedidos;

    public producto() {
    }

    public producto(Long id, String nombre, double precio, Set<pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.pedidos = pedidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Set<pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<pedido> pedidos) {
        this.pedidos = pedidos;
    }
}