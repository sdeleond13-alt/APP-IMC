package appimc;
import java.time.LocalDate;
import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Sussan
 * Sussan Patricia de Le[on de Le[on
 */
public class Main {
    
    private static ArrayList<Persona>ListaPersonas=new ArrayList();
    private static Scanner entrada=new Scanner(System.in);
    
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int opcion=0;
      
    
         
         
        //MENU PRINCIPAL
       do{
            System.out.println("Sistema de Evaluacion IMC");
            System.out.println("----------------------------");
            System.out.println("1. Registrar Persona ");
            System.out.println("2. Mostrar personas registradas ");
            System.out.println("3. Buscar persona por nombre ");
            System.out.println("4. Salir ");
            System.out.println("Ingrese numero de opcion ");
            try{
                opcion=Integer.parseInt(entrada.nextLine());
            }catch (NumberFormatException e){
                opcion=0;
            }
            switch(opcion){
                case 1: registrarPersona();
                break;
                case 2: mostrarPersonas();
                break;
                case 3: buscarPersona();
                break;
                case 4: System.out.println("presione una tecla para salir..");
                break;
                default: System.out.println("Ingrese una opcion valida");
                break;
            }//cierre del switch
        }while (opcion !=4);//finaliza ciclo do while
    }
    private static void buscarPersona() {
        System.out.print("Ingrese el nombre a buscar: ");
        String busqueda = entrada.nextLine();
        boolean encontrado = false;
        

        for (Persona p : ListaPersonas) {
            if (p.getNombreCompleto().equalsIgnoreCase(busqueda)) {
                p.mostrarDatos();
                encontrado = true;
           
            }
        }
    }
    private static void mostrarPersonas() {
        if (ListaPersonas.isEmpty()) {
            System.out.println("Base Vacia");
            return;
        }else{
            for (Persona persona : ListaPersonas) {//el for recorre la lista Lsita persona por medio del constructor Persona de la clase
                persona.mostrarDatos();
            }
        
        }
        
        
        
    }
    public static void registrarPersona(){
        
        Persona p2= new Persona();
        int total = ListaPersonas.size();
       
        System.out.println("");
        System.out.println("Ingrese nombre");
        p2.setNombreCompleto(entrada.nextLine());
        
        System.out.println("Ingrese el dia de nacimiento");
        int dia = entrada.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = entrada.nextInt();
        System.out.println("Ingrese el year de nacimiento");
        int year = entrada.nextInt();
        LocalDate fecha= LocalDate.of(year, mes, dia);
        p2.setFechaNacimiento(fecha);
        System.out.println("Ingrese el peso");
        p2.setPeso(entrada.nextDouble());
        System.out.println("Ingrese la altura");
        p2.setAltura(entrada.nextDouble());
        System.out.println("Ingrese la direccion");
        p2.setDireccion(entrada.nextLine());
        p2.setDireccion(entrada.nextLine());
        
        System.out.println("Ingrese la telefono");
        p2.setTelefono(entrada.nextLine());
        System.out.println("Ingrese la Correo");
        p2.setCorreo(entrada.nextLine());
        ListaPersonas.add(p2);
        System.out.println(total);
        System.out.println("_____________________");

    
    

    
    

    }
    
    
}