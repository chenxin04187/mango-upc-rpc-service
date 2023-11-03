package com.tobehonor.mangoupc.rpc.user.service;

import com.tobehonor.mangoupc.rpc.api.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserService implements IUserService {
    
    @Override
    public String sayHello() {
        return "hello";
    }
}
