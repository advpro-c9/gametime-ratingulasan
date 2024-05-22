package com.c9.ratingdanulasan.service;

import com.c9.ratingdanulasan.model.Ulasan;
import com.c9.ratingdanulasan.repository.UlasanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class    UlasanService {
    private final UlasanRepository ulasanRepository;

    @Autowired
    public UlasanService(UlasanRepository ulasanRepository) {
        this.ulasanRepository = ulasanRepository;
    }

    public Ulasan saveUlasan(Ulasan ulasan) {
        return ulasanRepository.save(ulasan);
    }

    public List<Ulasan> findAllUlasan() {
        return ulasanRepository.findAll();
    }

    public Optional<Ulasan> findUlasanById(Long id) {
        return ulasanRepository.findById(id);
    }

    public Ulasan updateUlasan(Long id, Ulasan ulasanYangDiperbarui) {
        return ulasanRepository.update(id, ulasanYangDiperbarui);
    }

    public void deleteUlasan(Long id) {
        ulasanRepository.delete(id);
    }
}