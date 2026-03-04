package com.example.service;

import com.example.model.ContactForm;
import com.example.util.Logger;
import com.example.util.Validator;

public class ContactService {

    public void processForm(ContactForm form) {
        Logger.log("Validando formulario...");

        if (Validator.validateEmail(form.getEmail()) && Validator.validateName(form.getName())) {
            Logger.log("Email y nombre válidos!");
            Logger.log("Procesando formulario para: " + form.getName());
            Logger.log("Mensaje enviado a: " + form.getName().toUpperCase());
            Logger.log("Formulario procesado");
        } else {
            Logger.log("Nombre o email inválido! Vuelva a intentarlo.");
        }


    }
}