package in.harsha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.harsha.entity.UserEntity;

public interface UserRepositiry extends JpaRepository<UserEntity,Integer> {

}
