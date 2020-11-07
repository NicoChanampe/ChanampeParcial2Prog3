package ar.edu.undec.computadoras.core.repositorio;

import ar.edu.undec.computadoras.core.dominio.Computadora;

public interface IComputadoraRepositorio {

   public boolean existeComputadora(String codigopc);

   public boolean guardarComputadora(Computadora miPC);
}
