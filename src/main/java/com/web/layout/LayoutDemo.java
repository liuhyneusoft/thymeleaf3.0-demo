package com.web.layout;

import com.web.UserEntity;
import com.web.demo.DemoForm;
import com.web.demo.DemoGrid;
import com.web.demo.GridHeadSelected;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LayoutDemo {

    @RequestMapping("/layout")
    public String index(ModelMap map) {
        List<UserEntity> list = new ArrayList<>();
        map.addAttribute("host", "hello world");

        UserEntity u1 = new UserEntity(1,"zhangsan","aaaa","xx");
        UserEntity u2 = new UserEntity(2,"lisi","bbbb","yy");
        UserEntity u3 = new UserEntity(3,"wangwu","ccccc","zz");
        list.add(u1); list.add(u2); list.add(u3);
        map.addAttribute("userlist", list);
        map.addAttribute("user",new UserEntity());
        return "/layout/index";
    }

    @RequestMapping("/layout1")
    public String index1(ModelMap map) {
        map.addAttribute("aaa","xxx");
        return "/layout/index1";
    }

    @RequestMapping("/demo1")
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

        map.addAttribute("user",new UserEntity());//给dialog用

        return "/layout/demo1";
    }
}
