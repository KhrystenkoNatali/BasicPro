package app.service;

import app.model.Person;

public interface PersonToStringFunction<T>{
    T apply(Person person);
}
