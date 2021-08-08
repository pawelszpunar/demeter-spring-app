package com.pawelszpunar.module.post;

import com.pawelszpunar.module.blog.menu.MenuDto;
import com.pawelszpunar.module.blog.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostRestController {

    @Autowired
    private PostService postService;

    // posty w formacie json
    @GetMapping("/api/blog/post")
    public List<PostDto> getPost() {
        return postService.getPosts();
    }

    /* todo sprawdzic czy jest wszystko */


}
