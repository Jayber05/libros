/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorlibro;

/**
 *
 * @author angel
 */
public class librosinvestigacion extends libro {
    private String facultad;    
    private double descuento, preciofinal; 

    public librosinvestigacion(String titulo, String autor, double precio, String facultad) {
        super(titulo, autor, precio);
        this.facultad=facultad;
    }
    public void obtenerfacultad(){
        this.facultad=facultad;
    }
    
    @Override
    void calcularprecio() {
        descuento=precio*0.25;
        preciofinal=precio-descuento;
    }
    
    public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nFacultad: "+facultad+"\nPrecio: "+precio+"\nPrecio total: "+preciofinal;
       
    }
}
