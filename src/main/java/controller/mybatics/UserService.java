package controller.mybatics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public int insertNew(String name) {
        return userDao.insertNew(name);
    }

    /**
     *   @Autowired
     *     private HappinessDao happinessDao;
     *
     *     public Happiness selectService(String city){
     *         return happinessDao.findHappinessByCity(city);
     *     }
     *
     *     @Transactional
     *     public void insertService(){
     *         happinessDao.insertHappiness("西安", 9421);
     *         int a = 1 / 0; //模拟故障
     *         happinessDao.insertHappiness("长安", 1294);
     *     }
     */
}