/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class FuncionesUsuario {

    public int CalcularImpuestos(Usuario u){
        int impuesto = 0;
        if(u.getEdad() < 18){
            impuesto = 0;
        }else if(u.getEdad() < 30){
             impuesto = 2000;
        }else if(u.getEdad() < 65){
            impuesto = 7000;
        }else if(u.getEdad() >= 65){
            impuesto = 2000;
        }
        int descuentoHijos = u.getCantHijos()*3;
        if(descuentoHijos > 50){
            descuentoHijos = 50;
        }
        impuesto = impuesto*(descuentoHijos/100);
        return impuesto;
    }
        public void CobroDeSueldo(Usuario u, int cantidadCobrar){
        int saldoActual = u.getSaldo();
        u.setSaldo(cantidadCobrar+saldoActual);
    }
}
