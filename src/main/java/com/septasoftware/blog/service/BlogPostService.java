package com.septasoftware.blog.service;

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
        // Return the BlogPost objects
        return blogPostRepository.findAll();
    }

    public Object createBlogPost(BlogPostDTO blogPostDTO) {
        // Create a new BlogPost object
        // BlogPost blog = new BlogPostDTO(null, null)
        BlogPost blogPost = new BlogPost();
        blogPost.setTitle(blogPostDTO.getTitle());
        blogPost.setContent(blogPostDTO.getContent());

        // Save the BlogPost object to the database and return it
        return blogPostRepository.save(blogPost);
    }

    public Object getBlogPost(Long postId) {
        // Get the BlogPost object from the database
        BlogPost blogPost = blogPostRepository.findById(postId).orElseThrow(() -> new RuntimeException("blog post with id " + postId + " not found"));

        // Return the BlogPost object
        return blogPost;
    }

    public Object updateBlogPost(Long postId, BlogPostDTO blogPostDTO) {
        // Get the BlogPost object from the database
        BlogPost blogPost = blogPostRepository.findById(postId).orElseThrow(() -> new RuntimeException("blog post with id " + postId + " not found"));

        // Update the BlogPost object
        blogPost.setTitle(blogPostDTO.getTitle());  
        blogPost.setContent(blogPostDTO.getContent());

        // Save the BlogPost object to the database and return it
        return blogPostRepository.save(blogPost);
    }
    
    public Object deleteBlogPost(Long postId) {
        // Get the BlogPost object from the database
        BlogPost blogPost = blogPostRepository.findById(postId).orElseThrow(() -> new RuntimeException("blog post with id " + postId + " not found"));

        // Delete the BlogPost object from the database
        blogPostRepository.delete(blogPost);

        // Return message to the user
        return "Post deleted successfully";
    }

}
