package Myapp.movie;

import java.io.Serializable;

public class ItemScfi implements Serializable {
     int image;
     String name;
     String detail;
     String video;


    public ItemScfi(int image, String name,String detail,String video) {
        this.image = image;
        this.name = name;
        this.detail = detail;
        this.video = video;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}