
package Entidades;


public class Caballo extends Animal {

    @Override
    public void tipoAlimento() {
        System.out.println("La alimentación base del caballo es de: alfalfa, aunque tambien es recoemdable una dieta balanceada alternando zanahorias, manzana, y otros pastos tiernos.");
    }

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
