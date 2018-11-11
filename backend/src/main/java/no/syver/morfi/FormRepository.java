package no.syver.morfi;

import org.springframework.data.jpa.repository.JpaRepository;

import no.syver.morfi.model.Form;

public interface FormRepository extends JpaRepository<Form, Long> {

}
