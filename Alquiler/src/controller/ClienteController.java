/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import model.Cliente;




/**
 *
 * @author Cetecom
 */
public class ClienteController {
    Conexion cx;

    public ClienteController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    
    
public void agregarCliente(int rut,String nombre,int num_contacto,String direccion,String tipo_cliente){
    String query = "INSERT INTO `cliente` (rut,nombre,num_contacto,direccion,tipo_cliente) VALUES (?,?,?,?,?)";
    
    try {
        PreparedStatement st = cx.getConnection().prepareStatement(query);
        st.setInt(1, rut);
        st.setString(2, nombre);
        st.setInt(3,num_contacto );
        st.setString(4,direccion );
        st.setString(5, tipo_cliente);
        st.executeUpdate();
        System.out.println("Usuario agregado ");        
    } catch (Exception e) {
        System.out.println("usuario ya existe");
    }
    
   
//public List<Cliente>obtenerCliente(int rut){
   // List<Cliente>clientes = new ArrayList<>();
    //String query = "SELEC * FROM CLIENTE WHERE rut="+rut+";";
    //try {
       // ResultSet rs = cx.EjecutarQuery(query);
       // while(rs.next()){
           // clientes.add(new Cliente(
           // rs.getInt("rut"),
           // rs.getString("nombre"),
            //rs.getInt("num_contacto"),
           // rs.getString("direccion"),
           // rs.getString("tipo_cliente")));
       // }
    //} catch (Exception e) {
        //System.out.println("Error obtenerCliente"+e.getMessage());
    //}
    
    
    
    //return clientes;
    
}

public void eliminarCliente(int rut){
    String query = "DELETE FROM CLIENTE WHERE rut="+rut+";";
    try {
        Cliente clien
    } catch (Exception e) {
    }
    
}
    
        
    
}
    
    
    
    
    
    
    
    
    
}
