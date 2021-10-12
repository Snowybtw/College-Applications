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
public class VacRecipient {
    private String r_name;
    private int r_Age;
    private String m_Conditions;
    private int Priority;

   
    
    public VacRecipient(){
        r_name = new String();
        m_Conditions = new String();
       
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    
    
    
    

  

    public String getr_name() {
        return r_name;
    }

    public void setr_name(String rn) {
        this.r_name = rn;
    }

    public int getr_Age() {
        return r_Age;
    }

    public void setr_Age(int ra) {
        this.r_Age = ra;
    }

    public String getM_Conditions() {
        return m_Conditions;
    }

    public void setM_Conditions(String m_Conditions) {
        this.m_Conditions = m_Conditions;
    }
    
    
    
    
}
