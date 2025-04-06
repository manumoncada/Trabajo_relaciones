package com.example.trabajo_clase.Model;
import jakarta.persistence.*;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String puesto;

    @ManyToOne
    @JoinColumn(name = "panaderia_id")
    private com.example.trabajo_clase.Model.panaderia panaderia;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String puesto, com.example.trabajo_clase.Model.panaderia panaderia) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.panaderia = panaderia;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public panaderia getPanaderia() {
        return panaderia;
    }

    public void setPanaderia(panaderia panaderia) {
        this.panaderia = panaderia;
    }
}