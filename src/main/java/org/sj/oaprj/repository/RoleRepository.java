package org.sj.oaprj.repository;

import java.util.List;

import org.sj.oaprj.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {
	Page<Role> findByNameContainingAndDeleteFlag(Pageable page, String name, Integer deleteFlag);
	
	Page<Role> findByDeleteFlag(Pageable page, Integer deleteFlag);
 
	List<Role> findByDeleteFlag(Integer deleteFlag);
	
	List<Role> findByIdIn(List<Long> ids);

	List<Role> findByName(String name);
 
}
