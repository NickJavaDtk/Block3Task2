package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

    public Cat(@JsonProperty("id") String id, @JsonProperty("text") String text, @JsonProperty("type") String type,
               @JsonProperty("user") String user, @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("upvotes")
    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }
}
