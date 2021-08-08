package com.pawelszpunar.module.blog;

import com.pawelszpunar.module.blog.menu.MenuService;
import com.pawelszpunar.module.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogWebController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private PostService postService;

    @GetMapping("/blog")
    public String getBlog(Model model) {
        model.addAttribute("menuItems", menuService.getMenu());
        model.addAttribute("menuSubItems", menuService.getSubMenu());
        model.addAttribute("posts", postService.getPosts());
        return "blog/index.html";
    }

}