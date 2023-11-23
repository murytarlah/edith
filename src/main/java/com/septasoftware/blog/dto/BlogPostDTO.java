package com.septasoftware.blog.dto;

import lombok.*;

@Setter @Getter   
@AllArgsConstructor
public class BlogPostDTO {

    // private Long postId;
    private final String title;
    private final String content;
}

