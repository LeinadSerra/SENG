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
public class Staff implements Serializable{ //Uses serializable to save objects in .dat files
    
private final String name;
private final int age;
private List<String> courses = new ArrayList<String>();
private int counter;

    public Staff(String name, int age, List<String> courses){
        this.name = name;
        this.age = age;
        this.courses = courses;
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
    
    public String getCourse(int index){
        return courses.get(index);        
    }
    
    public int getCoursesSize(){
        return courses.size();
    }
}
