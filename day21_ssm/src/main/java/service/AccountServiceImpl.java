package service;

import dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//创建 类对象
@Service
public class AccountServiceImpl implements AccountService {

    //加载接口的动态代理对象
    @Autowired
    private AccountDao accountDao;

    //事务方法
    @Transactional
    public void transferAccount(String inName, String outName, Double money) {
        accountDao.inMoney(inName,money);
   //int i=1/0;
        accountDao.outMoney(outName,money);
    }
}
