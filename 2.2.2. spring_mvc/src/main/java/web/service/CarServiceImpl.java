package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service //без аннотации не видит bean
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;
    @Transactional
    @Override
    public void add(Car car) {
        carDao.add(car);

    }

    @Transactional(readOnly = true)
    @Override
    public List listCarByCriteria() {
        return carDao.listCarsByCriteria();
    }
}
