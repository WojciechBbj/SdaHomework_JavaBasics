package softwareTest;

import OOP_Excercises.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDetailsTest {

    @Test
    void thasIsChildReturnsTrueForAChild() {
        PersonDetails personDetails = new PersonDetails("Miłosz", "Miły", 6);
        Assertions.assertThat(personDetails.isChild());
    }
}