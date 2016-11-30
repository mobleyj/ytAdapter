/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author baske
 */
public class ytAdapter implements SocialMediaEntry {
    
    private YouTubeVideo video;
    private String user;
    private String postText;
    
    public ytAdapter(YouTubeVideo video) {
        this.video = video;
        setUser();
        setPostText();
    }
    
    public void setUser(){
        this.user = video.getAuthor();
    }
    
    public void setPostText() {
        
        this.postText = video.getTitle() + ": " + video.getDescription();
        
    }
    
    public String getUser(){
        return user;
    }
    public String getPostText() {
        return postText;
    }
    
}
