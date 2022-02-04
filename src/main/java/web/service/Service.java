package web.service;

import web.model.Car;

import java.util.List;

public interface Service<T> {
    List<? extends T> getEntity(int quantity);
}
