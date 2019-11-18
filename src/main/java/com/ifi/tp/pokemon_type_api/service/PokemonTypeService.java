package com.ifi.tp.pokemon_type_api.service;

import com.ifi.tp.pokemon_type_api.bo.PokemonType;
import com.ifi.tp.pokemon_type_api.repository.PokemonTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PokemonTypeService {

    PokemonType getPokemonType(int id);
    PokemonType getPokemonTypeFromName(String name);
    List<PokemonType> getAllPokemonTypes();

}