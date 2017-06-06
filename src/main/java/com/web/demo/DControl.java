package com.web.demo;

import com.web.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhaiyang on 2017/6/6.
 */
@Controller
public class DControl {

    @RequestMapping("/demo")
    public String hello(ModelMap map) {
        List<DemoGrid> list = new ArrayList<>();
        list.add(new DemoGrid("$400","Guarantee Bonus","All Dams with......"));
        list.add(new DemoGrid("$500","Good Job Bonus","You booked more than 50 deals ....."));
        list.add(new DemoGrid("$450","Producing Dealers Bonus","DAMs with 10-12 prodcing"));
        map.addAttribute("asslist", list);

        map.addAttribute("demoForms",
                new DemoForm("Yu Chen","Dealer Account Manager","xx@163.com",
                "DAM 4500","01/01/2007","Active",3,1,2));

        map.addAttribute("headSelected",new GridHeadSelected());
        return "demo";
    }

    @RequestMapping("/index")
    public String ds(ModelMap map) {
        map.addAttribute("user",new UserEntity(1,"zhangsan","aaaa","xx"));
        return "dashboard";
    }

}
