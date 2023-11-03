package com.tobehonor.mangoupc.rpc.user.consumer;

import com.tobehonor.mangoupc.rpc.api.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserServiceConsumer {
    
    @DubboReference
    private IUserService userService;
    
    public String sayHello() {
        return userService.sayHello();
    }
}
