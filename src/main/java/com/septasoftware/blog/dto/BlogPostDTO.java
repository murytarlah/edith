package com.septasoftware.blog.dto;

import java.util.Date;
import lombok.*;

@Setter @Getter   
@AllArgsConstructor
public class BlogPostDTO {

    private Long postId;
    private String title;
    private String content;
    private Date createdAt;
    private Date updatedAt;

    // Constructors, getters, and setters

    // public BlogPostDTO() {
    // }

    // public BlogPostDTO(Long postId, String title, String content, LocalDateTime createdAt, String username) {
    //     this.postId = postId;
    //     this.title = title;
    //     this.content = content;
    //     this.createdAt = createdAt;
    //     this.username = username;
    // }

    // // Getters and setters

    // public Long getPostId() {
    //     return postId;
    // }

    // public void setPostId(Long postId) {
    //     this.postId = postId;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public String getContent() {
    //     return content;
    // }

    // public void setContent(String content) {
    //     this.content = content;
    // }

    // public LocalDateTime getCreatedAt() {
    //     return createdAt;
    // }

    // public void setCreatedAt(LocalDateTime createdAt) {
    //     this.createdAt = createdAt;
    // }

    // public String getUsername() {
    //     return username;
    // }

    // public void setUsername(String username) {
    //     this.username = username;
    // }
}

