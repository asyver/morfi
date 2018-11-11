package no.syver.morfi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import no.syver.morfi.model.Form;

public interface FormRepository extends JpaRepository<Form, Long> {

}
