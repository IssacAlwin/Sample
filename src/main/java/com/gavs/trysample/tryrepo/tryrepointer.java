package com.gavs.trysample.tryrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gavs.trysample.tryentity.tryent;

@Repository
public interface tryrepointer extends JpaRepository<tryent, Integer> {

}
