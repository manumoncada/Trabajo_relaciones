package com.example.trabajo_clase.Model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fecha;

    @ManyToMany
    @JoinTable(
            name = "pedido_producto",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private Set<producto> productos;

    public pedido() {
    }

    public pedido(Long id, String fecha, Set<producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.productos = productos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Set<producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<producto> productos) {
        this.productos = productos;
    }
}

