package overun.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import overun.service.UserService;

/**
 * Created by ZhangPY on 2019/1/15
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "overun";
    }
}
