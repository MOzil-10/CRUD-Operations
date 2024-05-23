package IDOL.CONSULTING.FIRM.CRUD_Operations.repository;

import IDOL.CONSULTING.FIRM.CRUD_Operations.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
