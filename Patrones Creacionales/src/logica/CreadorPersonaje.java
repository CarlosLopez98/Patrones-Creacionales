/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Carlos
 */
public class CreadorPersonaje {

    private Agente miAgente;
    private Duende miDuende;
    
    public CreadorPersonaje(){
        miAgente = new Agente();
        miDuende = new Duende();
    }
    
    public Personaje retrieveAnimal(String tipoPersonaje) {
        if ("Agente".equals(tipoPersonaje)) {
            return (Personaje) miAgente.clone();
        } else if ("Duende".equals(tipoPersonaje)) {
            return (Personaje) miDuende.clone();
        } // if	

        return null;
    } // method retrieveAnimal
}
