package pl.rutkowski.addaccounttodatabase;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepo extends CrudRepository<User, Long> {


}
