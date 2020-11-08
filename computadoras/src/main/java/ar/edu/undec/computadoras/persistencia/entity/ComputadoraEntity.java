package ar.edu.undec.computadoras.persistencia.entity;

import ar.edu.undec.computadoras.core.dominio.Computadora;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ComputadoraEntity {

    @Id
    private Integer idPC;

    private String codigo;
    private String nombre;
    private Integer almacenamiento;
    private String tipoDisco;
    private Integer tamañoRam;
    private String tipo;


}
