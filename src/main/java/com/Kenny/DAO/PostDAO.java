package com.Kenny.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.Kenny.Entity.Post;
import org.springframework.stereotype.Repository;


@Repository
public class PostDAO {
    public static Map<Integer, Post> posts;

    static {
        posts = new HashMap<Integer, Post>(){
            {
                put(1, new Post(1, "Kenny" ,"Hello!", "Hello World!"));
                put(2, new Post(2, "Henry" ,"Hm...", "Spring Boot is amazing"));
                put(3, new Post(3, "Jessi" ,"Wow..", "This actually works"));
            }
        };
    }

    public Collection<Post> getAllPosts(){
        return this.posts.values();
    }

    public Post getPostById(int id){
        return this.posts.get(id);
    }

    public void deletePostById(int id) {
        this.posts.remove(id);
    }

    public void updatePost(Post post){
        Post update = posts.get(post.getId());
        update.setName(post.getName());
        update.setTitle(post.getTitle());
        update.setPost(post.getPost());
        posts.put(post.getId(), post);
    }

    public void addPost(Post post) {
        this.posts.put(post.getId(), post);
    }
}
