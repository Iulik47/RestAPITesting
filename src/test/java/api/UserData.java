package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserData {
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;


        public UserData() {}

    @JsonCreator
    public UserData(@JsonProperty("id") Integer id,
                    @JsonProperty("email") String email,
                    @JsonProperty("first_name") String first_name,
                    @JsonProperty("last_name") String last_name,
                    @JsonProperty("avatar") String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }

    public Comparable<String> Avatar() {
        return avatar;
    }

    public Object getId() {
        return id;
    }

    public String getAvatar() {
        return null;
    }
}
