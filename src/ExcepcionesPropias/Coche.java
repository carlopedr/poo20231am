package ExcepcionesPropias;

public class Coche {

    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int cuanto) throws ExcesoVelocidadException {
        this.velocidad = this.velocidad + cuanto;
        if(this.velocidad>120){
            this.velocidad = 120;
            ExcesoVelocidadException miError = new ExcesoVelocidadException();
            throw miError;
        }
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + '}';
    }

    
    
    
}
