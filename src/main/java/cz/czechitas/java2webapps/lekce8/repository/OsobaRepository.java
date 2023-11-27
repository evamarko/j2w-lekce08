package cz.czechitas.java2webapps.lekce8.repository;

import cz.czechitas.java2webapps.lekce8.entity.Osoba;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//CrudRepository už je ve Springu
//Za CrudRepository:
//1. Třída která reprezentuje entitu
//2. Typ primárního klíče
//Toto zajistí propojení s databází a práci s ní
public interface OsobaRepository extends CrudRepository<Osoba, Long> {

}
