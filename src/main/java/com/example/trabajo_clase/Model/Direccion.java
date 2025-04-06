package com.example.trabajo_clase.Model;
import jakarta.persistence.*;

@Entity
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;
    private String ciudad;

    @OneToOne(mappedBy = "direccion")
    private com.example.trabajo_clase.Model.panaderia panaderia;

    public Direccion() {
    }

    public Direccion(Long id, String calle, String ciudad, com.example.trabajo_clase.Model.panaderia panaderia) {
        this.id = id;
        this.calle = calle;
        this.ciudad = ciudad;
        this.panaderia = panaderia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public panaderia getPanaderia() {
        return panaderia;
    }

    public void setPanaderia(panaderia panaderia) {
        this.panaderia = panaderia;
    }
}
