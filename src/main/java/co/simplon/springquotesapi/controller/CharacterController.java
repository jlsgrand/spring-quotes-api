package co.simplon.springquotesapi.controller;

import co.simplon.springquotesapi.model.Character;
import co.simplon.springquotesapi.repository.CharacterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    private CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    @PostMapping
    public void createCharacter(@RequestBody Character character) {
        characterRepository.save(character);
    }
}
