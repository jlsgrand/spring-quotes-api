package co.simplon.springquotesapi.repository;

import co.simplon.springquotesapi.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

}
