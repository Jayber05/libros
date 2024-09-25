/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorlibro;

/**
 *
 * @author angel
 */
abstract class libro {
    protected String titulo, autor;
    protected double precio;
    
    public libro(String titulo, String autor, double precio){
        this.titulo=titulo;
        this.autor=autor;
        this.precio=precio;
    }
    public void obtenerTitulo(){
     this.titulo=titulo;
}
    public void obtenerAutor(){
        this.autor=autor;
    }
    public void obtenerPrecio(){
         this.precio=precio;
    }
    
    abstract void calcularprecio();
    
    public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nPrecio: "+precio;
       
    }
}
