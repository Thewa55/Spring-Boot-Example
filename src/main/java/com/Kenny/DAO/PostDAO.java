package com.Kenny.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.Kenny.Entity.Post;
public class PostDAO {
    public static Map<Integer, Post> posts;

    static {
        posts = new HashMap<Integer, Post>(){
            {
                put(1, new Post(1, "Kenny" ,"Hello!", "Hello World!"));
                put(2, new Post(2, "Henry" ,"Hm...", "Spring Boot is amazing"));
                put(3, new Post(3, "Jessi" ,"Wow..", "I'm a bitch"));
            }
        };
    }

    public Collection<Post> getAllPosts(){
        return this.posts.values();
    }
}
