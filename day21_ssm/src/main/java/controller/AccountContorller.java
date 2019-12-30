package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AccountService;

@Controller
public class AccountContorller {

    @Autowired
    private AccountService accountService;

    @RequestMapping("tranAccount.action")
    public String tranAccountCon(String inName,String outName,Double money){

        accountService.transferAccount(inName,outName,money);
        return "success";
    }

}
