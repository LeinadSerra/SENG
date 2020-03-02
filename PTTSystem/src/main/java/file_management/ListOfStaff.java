/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_management;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Daniel
 */
public class ListOfStaff extends AbstractListModel implements Serializable{

   
    
    private List<Staff> staff = new ArrayList<Staff>();
   // private int counter;
    
    public ListOfStaff(){
        
    }
    
    public ListOfStaff(List<Staff> staff){
        this.staff = staff;
    }
    
    public Object getElementAt(int index){
        Staff s = staff.get(index);
        return s.getName();
    }
    
    public void addStaff(Staff staff){
        this.staff.add(staff);
       // counter++;
    }
    
    public void  makeFile(){
        try{
            ObjectOutputStream staff_list = new ObjectOutputStream(new FileOutputStream("stafflist.txt"));
            staff_list.writeObject(staff);
            staff_list.close();
        }
        catch(Exception e){
            System.out.println("No file created");
        }
    }
    
    public static List<Staff> getStaff(){
        List<Staff> staff_list = new ArrayList<Staff>();
        
        try{
            
            ObjectInputStream saved_list = new ObjectInputStream(new FileInputStream("stafflist.txt"));
            staff_list = (ArrayList<Staff>) saved_list.readObject();
            saved_list.close();
            
            }    
        catch(Exception e){
            System.out.println(e);
            
        }
        
        return staff_list;
    }
    public void print(){
        System.out.println(staff.get(0).getName());
    }
    
    public int getSize(){
        return staff.size();
    }
    
}
