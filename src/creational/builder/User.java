package creational.builder;


//Entity class used to construct DTO
public class User {

    private final String username;
    private final String password;
    private final String avatar;
    private final String tagline;
    private final String themeSong;

    public static class Builder {
        private final String username;
        private final String password;
        private String avatar = "Default Avatar";
        private String tagline = "Let's play!";
        private String themeSong = "Default Theme Song";

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder avatar(String value) {
            avatar = value;
            return this;
        }

        public Builder tagline(String value) {
            tagline = value;
            return this;
        }

        public Builder themeSong(String value) {
            themeSong = value;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        username = builder.username;
        password = builder.password;
        avatar = builder.avatar;
        tagline = builder.tagline;
        themeSong = builder.themeSong;
    }
}
