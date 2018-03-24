
package escribe_y_lee_archivos;



 public class Direccion {

 private String calle;
 private int cp;
 private String Provincia;
 private int numero;
 
 
 
 public Direccion(){

  
 }

 
 public Direccion (String calle, int numero,int cp, String Provincia){
	 this.calle=calle;
	 this.numero=numero;
	 this.cp=cp;
	 this.Provincia=Provincia;

  

   }

    public String getCalle() {

       return calle;
    }
    public void setCalle(String calle) {
       this.calle = calle;

    }

    public int getCp() {
    	return cp;

   }

    public void setCp(int cp) {

      this.cp = cp;
   }

   public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {

        Provincia = provincia;

    }

    public int getNumero() {

        return numero;

    }

    public void setNumero(int numero) {

        this.numero = numero;
   }

}


