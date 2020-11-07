package ar.edu.undec.computadoras.core.usecase;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exception.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.repositorio.IComputadoraRepositorio;

public class CrearComputadoraUseCase {

    private IComputadoraRepositorio iCompuRepo;

    public CrearComputadoraUseCase(IComputadoraRepositorio iCompuRepo){
        this.iCompuRepo = iCompuRepo;
    }

    public boolean crearComputadora(Computadora miPC)throws ComputadoraExisteException{

        if(estalaComputadora(miPC.getCodigo()))
            throw new ComputadoraExisteException("La compu ya esta cargada en el sistema");


        return iCompuRepo.guardarComputadora(miPC);
    }

    private boolean estalaComputadora(String codigopc) {
        boolean pcEsta = iCompuRepo.existeComputadora(codigopc);

        return pcEsta;
    }
}
