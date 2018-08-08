package com.example.caritas_heena.mvp_patterns;

/**
 * Created by Caritas-Heena on 08-08-2018.
 */

public class Person {
    private String mFirstName;
    private String mLastName;
    private String name;

    public Person(){

    }

    public Person(String firstName,String lastName){
        mFirstName=firstName;
        mLastName=lastName;

    }
    public String getFirstname(){
        return mFirstName;
    }

    public String getLastName(){
        return mLastName;
    }

    public void setFirstname(String firstname){
        this.mFirstName = firstname;
    }

    public  void setLastName(String lastName){ this.mLastName=lastName;
    }

    public String getName() {
        return mFirstName + " " + mLastName;
    }
}

