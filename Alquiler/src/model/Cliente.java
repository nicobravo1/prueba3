/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private int rut,num_contacto;
    private String nombre,direccion,tipo_cliente;

    public Cliente() {
    }

    public Cliente(int rut, int num_contacto, String nombre, String direccion, String tipo_cliente) {
        this.rut = rut;
        this.num_contacto = num_contacto;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo_cliente = tipo_cliente;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getNum_contacto() {
        return num_contacto;
    }

    public void setNum_contacto(int num_contacto) {
        this.num_contacto = num_contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", num_contacto=" + num_contacto + ", nombre=" + nombre + ", direccion=" + direccion + ", tipo_cliente=" + tipo_cliente + '}';
    }
    

   
    
    
    
}
