/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import TListas.TListaDin;
import datos.ListaTesis;

public class Tesis {
    //calificacion 0 = regular , 1 = buena , 2= muy buena , 3 , excelente
    private String area,anio_sustentacion;
    private String nombres[] = new String[2];
    private int nPaginas,calificacion;
    public Tesis(String[] nombres, String area, String anio_sustentacion, int nPaginas, int calificacion) {
        this.nombres = nombres;
        this.area = area;
        this.anio_sustentacion = anio_sustentacion;
        this.nPaginas = nPaginas;
        this.calificacion = calificacion;
    }

    public String[] getNombres() {
        return nombres;
    }

   
    public String getArea() {
        return area;
    }

    public String getAnio_sustentacion() {
        return anio_sustentacion;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public int getCalificacion() {
        return calificacion;
    }
   //mostrar las tesis cuyo año de sustentacion se encuentra entre dos valores ingresados
    public static TListas.TLista mostrarTesisxAño(int menor , int mayor){
     TListas.TListaDin listaFiltrada = new TListaDin();
     TListas.TLista tesis = ListaTesis.consultarLista();
        for (int i = 0; i < tesis.Cantidad(); i++) {
            Tesis  objTesis = (Tesis) tesis.Obtener(i);
            int anio =  Integer.parseInt(objTesis.getAnio_sustentacion());
           if( anio > menor&& anio  < mayor ){
              
              listaFiltrada.Adicionar(objTesis);
           }
        }
      
        return  listaFiltrada;
    }
    
}
