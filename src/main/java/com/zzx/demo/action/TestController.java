package com.zzx.demo.action;

import com.zzx.demo.model.Account;
import com.zzx.demo.service.IDbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.action
 * @date 2017/12/26 11:49
 */
@Controller
//@RequestMapping(value = "/user")
public class TestController {
    @Autowired
    IDbo dbo;

    @Autowired
    Account account;

    @RequestMapping(value = "/test")
    @ResponseBody
    private String test(ModelMap map){

        Account accountt = dbo.test();

        map.put("name",11);

        return "123456";

    }

}
