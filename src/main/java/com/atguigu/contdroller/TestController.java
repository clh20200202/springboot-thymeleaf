package com.atguigu.contdroller;//package com.atguigu.contdroller;
//
//import com.atguigu.bean.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.*;
//
///**
// * @author clh
// * @description
// * @date
// */
//@Controller
////@RequestMapping("/hhh")
//public class TestController {
//    @RequestMapping("/domain")
//    public String domain(Model model){
//
//        String string= "今天天气很热！！！！ 好困";
//
//        model.addAttribute("s",string) ;
//        return "demo1";
//    }
//
//
//    @RequestMapping("/hello1")
//    public String hello1(Model model){
//        model.addAttribute("hello","hello welcome");
//
//        //集合数据
//        List<User> users = new ArrayList<User>();
//        users.add(new User(1001,"123","张三"));
//        users.add(new User(1002,"123","李四"));
//        users.add(new User(1003,"123","王五"));
//        model.addAttribute("users",users);
//        return "demo01";
//    }
//    @RequestMapping("/hello2")
//    public String hello2(Model model){
//        //Map定义
//        Map<String,Object> dataMap = new HashMap<String,Object>();
//        dataMap.put("No","123");
//        dataMap.put("address","深圳");
//        model.addAttribute("dataMap",dataMap);
//        return "demo01";
//    }
//    @RequestMapping("/hello4")
//    public String hello4(Model model){
//        //存储一个数组
//        String[] names = {"张三","李四","王五"};
//        model.addAttribute("names",names);
//        return "demo01";
//    }
//    @RequestMapping("/hello3")
//    public String hello3(Model model){
//        //日期
//        model.addAttribute("now",new Date());
//        return "demo01";
//    }
//}
//


import com.atguigu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

//@RestController
@Controller
public class TestController {

    @RequestMapping("/hhh")
    public String demo(Model model){

        System.out.println("ok...");

        model.addAttribute("hello","SpringBoot。。。");


        List<User> users = new ArrayList<User>();
        users.add(new User(1,"123","北京"));
        users.add(new User(2,"123","上海"));
        users.add(new User(3,"123","深圳"));
        model.addAttribute("users",users);

        //Map定义
        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("No","123");
        dataMap.put("address","深圳");
        model.addAttribute("dataMap",dataMap);

        //存储一个数组
        String[] names = {"张三","李四","王五"};
        model.addAttribute("names",names);

        //日期
        model.addAttribute("now",new Date());


        //if条件
        model.addAttribute("age",22);

        System.out.println("你好");
        System.out.println("你好");
        System.out.println("你好");

        return "demo01"; //视图解析
    }
}
