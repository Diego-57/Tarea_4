public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
/**Metodo constructor*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**Metodo para devolver el estado/saldo de la cuenta*/
    public double estado()
    {
        return saldo;
    }
/**Metodo para ingresar en la cuenta*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**Metodo para retirar de la cuenta*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
/**Getter del nombre*/
    public String getNombre() {
        return nombre;
    }
/**Getter de la cuenta*/
    public String getCuenta() {
        return cuenta;
    }
/**Getter del saldo*/
    public double getSaldo() {
        return saldo;
    }
/**Getter del tipo de interes*/
    public double getTipoInterés() {
        return tipoInterés;
    }
/**Setter del nombre*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**Setter de la cuenta*/
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/**Setter del saldo*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**Setter del tipo de interes*/
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
