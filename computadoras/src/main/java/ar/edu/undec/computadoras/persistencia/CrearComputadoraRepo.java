package ar.edu.undec.computadoras.persistencia;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.repositorio.IComputadoraRepositorio;

public class CrearComputadoraRepo implements IComputadoraRepositorio {

    @Override
    public boolean existeComputadora(String codigopc) {
        return false;
    }

    @Override
    public boolean guardarComputadora(Computadora miPC) {
        return false;
    }
}
