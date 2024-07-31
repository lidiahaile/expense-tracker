public interface UserService {
    User registerUser(User user);
    User findByUsername(String username);
}
