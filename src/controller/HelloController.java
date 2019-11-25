package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;

import javax.servlet.http.HttpServletResponse;

//使用Component报错，原因可能是未配置视图解析器
@Controller
public class HelloController {

    @RequestMapping("/value")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest,javax.servlet.http.HttpServletResponse httpServletResponse)throws Exception{

       httpServletRequest.setAttribute("message","成功");
        return new ModelAndView("test1");
    }


//    @RequestMapping("/param")
//    public ModelAndView getParam(@RequestParam("username1") String username, @RequestParam("password1") String password){
////        System.out.println(request.getParameter("username"));
////        System.out.println(request.getParameter("password"));
////        String username=request.getParameter("username");
////        String password=request.getParameter("password");
//        System.out.println(username);
//        System.out.println(password);
//        return null;
//    }
    @RequestMapping("/param")
     public ModelAndView getParam(User user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return null;
     }

}