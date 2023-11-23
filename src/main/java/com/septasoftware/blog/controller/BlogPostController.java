package com.septasoftware.blog.controller;

import com.septasoftware.blog.service.BlogPostService;
import org.springframework.web.bind.annotation.*;
import com.septasoftware.blog.dto.BlogPostDTO;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/blog-post")
public class BlogPostController {

    private final BlogPostService blogPostService;

    @PostMapping("/create")
    public Object createBlogPost(@RequestBody BlogPostDTO blogPostDTO) {
        return blogPostService.createBlogPost(blogPostDTO);
    }

    @GetMapping("/get-all")
    public Object getAllBlogPosts() {
        return blogPostService.getAllBlogPosts();
    }

    @GetMapping("/get/{postId}")
    public Object getBlogPost(@PathVariable Long postId) {
        return blogPostService.getBlogPost(postId);
    }

    @PutMapping("/update/{postId}")
    public Object updateBlogPost(@PathVariable Long postId, @RequestBody BlogPostDTO blogPostDTO) {
        return blogPostService.updateBlogPost(postId, blogPostDTO);
    }

    @DeleteMapping("/delete/{postId}")
    public Object deleteBlogPost(@PathVariable Long postId) {
        return blogPostService.deleteBlogPost(postId);
    }


    
}
