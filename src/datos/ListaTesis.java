/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import TListas.TLista;
import TListas.TListaDin;


public class ListaTesis {
   private static  TLista listaDin =  new TListaDin();
    
    public static TLista consultarLista(){
         return listaDin;
    }
    public static void agregar(Object tesis){
        listaDin.Adicionar(tesis);
    }
    
}
