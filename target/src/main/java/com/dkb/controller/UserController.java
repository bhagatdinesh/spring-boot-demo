package com.dkb.controller;

import com.dkb.dao.PostDao;
import com.dkb.entity.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dinesh.bhagat on 30/04/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    PostDao postDaoImpl;

    @PostMapping("/post")
    public String create(@RequestBody String title) {
        Post post;
        try {
            post = new Post();
            post.setTitle(title);
            postDaoImpl.save(post);
        } catch (Exception e) {
            return "Error creating post : " + e.toString();
        }
        return "Post created successfully with Id : " + post.getId();
    }

    @GetMapping("/get")
    public String get() {
        Post post;
        try {
            post = new Post();
            postDaoImpl.count();
        } catch (Exception e) {
            return "Error creating post : " + e.toString();
        }
        return "Post created successfully with Id : " + post.getId();
    }
}
