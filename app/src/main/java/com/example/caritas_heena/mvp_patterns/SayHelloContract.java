package com.example.caritas_heena.mvp_patterns;

/**
 * Created by Caritas-Heena on 08-08-2018.
 */

public interface SayHelloContract {

    /*Represent the view in MVP*/

    interface View{

        void ShowMessage(String message);

        void ShowError(String error);

    }

    /*Represent Presenter in MVP*/
    interface Presenter{

        void loadmessage();

        void saveName(String firstName, String lastName);
    }

}
