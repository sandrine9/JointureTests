package org.example.infra;

import org.example.domaine.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdressRepo extends JpaRepository<Adress, Long> {
}
