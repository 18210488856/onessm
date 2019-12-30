package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//加载 dao,service两个配置文件
@ContextConfiguration("classpath:spring/application-*.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void transferAccount() {
        accountService.transferAccount("aaa","bbb",100d);
    }
}