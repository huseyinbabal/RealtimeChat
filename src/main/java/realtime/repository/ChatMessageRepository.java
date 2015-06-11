package realtime.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import realtime.domain.ChatMessageModel;

import java.util.List;

/**
 * @author huseyinbabal
 */
public interface ChatMessageRepository extends MongoRepository<ChatMessageModel, String> {
    List<ChatMessageModel> findAllByOrderByCreateDateAsc();
}
