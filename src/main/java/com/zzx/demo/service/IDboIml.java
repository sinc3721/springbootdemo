package com.zzx.demo.service;

import com.zzx.demo.mapper.AccountMapper;
import com.zzx.demo.model.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.service
 * @date 2017/12/21 17:28
 */
@Service
public class IDboIml implements IDbo {
    @Resource
    private AccountMapper accountMapper;


    @Override
    public Account test() {
        return accountMapper.selectByPrimaryKey(1);
    }
}
