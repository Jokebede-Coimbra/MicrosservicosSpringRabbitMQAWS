package com.coimbra.propostaapp.mapper;

import com.coimbra.propostaapp.dto.PropostaRequestDto;
import com.coimbra.propostaapp.entity.Proposta;
import org.mapstruct.Mapper;

@Mapper
public interface PropostaMapper {

    Proposta convertDtoProposta(PropostaRequestDto propostaRequestDto);

}
