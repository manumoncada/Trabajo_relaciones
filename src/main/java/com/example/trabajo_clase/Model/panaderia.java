package com.example.trabajo_clase.Model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class panaderia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion Direccion;

    @OneToMany(mappedBy = "panaderia", cascade = CascadeType.ALL)
    private List<Empleado> empleados;

    public panaderia() {
    }

    public panaderia(Long id, String nombre, com.example.trabajo_clase.Model.Direccion direccion, List<Empleado> empleados) {
        this.id = id;
        this.nombre = nombre;
        Direccion = direccion;
        this.empleados = empleados;
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

    public Direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(Direccion direccion) {
        Direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}

