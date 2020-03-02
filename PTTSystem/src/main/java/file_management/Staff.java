/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_management;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Daniel
 */
public class Staff extends AbstractListModel implements Serializable{ //Uses serializable to save objects in .dat files
    
private final String name;
private final String gender;
private final int age;
private final int number;
private List<String> courses = new ArrayList<String>();
private int counter;

    public Staff(String name, int age, String gender, int number){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.number = number;
    }
    
    
    public Staff(String name, int age){
        this.name = name;
        this.age = age;
        this.gender = null;
        this.number = 0;
    }
    
    public void addCourse(String course){
        courses.add(counter, course);
        counter++;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String getCourse(int index){
        return courses.get(index);        
    }
    
    public int getCoursesSize(){
        return courses.size();
    }
    
    public String getGender(){
        return gender;
    }
    
    @Override
    public Object getElementAt(int index){
        String c = courses.get(index);
        return c;
    }
    
    @Override
    public int getSize(){
        return courses.size();
    }
}
