package com.patrones.patrones.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class NotificacionAspecto {

    @After("@annotation(Notificacion)")
    public void enviarNotificacion() {

               System.out.println("@@@@@@@@@@@@@@@@");
    }

}
