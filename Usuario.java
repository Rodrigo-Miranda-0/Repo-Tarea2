/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Usuario {

        String nombre;
        String cedula;
        int contrase�a;
        int edad;
        int cantHijos;
        int saldo = 0;
           public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public String getNombre(){
        return nombre;
    }   
    public void setCedula(String unaCedula){
        cedula = unaCedula;
    }
    public String getCedula(){
        return cedula;
    }
    public void setContrase�a(int unaContrase�a){
        contrase�a = unaContrase�a;
    }
    public int getContrase�a(){
        return contrase�a;
    }
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    public int getEdad(){
        return edad;
    }
    public void setCantidadHijos(int unaCantHijos){
        cantHijos = unaCantHijos;
    }
    public int getCantidadHijos(){
        return cantHijos;
    }
    public void setSaldo(int unSaldo){
        saldo = unSaldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public Usuario(){
        this.setNombre("");
        this.setCedula("");
        this.setContrase�a(0);
        this.setEdad(0);
        this.setCantidadHijos(0);
        this.setSaldo(0);
    }
    public void AgregarUsuario(String nombre,String cedula,int contrase�a,int edad,int cantHijos){
        this.setNombre(nombre);
        this.setCedula(cedula);
        this.setContrase�a(contrase�a);
        this.setEdad(edad);
        this.setCantidadHijos(cantHijos);
        this.setSaldo(0);
    }
        @Override
    public boolean equals(Object obj){
        return this.getCedula().equalsIgnoreCase(((Usuario)obj).getCedula());
    }
}

