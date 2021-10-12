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
public interface VacInterface {
    public void inqueue(int key,Object Element);
    public int size();
    public boolean isEmpty();
    public Object rqueue();
    public String PrintPQ();
}
