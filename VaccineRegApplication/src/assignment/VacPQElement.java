/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author callum_snow
 */
public class VacPQElement {
    private int key;
    private VacRecipient element;
    
    public VacPQElement(int VacP, VacRecipient V) {
        key = VacP;
        element = V;
    
}

    public int getKey() {
        return key;
    }

    public void setKey(int val) {
       key = val;
    }

    public VacRecipient getElement() {
        return element;
    }

    public void setElement(VacRecipient p) {
        element = p;
    }
    
    public String printrecipientInfo(){
        String print;
        print = "\n"+"Name of Recipient: "+element.getr_name()+"\n "+"Age of Recipient: "+element.getr_Age()+"\n"+
                "Does the Recipient have a Medical Condition: "+element.getM_Conditions()+"\n";
        return print;
              
    }
    
    
    
    
    
    
    
    
    
    
    
}
