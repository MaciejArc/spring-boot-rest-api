package pl.nowak.springbykowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.nowak.springbykowski.entity.Computer;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
}
