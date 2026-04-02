package builder;

public class User {
    private final String id;
    private final String name;
    private final String email;

    public String getName() {
        return name;
    }

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.email = userBuilder.email;
    }

    //new User.UserBuilder.builder().setId(id).setName(name).build();

    public static class UserBuilder {
        private String id;
        private String name;
        private String email;

        public UserBuilder() {

        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }
        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
