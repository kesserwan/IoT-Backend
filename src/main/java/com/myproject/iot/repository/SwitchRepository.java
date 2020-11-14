package com.myproject.iot.repository;

import com.myproject.iot.domain.Switch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SwitchRepository extends JpaRepository<Switch, Long> {

}
