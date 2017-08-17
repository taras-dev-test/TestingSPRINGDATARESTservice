package com.taraspringrest.my;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by admin on 16.08.2017.
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "fighters", path = "fighters")
public interface FighterRepository extends PagingAndSortingRepository<Fighter,Long> {
}
