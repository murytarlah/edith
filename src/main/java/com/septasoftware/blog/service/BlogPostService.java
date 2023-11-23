package com.septasoftware.blog.service;

import java.util.Date;
import org.springframework.stereotype.Service;
import com.septasoftware.blog.repository.BlogPostRepository;
import com.septasoftware.blog.model.BlogPost;
import com.septasoftware.blog.dto.BlogPostDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;


    public Object getAllBlogPosts() {
        // Get all BlogPost objects from the database
        Iterable<BlogPost> blogPosts = blogPostRepository.findAll();
        // Return the BlogPost objects
        return blogPosts;
    }

    public Object createBlogPost(BlogPostDTO blogPostDTO) {
        // Create a new BlogPost object
        BlogPost blogPost = new BlogPost();
        blogPost.setTitle(blogPostDTO.getTitle());
        blogPost.setContent(blogPostDTO.getContent());
        blogPost.setCreatedAt(new Date());
        blogPost.setUpdatedAt(new Date());
        // Save the BlogPost object to the database
        blogPostRepository.save(blogPost);
        // Return the BlogPost object
        return blogPost;
    }

    public Object getBlogPost(Long postId) {
        // Get the BlogPost object from the database
        BlogPost blogPost = blogPostRepository.findById(postId).orElse(null);
        // Return the BlogPost object
        return blogPost;
    }

    public Object updateBlogPost(Long postId, BlogPostDTO blogPostDTO) {
        // Get the BlogPost object from the database
        BlogPost blogPost = blogPostRepository.findById(postId).orElse(null);
        // Update the BlogPost object
        blogPost.setTitle(blogPostDTO.getTitle());  
        blogPost.setContent(blogPostDTO.getContent());
        blogPost.setUpdatedAt(new Date());
        // Save the BlogPost object to the database
        blogPostRepository.save(blogPost);
        // Return the BlogPost object
        return blogPost;
    }
    
    public Object deleteBlogPost(Long postId) {
        // Get the BlogPost object from the database
        BlogPost blogPost = blogPostRepository.findById(postId).orElse(null);
        // Delete the BlogPost object from the database
        blogPostRepository.delete(blogPost);
        // Return the BlogPost object
        return blogPost;
    }

}
