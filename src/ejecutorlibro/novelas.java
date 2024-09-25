/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorlibro;

/**
 *
 * @author angel
 */
public class novelas extends libro{
    private String genero;    
    private double descuento, preciofinal; 

    public novelas(String titulo, String autor, double precio, String genero) {
        super(titulo, autor, precio);
        this.genero=genero;
    }
    public void obtenergenero(){
        this.genero=genero;
    }
    @Override
    void calcularprecio() {
        descuento=precio*0.15;
        preciofinal=precio-descuento;
    }
    
     public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nPrecio: "+precio+"\nPrecio total: "+preciofinal;
       
    }
}
