package com.example.demo.Service;

import com.example.demo.Modelo.TsscAdmin;

public interface ITsscAdminService {

	public TsscAdmin save(TsscAdmin nuevo);
	public TsscAdmin edit(TsscAdmin editado);
	public void delete(TsscAdmin delete);
}
