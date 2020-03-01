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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ListOfStaff {
    
    private List<Staff> staff = new ArrayList<Staff>();
   // private int counter;
    
    public ListOfStaff(){
        
    }
    
    public void addStaff(Staff staff){
        this.staff.add(staff);
       // counter++;
    }
    
    public void makeFile(){
        try{
            ObjectOutputStream staff_list = new ObjectOutputStream(new FileOutputStream("stafflist.txt"));
            staff_list.writeObject(staff);
            staff_list.close();
        }
        catch(Exception e){
            System.out.println("No file created");
        }
    }
    
    public void getStaff(){
        try{
            
            ObjectInputStream saved_list = new ObjectInputStream(new FileInputStream("stafflist.txt"));
            ArrayList<Staff> staff_list = (ArrayList<Staff>) saved_list.readObject();
            saved_list.close();
            
            }    
        catch(Exception e){
            System.out.println(e);
            
        }
        

    }
    public void print(){
        System.out.println(staff.get(0).getName());
    }
    
    
}
