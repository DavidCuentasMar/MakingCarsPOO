package poo;
public class POO {
    public static void main(String[] args) {
        Carro c1 = new Carro(4,"Gris","Land Rover");
        System.out.println("Marca del carro: "+c1.marca);
        System.out.println("Color: " + c1.color);
        
        Carro c2 = new Carro(4,"Red", "Tesla");               
        System.out.println("Marca del carro: " + c2.marca);
        System.out.println("Color: " + c2.color);
        
        
        
    }
}

