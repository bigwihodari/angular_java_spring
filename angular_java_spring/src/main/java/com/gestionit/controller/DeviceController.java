package com.gestionit.controller;

import com.gestionit.entities.Device;
import com.gestionit.service.DeviceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
@Tag(name = "Devices", description = "Endpoints pour la gestion des appareils")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @Operation(summary = "Liste des appareils", description = "Récupère la liste de tous les appareils")
    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @Operation(summary = "Ajouter un appareil", description = "Ajouter un appareil")
    @PostMapping("/add")
    public ResponseEntity<Device> addDevice(@RequestBody Device device) {
        Device savedDevice = deviceService.saveDevice(device);
        return new ResponseEntity<>(savedDevice, HttpStatus.CREATED);
    }
}
