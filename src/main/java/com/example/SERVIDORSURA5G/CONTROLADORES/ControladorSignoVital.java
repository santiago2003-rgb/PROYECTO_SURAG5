package com.example.SERVIDORSURA5G.CONTROLADORES;

import com.example.SERVIDORSURA5G.MODELOS.Medicamento;
import com.example.SERVIDORSURA5G.MODELOS.SignoVital;
import com.example.SERVIDORSURA5G.SERVICIOS.ServicioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/signoVital")
public class ControladorSignoVital {
    @Autowired
    ServicioSignoVital servicioSignoVital;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital datos) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioSignoVital.guardarSignoVital(datos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
