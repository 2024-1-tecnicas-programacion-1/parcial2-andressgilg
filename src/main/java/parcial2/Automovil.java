package parcial2;
public class Automovil extends Vehiculo {
    private final int numeroPuertas;
    private final TipoCombustible tipoCombustible;

    public Automovil(String marca, String modelo, int año, int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + numeroPuertas + " puertas, combustión a " + tipoCombustible;
    }
}



