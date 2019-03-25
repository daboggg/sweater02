package ru.zinin.sweater02.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zinin.sweater02.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
