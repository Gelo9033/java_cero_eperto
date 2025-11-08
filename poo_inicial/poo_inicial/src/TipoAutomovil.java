public enum TipoAutomovil {
    SEDAN ("Sedan", "Automóvil pequeño", 4),
    HATCHBACK( "Hatchback", "Automóvil compacto", 4),
    CAMIONETA( "Camioneta", "Automóvil grande", 4),
    CONVERTIBLE( "Convertible", "Automóvil deportivo", 2),
    CAMION( "Camión", "Vehículo de carga", 2);

    private final String tipo;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAutomovil(String tipo, String descripcion, int numeroPuertas) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipo() {
        return tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    

}
