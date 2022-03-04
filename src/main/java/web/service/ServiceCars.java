package web.service;

import java.util.List;

public interface ServiceCars<T> {
    List<? extends T> getEntity(int quantity);
}
