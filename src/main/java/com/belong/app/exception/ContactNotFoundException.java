package com.belong.app.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Contact not found")
public class ContactNotFoundException extends RuntimeException{

}
