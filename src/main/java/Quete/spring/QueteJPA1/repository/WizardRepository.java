package Quete.spring.QueteJPA1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quete.spring.QueteJPA1.Wizard;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {
}