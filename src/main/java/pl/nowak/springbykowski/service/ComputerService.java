package pl.nowak.springbykowski.service;

import org.springframework.context.annotation.Configuration;
import pl.nowak.springbykowski.entity.Computer;
import pl.nowak.springbykowski.repository.ComputerRepository;

import java.util.List;

@Configuration
public class ComputerService {
    private ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public List<Computer> getComputers() {
     return computerRepository.findAll();
    }

    public Computer createComputer(Computer computer) {
        return computerRepository.save(computer);
    }

    public Computer updateComputer(Computer computer) {
        return computerRepository.save(computer);
    }

    public void deleteComputer(Long id) {
        computerRepository.deleteById(id);
    }

    public Computer getComputer(Long id) {
        return computerRepository.findById(id).get();
    }
}
