package com.fabricadesitesalterbeach.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabricadesitesalterbeach.dsvendas.dto.SellerDTO;
import com.fabricadesitesalterbeach.dsvendas.entities.Seller;
import com.fabricadesitesalterbeach.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findall(){
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		
	}

}
