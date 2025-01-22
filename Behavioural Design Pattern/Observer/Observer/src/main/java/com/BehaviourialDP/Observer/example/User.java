package com.BehaviourialDP.Observer.example;

//Concrete Observer
public class User implements Observer {

    private String article;
    private Subject blog;

    @Override
    public void update() {
        System.out.println("State change reported by Subject.");
        article = (String) blog.getUpdate();
    }

    @Override
    public void setSubject(Subject blog) {
        this.blog = blog;
        article = "No New Article!";
    }

    public String getArticle() {
        return article;
    }
}
