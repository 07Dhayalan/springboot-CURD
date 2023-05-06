package com.example.demo.userDAO;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.UserDAO;
import com.example.demo.dhaya;
@Controller
public class usercontroller
{
	@Autowired
	UserDAO dao;
           @RequestMapping("index")
           public String user()
           {
        	   return "index.jsp";
           }
           
           @RequestMapping("adduser")
           public String adduser(dhaya user)
           {
        	   dao.save(user);
        	   return "index.jsp";
           }
           @RequestMapping("getuser")
           public ModelAndView getuser(@RequestParam int id)
           {
        	   ModelAndView mav = new ModelAndView("showuser.jsp");
        	   dhaya user =dao.findById(id).orElse(new dhaya());
        	   mav.addObject(user);
        	   return mav;
           }
           @RequestMapping("deleteuser")
           public ModelAndView deleteuser(@RequestParam int id)
           {
        	   ModelAndView mav = new ModelAndView("deleteuser.jsp");
        	   dhaya user =dao.findById(id).orElse(new dhaya());
        	   dao.deleteById(id);
        	   mav.addObject(user);
        	   return mav;
           }
           @RequestMapping("updateuser")
           public ModelAndView updateuser(dhaya user)
           {
        	   ModelAndView mav = new ModelAndView("updateuser.jsp");
        	   dhaya user1 =dao.findById(user.getId()).orElse(new dhaya());
        	   dao.deleteById(user.getId());
        	   mav.addObject(user1);
        	   return mav;
           }
          
}

