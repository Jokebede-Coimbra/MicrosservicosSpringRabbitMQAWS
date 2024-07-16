package com.coimbra.propostaapp.service;

import com.coimbra.propostaapp.dto.PropostaRequestDto;
import com.coimbra.propostaapp.dto.PropostaResponseDto;
import com.coimbra.propostaapp.entity.Proposta;
import com.coimbra.propostaapp.mapper.PropostaMapper;
import com.coimbra.propostaapp.repository.PropostaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto resquestDto) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoProposta(resquestDto);
        propostaRepository.save(proposta);

        return PropostaMapper.INSTANCE.convertEntityToDto(proposta);
    }
}
