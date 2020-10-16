package com.myproject.iot.repository;

import com.myproject.iot.domain.Device;
import com.myproject.iot.domain.Router;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RouterRepository extends JpaRepository<Router, Long> {
    List<Device> findAllByNameContains(String search);
}
