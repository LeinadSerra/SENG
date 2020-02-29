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
public class ListOfTraining {
    
    private List<TrainingRequest> training_list = new ArrayList<TrainingRequest>();
    
    public ListOfTraining(){
        
    }
    
    public void addTraining(TrainingRequest trequest){
        training_list.add(trequest);
       // counter++;
    }
    
    public void makeFile(){
        try{
            ObjectOutputStream staff_list = new ObjectOutputStream(new FileOutputStream("trequest.txt"));
            staff_list.writeObject(training_list);
            staff_list.close();
        }
        catch(Exception e){
            System.out.println("No file created");
        }
    }
    
    public void getTrainingList(){
        try{
            
            ObjectInputStream saved_list = new ObjectInputStream(new FileInputStream("trequest.txt"));
            ArrayList<TrainingRequest> training_list = (ArrayList<TrainingRequest>) saved_list.readObject();
            saved_list.close();
            
            }    
        catch(Exception e){
            System.out.println(e);
            
        }
        

    }
    public void print(int index){
        System.out.println(training_list.get(index).getStaff().getName());
    }
    
    
}
