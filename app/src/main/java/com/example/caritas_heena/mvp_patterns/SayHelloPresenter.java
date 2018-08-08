package com.example.caritas_heena.mvp_patterns;

/**
 * Created by Caritas-Heena on 08-08-2018.
 */

public class SayHelloPresenter  implements SayHelloContract.Presenter {

    private  Person person;
    private SayHelloContract.View mView;

    public SayHelloPresenter(SayHelloContract.View view){

        person = new Person();
        mView = view;
    }

    @Override
    public void loadmessage() {

        if(person.getFirstname()==null && person.getLastName()==null){
            mView.ShowError("No person found");
            return;
        }

        String message="Hi " + person.getName();
        mView.ShowMessage(message);

    }

    @Override
    public void saveName(String firstName, String lastName) {

        person.setFirstname(firstName);
        person.setLastName(lastName);
    }
}
