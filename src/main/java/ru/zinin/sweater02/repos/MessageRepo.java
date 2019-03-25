package ru.zinin.sweater02.repos;

import org.springframework.data.repository.CrudRepository;
import ru.zinin.sweater02.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
