package cuentas;
/**
 * Clase que representa una cuenta bancaria
 */
public class CCuenta {


    private String nombre;// Nombre del titular
    private String cuenta;// Numero de cuenta
    private double saldo;// Saldo de la cuenta
    private double tipoInterés;// Tipo de interes 

    /**
     * Constructor de la clase cuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parametros 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    // Getters para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    // Setters para modificar los atributos
    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setCuenta(String cue) {
        cuenta = cue;
    }

    public void setSaldo(double sal) {
        saldo = sal;
    }

    public void setTipoInterés(double tipo) {
        tipoInterés = tipo;
    }
    
    /**
     * Devuelve el saldo de la cuenta
     * @return
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa dinero en la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira dinero de la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}