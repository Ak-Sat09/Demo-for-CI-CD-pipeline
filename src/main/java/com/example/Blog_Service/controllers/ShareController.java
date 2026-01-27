package com.example.Blog_Service.controllers;

import com.example.Blog_Service.services.BlogServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Blog_Service.dto.BlogPublicResponse;
import com.example.Blog_Service.entity.Blog;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/share")
@RequiredArgsConstructor
public class ShareController {

    private final BlogServiceImpl blogService;

    @GetMapping("/blogs/{blogId}")
    public ResponseEntity<BlogPublicResponse> shareBlog(@PathVariable Long blogId) {

        Blog blog = blogService.getById(blogId);

        String shareUrl = "https://frontend-for-blog-app.vercel.app/" + blogId;

        BlogPublicResponse response = new BlogPublicResponse(
                blog.getId(),
                blog.getTitle(),
                blog.getContent(),
                blog.getAuthorId(),
                blog.getCreatedAt(),
                shareUrl
        );

        return ResponseEntity.ok(response);
    }
}
