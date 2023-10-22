package com.example.softwaymedicalcodingtest.service;

import com.example.softwaymedicalcodingtest.entity.ServiceMedical;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniteMedicaleService {

    public List<ServiceMedical> redirigerPatient(Long indexMedical){
        List<ServiceMedical> result = new ArrayList<>();

        if (indexMedical % 3 == 0) {
            result.add(ServiceMedical.CARDIOLOGIE);
        }

        if (indexMedical % 5 == 0) {
            result.add(ServiceMedical.TRAUMATOLOGIE);
        }

        return result;
    }

}
