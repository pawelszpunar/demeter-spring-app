package com.pawelszpunar.module.blog;

import com.pawelszpunar.module.blog.menu.MenuDto;
import com.pawelszpunar.module.blog.menu.MenuService;
import com.pawelszpunar.module.post.PostDto;
import com.pawelszpunar.module.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogRestController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private PostService postService;
    // menu w formacie json
    @GetMapping("/api/blog/menu")
    public List<MenuDto> getMenu() {
        return menuService.getMenu();
    }
    // posty w formacie json
    @GetMapping("/api/blog/post")
    public List<PostDto> getPost() {
        return postService.getPosts();
    }
}
