/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_management;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class TrainingRequest implements Serializable{
    
    private Staff staff;
    private List<String> courses = new ArrayList<String>();
    
    public void MakeRequest(Staff staff, ArrayList<String> courses){
        this.staff = staff;
        this.courses  = courses;
    }
    
    public Staff getStaff(){
        return staff;
    }
    
    public List<String> getTraining(){
        return courses;
    }
    
}
