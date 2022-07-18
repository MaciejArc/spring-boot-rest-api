package pl.nowak.springbykowski.controller;

import org.springframework.web.bind.annotation.*;
import pl.nowak.springbykowski.entity.Computer;
import pl.nowak.springbykowski.entity.ComputerDto;
import pl.nowak.springbykowski.service.ComputerService;

import java.util.List;

@RestController
public class ComputerController {

    private ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping("/computers")
    public List<Computer> getComputers(){
    return computerService.getComputers();
    }
    @GetMapping("/computers/{id}")
    public Computer getComputer(@PathVariable Long id){
        return computerService.getComputer(id);
    }
    @PostMapping("/computers")
    public Computer createComputer(@RequestBody ComputerDto computerDto){
        return computerService.createComputer(new Computer(
                null,
                computerDto.getProcessor(),
                computerDto.getMemoryType(),
                computerDto.getPrice()
        ));
    }
    @PutMapping("/computers/{id}")
    public Computer computer(@PathVariable Long id,@RequestBody ComputerDto computerDto){
        return computerService.updateComputer(new Computer(
                id,
                computerDto.getProcessor(),
                computerDto.getMemoryType(),
                computerDto.getPrice()
        ));

    }
    @DeleteMapping("/computers/{id}")
    public void deleteComputer(@PathVariable Long id){
        computerService.deleteComputer(id);
    }
}
