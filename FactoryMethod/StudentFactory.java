package com.ace.factoryMethod;

/**
 * Created by awadha on 11/2/2016.
 */
public class StudentFactory {

    public Student createStudent(String city){
        Address address = null;
        Student student = null;
        if(city.equals("Gurgaon")){
            address = new Address();
            address.setCity("Gurgaon");
            student = new Student();
            student.setName("AJAY K");
            student.setId(1);
            student.setAddress(address);
        }else if(city.equals("Delhi")){
            address = new Address();
            address.setCity("Delhi");
            student = new Student();
            student.setName("Vijay K");
            student.setId(2);
            student.setAddress(address);
        }else{
            throw new IllegalArgumentException("Wrong input");
        }
        return student;
    }
}
