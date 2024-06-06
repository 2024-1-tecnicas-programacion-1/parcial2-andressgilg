package parcial2;
public class Motocicleta extends Vehiculo {
    private final TipoMotocicleta tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", tipo de motocicleta: " + tipoMotocicleta;
    }    
  }

