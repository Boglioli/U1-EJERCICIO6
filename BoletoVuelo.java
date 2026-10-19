public class BoletoVuelo {
    private String pasajero;
    private String destino;
    private double tarifaBase;
    private boolean llevaEquipajeExtra;
    public BoletoVuelo(String pasajero, String destino, double tarifaBase, boolean llevaEquipajeExtra) {
        this.pasajero = pasajero;
        this.destino = destino;
        this.tarifaBase = tarifaBase;
        this.llevaEquipajeExtra = llevaEquipajeExtra;
    }
    public String getPasajero() {
        return pasajero;
    }
    public String getDestino() {
        return destino;
    }
    public double getTarifaBase() {
        return tarifaBase;
    }
    public boolean isLlevaEquipajeExtra() {
        return llevaEquipajeExtra;
    }
    public double calcularPrecioFinal() {
        if (llevaEquipajeExtra) {
            return tarifaBase * 1.20;
        } else {
            return tarifaBase;
        }
    }
    }