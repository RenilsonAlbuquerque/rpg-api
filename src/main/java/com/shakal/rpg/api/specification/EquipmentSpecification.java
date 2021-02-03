package com.shakal.rpg.api.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.shakal.rpg.api.model.equipament.Equipament;

public class EquipmentSpecification {

	public static Specification<Equipament> searchEquipament(String search){
		
		return new Specification<Equipament>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Equipament> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				
				predicates.add( criteriaBuilder.or(criteriaBuilder.like(root.get("name"),"%" + search + "%")));
				return criteriaBuilder.or(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
	}
}
