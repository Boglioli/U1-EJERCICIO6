public class Main {
    public static void main(String[] args) {
        BoletoVuelo boleto1 = new BoletoVuelo("Juan", "Buenos Aires", 50000.0, true);
        BoletoVuelo boleto2 = new BoletoVuelo("María", "Buenos Aires", 50000.0, false);
        System.out.println("pasajero: " + boleto1.getPasajero());
        System.out.println("precio con equipaje extra: $ " + boleto1.calcularPrecioFinal());
        System.out.println();
        System.out.println("pasajero: " + boleto2.getPasajero());
        System.out.println("precio sin equipaje extra: $ " + boleto2.calcularPrecioFinal());
    }
}

