/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.*;
/**
 *
 * @author callum_snow
 */
public  class VacPriorityQ implements VacInterface {
    
    private  ArrayList<VacPQElement> VacPQ;
    
    public VacPriorityQ(){
        VacPQ = new ArrayList<VacPQElement>();
    }
    
    public boolean isEmpty(){
        return VacPQ.isEmpty();
    }
    
    public int size(){
        return VacPQ.size();
    }
    
    private int searchPosition (int newKey){
        boolean confirmed;
        VacPQElement Vac;
        int location;
        confirmed=false;
        location=0;
        while(location<VacPQ.size() && !confirmed){
            Vac = VacPQ.get(location);
            if(Vac.getKey()>newKey)
                location = location +1;
            else
            {
                confirmed = true;
            }
        }
        return location;
    }
    
   
    
    
    public void inqueue (int PKey, Object item){
        int index;
        VacPQElement vac = new VacPQElement(PKey,(VacRecipient)item);
        
        index = searchPosition(PKey);
        
        if(index ==size())
            VacPQ.add(vac);
        else
            VacPQ.add(index,vac);
    }
    
    
    public Object rqueue(){
        return VacPQ.remove(0);
    }
    
    public String PrintPQ(){
        
    String print = new String();
    VacPQElement Vac;
    for (int i=0; i < VacPQ.size();i++){
        Vac = VacPQ.get(i);
        print = print.concat(Vac.printrecipientInfo()+"" +"Priority: "+Vac.getKey()+"\n");
    }
    return print;
}
    
}
