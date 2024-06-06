package parcial2;
public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);
        Automovil automovil = new Automovil("Toyota", "Corolla", 2020, 4, TipoCombustible.GASOLINA);
        Motocicleta motocicleta = new Motocicleta("Yamaha", "YZF-R3", 2020, TipoMotocicleta.DEPORTIVA);

        System.out.println(vehiculo.imprimirInformacion());
        System.out.println(automovil.imprimirInformacion());
        System.out.println(motocicleta.imprimirInformacion());
    }
}

    

