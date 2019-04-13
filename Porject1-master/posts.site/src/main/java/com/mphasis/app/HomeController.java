package com.mphasis.app;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.PostDAOImpl;
import dao.UserDAOImpl;
import model.Comment;
import model.Post;
import model.User;
import dao.CommentDAOImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	PostDAOImpl postimpl = new PostDAOImpl();
	CommentDAOImpl comimp = new CommentDAOImpl();
	UserDAOImpl userimp1 = new UserDAOImpl();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "/resources/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("User_name")String User_name,@ModelAttribute("Password")String Password) {
	
		ModelAndView view1 = new ModelAndView("/resources/login");
		boolean res = userimp1.login(User_name, Password);
		return view1;

	}

//	@RequestMapping(value = "/user", method = RequestMethod.GET)
//	public ModelAndView user(@RequestParam(value = "userName") String userName) {
//		ModelAndView view = new ModelAndView("user");
//		view.addObject("userName", userName);
//		return view;
//	}

	@RequestMapping("/addpost")
	public ModelAndView addPost() {

		return new ModelAndView("add", "command", new Post());
	}

	// @RequestMapping(value = "/add", method = RequestMethod.GET)
	/*
	 * public ModelAndView addPost(@RequestParam(value = "title") String title,...)
	 * {
	 * 
	 * int res = impl.add(new Post(0,title,body));
	 * 
	 * String result = (res == 1) ? "post added" : "post couldn't be added";
	 * ModelAndView view = new ModelAndView("result");
	 * view.addObject("result",result); return view;
	 */

	@RequestMapping(value = "/AddPost", method = RequestMethod.POST)
	public ModelAndView addPost(@ModelAttribute("post") Post post) {
		System.out.println(post);
		ModelAndView view = new ModelAndView("result");

		int res = postimpl.insert(post);

		String result = (res == 1) ? "post added" : "post couldn't be added";

		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/DeletePost", method = RequestMethod.GET)
	public ModelAndView deletePost(@RequestParam(value = "id") int id) {

		int res = postimpl.delete(id);

		String result = (res == 1) ? "post deleted" : "post couldn't be deleted";

		ModelAndView view = new ModelAndView("result");
		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/ViewAllPosts", method = RequestMethod.GET)
	public ModelAndView viewPosts() {

		List<Post> list = null;
		try {
			list = postimpl.view();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("view_all");
		view.addObject("list", list);
		return view;
	}

	@RequestMapping("/AddComment")
	public ModelAndView addComment() {

		return new ModelAndView("add", "command", new Post());
	}

	@RequestMapping(value = "/AddComment", method = RequestMethod.POST)
	public ModelAndView addComment(@ModelAttribute("comment") Comment comment) {
		System.out.println(comment);
		ModelAndView view = new ModelAndView("/result");

		int res = comimp.insert(comment);

		String result = (res == 1) ? "comment added" : "comment couldn't be added";

		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/DeleteComment", method = RequestMethod.GET)
	public ModelAndView deleteComment(@RequestParam(value = "id") int id) {

		int res = comimp.delete(id);

		String result = (res == 1) ? "comment deleted" : "comment couldn't be deleted";

		ModelAndView view = new ModelAndView("result");
		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/ViewAllComments", method = RequestMethod.GET)
	public ModelAndView viewComment() {

		List<Comment> list = null;
		try {
			list = comimp.view();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("view_all");
		view.addObject("list", list);
		return view;
	}
	
	@RequestMapping(value = "/Signup", method = RequestMethod.POST)
	public ModelAndView signup(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView view = new ModelAndView("/result");

		boolean res = userimp1.signUp(user);

		String result = (res == true) ? "signup Sucess" : "Invalid signUp";

		view.addObject("result", result);
		return view;
	}
	
	
}