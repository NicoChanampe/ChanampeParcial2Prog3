package ar.edu.undec.computadoras.core.dominio;

public class Computadora {

    private String codigo;
    private String nombre;
    private Integer almacenamiento;
    private String tipoDisco;
    private Integer tamañoRam;
    private String tipo;

    public static Computadora instancia(String codigo, String nombre, Integer almacenamiento, String tipoDisco, Integer tamañoRam, String tipo) {

        return new Computadora(codigo,nombre,almacenamiento,tipoDisco,tamañoRam,tipo);
    }

    private Computadora(String codigo, String nombre, Integer almacenamiento, String tipoDisco, Integer tamañoRam, String tipo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.almacenamiento = almacenamiento;
        this.tipoDisco = tipoDisco;
        this.tamañoRam = tamañoRam;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAlmacenamiento() {
        return almacenamiento;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public Integer getTamañoRam() {
        return tamañoRam;
    }

    public String getTipo() {
        return tipo;
    }
}
