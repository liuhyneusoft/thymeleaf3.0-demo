package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Controller
public class HelloController {

    List<UserEntity> list = new ArrayList<>();

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(path = "/hehe", method = RequestMethod.GET)
    public String ggeg(){
        return "fragmenttemp/fragt";
    }

    @RequestMapping("/test")
    public String dddd(ModelMap map) {
        map.addAttribute("user",new UserEntity());
        return "index1";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "hello world");

        UserEntity u1 = new UserEntity(1,"zhangsan","aaaa","xx");
        UserEntity u2 = new UserEntity(2,"lisi","bbbb","yy");
        UserEntity u3 = new UserEntity(3,"wangwu","ccccc","zz");
        list.add(u1); list.add(u2); list.add(u3);
        map.addAttribute("userlist", list);
        map.addAttribute("user",new UserEntity());
        return "index";
    }

    @RequestMapping("/jq/{x}")
    @ResponseBody
    public String indexx(@PathVariable(value = "x") String str, ModelMap map) {
        map.addAttribute("host", str);
        //return "index1";
        return str;
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
      public String test( @ModelAttribute(value="user") UserEntity user,ModelMap map) {
        UserEntity u4 = new UserEntity(44,user.getUsername(),user.getPassword(),"zz");
        list.add(u4);
        map.addAttribute("userlist", list);
        map.addAttribute("MSG", "啊添加成功");
        return "index";
    }


    @RequestMapping(path = "/add1", method = RequestMethod.POST)
    public ModelAndView doAdd(@Valid @ModelAttribute(value="user") UserEntity user, BindingResult result){
        ModelAndView model = new ModelAndView();

        if(result.hasErrors()){
            List<ObjectError> listError = result.getAllErrors();
            StringBuffer bufferError = new StringBuffer();
            listError.forEach((ObjectError v)->bufferError.append(v.getDefaultMessage()));
            model.addObject("MSG", "出错啦！"+bufferError.toString());
        }else{
            model.addObject("MSG", "提交成功！");
        }

        model.setViewName("index1");
        model.getModelMap().addAttribute("user", user);
        return model;
    }


    @RequestMapping("/international")
    public String international() {
        return "international";
    }

    @RequestMapping("/forms")
    public String ff(ModelMap map) {
        map.addAttribute("user", new FormsD());
        List<SelectItem> courseType  = new ArrayList<>();
        courseType.add(new SelectItem("s1","ss1"));
        courseType.add(new SelectItem("s2", "ss2"));
        map.addAttribute("formsD", new FormsD());
        map.addAttribute("courseType", courseType);
        map.addAttribute("ajtest", new User("aa","bb","cc"));
        return "formsdemo";
    }

    @RequestMapping(path = "/add2", method = RequestMethod.POST)
    public String doAdd(@Valid @ModelAttribute(value="formsD") FormsD formsD, BindingResult result,ModelMap map){

        map.addAttribute("user", new FormsD());
        List<SelectItem> courseType  = new ArrayList<>();
        courseType.add(new SelectItem("s1","ss1"));
        courseType.add(new SelectItem("s2", "ss2"));
        map.addAttribute("formsD", new FormsD());
        map.addAttribute("courseType", courseType);
        return "formsdemo";
    }
    @RequestMapping(path = "/fragement", method = RequestMethod.GET)
    public String fragement(){
        return "fragement";
    }

    @RequestMapping(path = "/fragement1", method = RequestMethod.GET)
    public String fragement1(){
        return "fragement1";
    }

    @RequestMapping(path = "/tools", method = RequestMethod.GET)
    public String tools(ModelMap map){
        map.addAttribute("today", Calendar.getInstance());
        map.addAttribute("today1", new Date());
        List<String> l = new ArrayList<>();
        l.add("dd");l.add("ggg");
        map.addAttribute("listparam", l);
        return "tools";
    }



}

