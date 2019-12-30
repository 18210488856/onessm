package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Product;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-dao.xml")
public class ProductDaoTest {


    @Autowired
    private  ProductDao productDao;

    @Test
    public void getProList() {
        List<Product> proList = productDao.getProList();
        for (Product product : proList) {
            System.out.println(product);
        }
    }
}