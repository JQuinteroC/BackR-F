package com.rappi2.furiosos.CDDBack.service;

import com.rappi2.furiosos.CDDBack.models.Menu;
import com.rappi2.furiosos.CDDBack.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public Menu create(Menu menu){
        return menuRepository.save(menu);
    }

    public Menu update(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu findById(String id){
        Optional<Menu> menu = menuRepository.findById(id);
        return menu.orElse(null);
    }

    public List<Menu> findAll(){
        return menuRepository.findAll();
    }
}
