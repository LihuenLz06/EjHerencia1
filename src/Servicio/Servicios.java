
package Servicio;

import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    List<Perro> listaPerros = new ArrayList();
    List<Gato> listaGatos = new ArrayList();
    List<Caballo> listaCaballos = new ArrayList();

    public void registrarAnimales() {
        int opcion;
        String continuar;
        do{
        System.out.println("Que animal desea registrar? 1-Perro, 2-Gato, 3-Caballo");
        opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    {
                        Perro perroAux = new Perro();
                        String respuesta;
                        perroAux.tipoAlimento();
                        do{
                            System.out.println("Ingrese el nombre del perro que desea registrar");
                            perroAux.setNombre(sc.next());
                            System.out.println("Ingrese el tipo de alimento que consume");
                            perroAux.setAlimento(sc.next());
                            System.out.println("Ingrese la edad del perro");
                            perroAux.setEdad(sc.nextInt());
                            System.out.println("Ingrese la raza");
                            perroAux.setRaza(sc.next());
                            listaPerros.add(perroAux);
                            System.out.println("Desea ingresar otro perro? S/N");
                            respuesta = sc.next();
                        }while(respuesta.equalsIgnoreCase("s"));
                        break;
                    }
                case 2:
                    {
                        Gato gatoAux = new Gato();
                        String respuesta;
                        gatoAux.tipoAlimento();
                        do{
                            System.out.println("Ingrese el nombre del gato que desea registrar");
                            gatoAux.setNombre(sc.next());
                            System.out.println("Ingrese el tipo de alimento que consume");
                            gatoAux.setAlimento(sc.next());
                            System.out.println("Ingrese la edad del gato");
                            gatoAux.setEdad(sc.nextInt());
                            System.out.println("Ingrese la raza");
                            gatoAux.setRaza(sc.next());
                            listaGatos.add(gatoAux);
                            System.out.println("Desea ingresar otro gato? S/N");
                            respuesta = sc.next();
                        }while(respuesta.equalsIgnoreCase("s"));
                        break;
                    }
                default:
                    {
                        Caballo caballoAux = new Caballo();
                        String respuesta;
                        caballoAux.tipoAlimento();
                        do{
                            System.out.println("Ingrese el nombre del caballo que desea registrar");
                            caballoAux.setNombre(sc.next());
                            System.out.println("Ingrese el tipo de alimento consume");
                            caballoAux.setAlimento(sc.next());
                            System.out.println("Ingrese la edad del caballo");
                            caballoAux.setEdad(sc.nextInt());
                            System.out.println("Ingrese la raza");
                            caballoAux.setRaza(sc.next());
                            listaCaballos.add(caballoAux);
                            System.out.println("Desea ingresar otro caballo? S/N");
                            respuesta = sc.next();
                        }while(respuesta.equalsIgnoreCase("s"));
                        break;
                    }
            }
        
            System.out.println("Desea cargar otro animal? S/N");
           continuar = sc.next();
           
        }while(continuar.equalsIgnoreCase("s"));
        
        if (continuar.equalsIgnoreCase("n")) {
            menu();
        }
    }
    
    public void mostrarRegistro(){
        int opcion;
        String consulta;
        do{
        System.out.println("Que Lista desea consultar? 1-Perro, 2-Gato, 3-Caballo");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                for (Perro listaP : listaPerros) {
                    System.out.println("Nombre: " + listaP.getNombre()  +
                            "//"+ "Alimentación: " + listaP.getAlimento()  + "//"+  "Edad: " + listaP.getEdad()  + "//"+  "Raza: " + listaP.getRaza());
                }   break;
            case 2:
                for (Gato listaG : listaGatos) {
                    System.out.println("Nombre: " + listaG.getNombre()  +
                            "//"+ "Alimentación: " + listaG.getAlimento()  + "//"+  "Edad: " + listaG.getEdad()  + "//"+  "Raza: " + listaG.getRaza());
                }   break;
            default:
                for (Caballo listaC : listaCaballos) {
                    System.out.println("Nombre: " + listaC.getNombre()  +
                            "//"+ "Alimentación: " + listaC.getAlimento()  + "//"+  "Edad: " + listaC.getEdad()  + "//"+  "Raza: " + listaC.getRaza());
                }   break;
        }
            System.out.println("Desea consultar otra lista?  S/N");
            consulta = sc.next();
        }while(consulta.equalsIgnoreCase("s"));
    }
    
  
    public void menu() {
        
        int opcion;
        
        do{
        System.out.println("------------Elija la opción deseada-------------");
        System.out.println("1- Registrar Animales: ");
        System.out.println("2- Mostrar Registro: ");
        System.out.println("3- Salir: ");
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1: 
                registrarAnimales();
                break;
            case 2:
                mostrarRegistro();
                break;
            case 3:
                break;
                    }
    }while(opcion != 3);
    }
    
    
    
    
    
}

    
