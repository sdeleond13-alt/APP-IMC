
package modelo;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Sussu
 * Sussan Patricia de Le[on de Le[on
 */
public class Persona {
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private double peso;
    private double altura;
    private String direccion;
    private String telefono;
    private String correo;
    
    public Persona(){//probar instancia
        //al hacer este metodo sin isntancias me permite crear el constructor sin necesidad de colocar parametros para poder buscar una funcion en especifico, por lo que ya no tengo que crear variables
    }
    
    public Persona(String nombreCompleto, LocalDate fechaNacimiento, double peso, double altura, String direccion, String telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
    public int calcularEdad(){
       if (fechaNacimiento==null) {
           return 0;
       }
       LocalDate fechaActual=LocalDate.now();
       return Period.between(fechaNacimiento, fechaActual).getYears();
   }
    
    public boolean esMayorEdad(){
       if (calcularEdad()>=18){
           return true;
       }else{
           return false;
       }
   }
    
   public double calcularIMC(){
       if (altura<=0) {
           return 0.0;
           
       }
       return peso/(altura*altura);
   }
   
   public String clasificarIMC(){
       double imc=calcularIMC();
       if (imc<18.5 && imc>0) {
           return "Bajo peso";
       }else if (imc>=18.5 && imc<=24.9) {
           return "Normal";
       }else if (imc>=25.0 && imc <=29.9) {
           return"Sobrepeso";
       }else if(imc>30){
           return "Obesidad";
       }else{
           return "error de IMC";
       }
    }
    
   public void mostrarDatos(){
       System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
       System.out.println("Nombre: "+nombreCompleto);
       System.out.println("Fecha de Nacimiento: "+fechaNacimiento + "("+calcularEdad()+" anios)");
       System.out.println("Peso: "+peso+"kg");
       System.out.println("Altura: "+altura+"m");
       System.out.println("IMC:"+String.format("%2f", calcularIMC()));
       System.out.println("Clasificacion IMC: " +clasificarIMC());
       System.out.println("Direccion: "+direccion);
       System.out.println("Telefono: "+telefono);
       System.out.println("Correo: "+correo);
       System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
       System.out.println("                                                                ");
   } 
   
   public void registarPersona(String nombreCompleto, LocalDate fechaNacimiento, double peso, double altura, String direccion, String telefono, String correo){
            System.out.println("Ingrese el nombre");
            setNombreCompleto(nombreCompleto);
    

    }
   
   
   
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
    
}