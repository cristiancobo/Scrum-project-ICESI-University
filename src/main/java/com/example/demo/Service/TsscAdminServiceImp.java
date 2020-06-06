package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelo.TsscAdmin;
import com.example.demo.Repository.IAdminRepository;



@Service
public class TsscAdminServiceImp implements ITsscAdminService{
	
	
	private IAdminRepository adminRepository;
	
	@Autowired
	public TsscAdminServiceImp(IAdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}

	@Override
	public TsscAdmin save(TsscAdmin nuevo) {
		return adminRepository.save(nuevo);
	}

	@Override
	public TsscAdmin edit(TsscAdmin editado) {
		return adminRepository.save(editado);
	}

	@Override
	public void delete(TsscAdmin delete) {
		adminRepository.delete(delete);
	}
	
	

}
