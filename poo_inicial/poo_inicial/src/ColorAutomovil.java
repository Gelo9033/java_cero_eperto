public enum ColorAutomovil {
    ROJO ("Rojo"),
    AZUL ("Azul"),
    VERDE ("Verde"),
    BLANCO ("Blanco");

    private final String color;

    ColorAutomovil(String color) {
        this.color = color;
    }
   
    @Override
    public String toString() {
    return this.color;
    }



}
