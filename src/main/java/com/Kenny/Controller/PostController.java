package com.Kenny.Controller;

import com.Kenny.Entity.Post;
import com.Kenny.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post getPostById(@PathVariable("id") int id){
        return postService.getPostById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePostById(@PathVariable("id") int id){
        postService.deletePostById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deletePostById(@RequestBody Post post){
        postService.updatePost(post);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }
}
