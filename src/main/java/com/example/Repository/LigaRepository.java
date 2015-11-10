package com.example.Repository;

import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {

    public Liga findByNombre(String nombre);


}
