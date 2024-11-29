/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.pangestu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import me.pangestu.model.ModelMahasiswa;
import me.pangestu.service.MahasiswaService;
import java.util.List;
import org.springframework.stereotype.Controller;


/**
 *
 * @author tri pangestu
 */

@Controller
public class MahasiswaController {
    
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public String addMahasiswa (@RequestBody ModelMahasiswa mhs) {
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa Added Succesfully";
    } 
    
    public ModelMahasiswa getMahasiswa(@PathVariable int id) {
       return mahasiswaService.getMhs(id);
    }
    
    public String upadteMahasiswa(@RequestBody ModelMahasiswa mhs) {
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa Update Succesfully";
    }
    
    public String deleteMahasiswa(@PathVariable int id) {
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa delete Succesfully";
    }
    
    public List<ModelMahasiswa> getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
    }
}
