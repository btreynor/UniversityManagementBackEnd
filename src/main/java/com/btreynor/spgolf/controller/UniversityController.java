package com.btreynor.spgolf.controller;

import com.btreynor.spgolf.exception.UniversityNotFoundException;
import com.btreynor.spgolf.model.University;

import com.btreynor.spgolf.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
public class UniversityController {

    @Autowired
    private UniversityRepository universityRepository;

    @PostMapping("/university")
    University newUniversity(@RequestBody University newUniversity) {
        return universityRepository.save(newUniversity);
    }

    @GetMapping("/universities")
    List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    @GetMapping("/university/{id}")
    University getUniversityById(@PathVariable Long id) {
        return universityRepository.findById(id)
                .orElseThrow(()-> new UniversityNotFoundException(id));
    }

    @PutMapping("/university/{id}")
    University updateUniversity(@RequestBody University newUniversity, @PathVariable Long id) {
        return universityRepository.findById(id)
                .map(university -> {
                    university.setUniversityName(newUniversity.getUniversityName());
                    university.setUniversityState(newUniversity.getUniversityState());
                    university.setUniversityMascot(newUniversity.getUniversityMascot());
                    university.setUniversityAddress(newUniversity.getUniversityAddress());
                    university.setUniversityAcceptanceRate(newUniversity.getUniversityAcceptanceRate());
                    return universityRepository.save(university);
                }).orElseThrow(() -> new UniversityNotFoundException(id));
    }

    @DeleteMapping("/university/{id}")
    String deleteUniversity(@PathVariable Long id) {
        if(!universityRepository.existsById(id)) {
            throw new UniversityNotFoundException(id);
        }
        universityRepository.deleteById(id);
        return "University with id: " + id + " has been deleted successfully.";
    }
}
