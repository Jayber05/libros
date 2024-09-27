/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorlibro;

/**
 *
 * @author angel
 */
public class librosdetexto extends libro {
    private String curso;    
    private double descuento, preciofinal; 

    public librosdetexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso=curso;
    }
    public void obtenercurso(){
        this.curso=curso;
    }
    
    @Override
    void calcularprecio() {
        descuento=precio*0.4;
        preciofinal=precio-descuento;
    }
    
     public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nCurso: "+curso+"\nPrecio: "+precio+"\nPrecio total: "+preciofinal;
       
    }
}
