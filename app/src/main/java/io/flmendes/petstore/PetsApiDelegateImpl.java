import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.flmendes.petstore.api.PetsApiDelegate;
import io.flmendes.petstore.model.Pet;

import java.util.List;

@Service
public class PetsApiDelegateImpl implements PetsApiDelegate {

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {
        var pet1 = new Pet().id(1L).name("Lilica").tag("dog");
        var pet2 = new Pet().id(2L).name("Marujo").tag("cat");
        var pet3 = new Pet().id(3L).name("Benji").tag("dog");
        List<Pet> pets = List.of(pet1, pet2, pet3);
        return ResponseEntity.ok(pets);
    }
}
