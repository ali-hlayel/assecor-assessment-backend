package de.assecor.services;

import de.assecor.constant.ColorEntryEnum;
import de.assecor.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {

    List<Person> findByColor(ColorEntryEnum colorEntryEnum);
}