package sr.rahhal.dev.adapters.mongodb.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import sr.rahhal.dev.adapters.mongodb.entities.TradeEntity;

public interface TradeRepository extends ReactiveMongoRepository<TradeEntity,String> {

}
