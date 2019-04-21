package ecjtu.zjf.takeoutapi;

import ecjtu.zjf.takeoutapi.entity.Saler;
import ecjtu.zjf.takeoutapi.mapper.SalerMapper;
import ecjtu.zjf.takeoutapi.service.ISalerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TakeoutApiApplicationTests {

    @Autowired
    SalerMapper salerMapper;

    @Test
    public void contextLoads() {
        Saler saler = new Saler();
        saler.setName("test1");
    }

}
