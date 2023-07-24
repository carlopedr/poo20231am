package ExcepcionesPropias;

public class PruebaCoche {

    public static void main(String[] args) throws ExcesoVelocidadException {
        Coche c = new Coche("OPEL", "INSIGNIA");
        try{
            c.acelerar(100);
        }
        catch (ExcesoVelocidadException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c.toString());
    }
}
