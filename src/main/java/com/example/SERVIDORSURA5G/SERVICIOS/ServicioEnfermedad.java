package com.example.SERVIDORSURA5G.SERVICIOS;

import com.example.SERVIDORSURA5G.MODELOS.Enfermedad;
import com.example.SERVIDORSURA5G.REPOSITORIOS.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEnfermedad {
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    public Enfermedad guardarEnfermdad(Enfermedad datosEnfermedad) throws Exception {
        try {
            return iRepositorioEnfermedad.save(datosEnfermedad);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
