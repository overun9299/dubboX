package overun.Controller;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import overun.service.UserService;


/**
 * Created by ZhangPY on 2019/1/17
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 */

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/ss")
    public void test() {
        System.out.println(123);
    }

    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }


}
